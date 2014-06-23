// Global variables
var labelType, useGradients, nativeTextSupport, animate;
var graph; // The grap object used for representing the system components in a graph structure
var rete_graph; // The grap object used for representing the Rete node in a graph structure
var heatmap; // The heatmap object to draw
var tm; // The treemap object for the heatmap visualization
var selectedNode; // The selected node to draw heatmap for
var fd;
var fd_rete;
var jsonData; // The JSON data we get from the server
var images; // Store the images

(function () {
    var ua = navigator.userAgent,
        iStuff = ua.match(/iPhone/i) || ua.match(/iPad/i),
        typeOfCanvas = typeof HTMLCanvasElement,
        nativeCanvasSupport = (typeOfCanvas == 'object' || typeOfCanvas == 'function'),
        textSupport = nativeCanvasSupport
          && (typeof document.createElement('canvas').getContext('2d').fillText == 'function');
    //I'm setting this based on the fact that ExCanvas provides text support for IE
    //and that as of today iPhone/iPad current text support is lame
    labelType = (!nativeCanvasSupport || (textSupport && !iStuff)) ? 'Native' : 'HTML';
    nativeTextSupport = labelType == 'Native';
    useGradients = nativeCanvasSupport;
    animate = !(iStuff || !nativeCanvasSupport);
})();

// Own node types and edge types **********************************************

// Node visualized with an image
$jit.ForceDirected.Plot.NodeTypes.implement({
    'image': {
        'render': function (node, canvas) {
            var ctx = canvas.getCtx();
            var pos = node.pos.getc(true);
            if (node.getData('image') != 0) {
                var img = node.getData('image');
                ctx.drawImage(img, pos.x - 15, pos.y - 15);
            }
        },
        'contains': function (node, pos) {
            var npos = node.pos.getc(true);
            //dim = node.getData('dim');
            var width = node.getData('width');
            var height = node.getData('height');
            var npos2 = {};
            npos2.x = npos.x + 25;
            npos2.y = npos.y + 25;
            return this.nodeHelper.rectangle.contains(npos2, pos, width, height);
        }
    }
});

$jit.ForceDirected.Plot.NodeTypes.implement({
    'beta': {
        'render': function (node, canvas) {
            var pos = node.pos.getc(true);
            this.nodeHelper.rectangle.render('fill', pos, 80, 30, canvas);
            this.nodeHelper.triangle.render('fill', { x: pos.x - 20, y: pos.y - 25 }, 10, canvas);
            this.nodeHelper.triangle.render('fill', { x: pos.x + 20, y: pos.y - 25 }, 10, canvas);
        },
        'contains': function (node, pos) {
            var npos = node.pos.getc(true);
            return this.nodeHelper.rectangle.contains(npos, pos, 40, 80);
        }
    }
});

// Directed edge with label placed on it
$jit.ForceDirected.Plot.EdgeTypes.implement({
    'label-arrow-line': {
        'render': function (adj, canvas) {

            //plot arrow edge
            //this.edgeTypes.arrow.render.call(this, adj, canvas);

            var from = adj.nodeFrom.pos.getc(true),
            to = adj.nodeTo.pos.getc(true),
            dim = adj.getData('dim'),
            direction = adj.data.$direction,
            inv = (direction && direction.length > 1 && direction[0] != adj.nodeFrom.id);

            var deltaX;
            var deltaY;
            if (adj.data.slot == "PRIMARY") {
                deltaX = -20;
                deltaY = -30;
            }
            else if (adj.data.slot == "SECONDARY") {
                deltaX = 20;
                deltaY = -30;
            }
            else {
                deltaX = 0;
                deltaY = -10;
            }
            
            if (inv) {
                var from2 = {};
                from2.y = from.y + deltaY;
                from2.x = from.x + deltaX;
                this.edgeHelper.arrow.render(from2, to, dim, inv, canvas);
            } else {
                var to2 = {};
                to2.y = to.y + deltaY;
                to2.x = to.x + deltaX;;
                this.edgeHelper.arrow.render(from, to2, dim, inv, canvas);
            }
            
            //get nodes cartesian coordinates
            var pos = adj.nodeFrom.pos.getc(true);
            var posChild = adj.nodeTo.pos.getc(true);

            //check for edge label in data
            var data = adj.data;
            if (data.labeltext) {
                var x2 = Math.max(pos.x, posChild.x);
                var x1 = Math.min(pos.x, posChild.x);
                var y2 = Math.max(pos.y, posChild.y);
                var y1 = Math.min(pos.y, posChild.y);

                var posy = y2 - (y2 - y1) / 2;
                var posx = x2 - (x2 - x1) / 2;

                var ctx = canvas.getCtx();
                ctx.font = "10pt Arial";
                ctx.fillText(data.labeltext, posx, posy);

            }
        },
        'contains': function (adj, pos) {
            return this.edgeHelper.line.contains(adj.nodeFrom.pos, adj.nodeTo.pos, pos, 30);
        }

    }
});

// End of node types and edge types **********************************************

// Update the data from the new query
function update(object) {

    if (jsonData != null) delete jsonData;
    jsonData = object;

    if (!hasSystemChanged()) {
        setDataForSelectedNode();
        updateHeatMap();
    }
    // anyway if changed redraw the system, delete the heatmap
    else {
        $jit.id('infovis').innerHTML = "";
        $jit.id('heatmap').innerHTML = "";

        $jit.id('infovis-rete').innerHTML = "";

        if (graph != null) delete graph;
        graph = [];

        if (rete_graph != null) delete rete_graph;
        rete_graph = [];

        drawSystem();
        drawReteNet();
    }
    
}

// Heatmap related things **********************************************
// Initialize and draw heatmap object
function drawHeatMap() {

    heatmap = {};
    heatmap.data = {};
    heatmap.name = "Heatmap of OS-level resource usages";
    
    // if the selected node is a host computer
    if (selectedNode.data.nodetype == "machine") {
        hostHeatMap();
    }

    $jit.id('heatmap').innerHTML = "";

    tm = new $jit.TM.Squarified({
        //where to inject the visualization
        injectInto: 'heatmap',
        //no parent frames
        titleHeight: 20,
        //enable animations
        animate: animate,
        //no box offsets
        offset: 1,
        //duration of the animation
        duration: 1500,

        //Add the name of the node in the correponding label
        //This method is called once, on label creation.
        onCreateLabel: function (domElement, node) {

            var html = node.name;
            if (node.data.value != null) {
                html += "<div style=\"width: 100px;height: 30px;text-align: center;margin: auto;position: absolute;top: 0;left: 0;bottom: 0;right: 0;\">" + node.data.value +"</div>";
            }
            
            domElement.innerHTML = html;

            var style = domElement.style;
            style.color = "#ffffff";
            style.display = '';
            style.cursor = 'default';
            style.border = '1px solid transparent';
            style.textAlign = "center";
            style.verticalAlign = "bottom";
            style.fontFamily = "Impact,Charcoal,sans-serif";
            style.fontSize = "medium";

            domElement.onmouseover = function () {
                style.border = '2px solid #0000FF';
            };
            domElement.onmouseout = function () {
                style.border = '1px solid transparent';
            };
        }
    });

    tm.loadJSON(heatmap);
    tm.refresh();

}

// Update the heat map with the new measurement data from the server 
function updateHeatMap() {

    // How to update for a host
    if (selectedNode.data.nodetype == "machine") {
        hostHeatMap();
    }

    // Set aniamtion duration to 0 and refresh the new data to the heatmap visualization treemap
    tm.config.duration = 0;
    tm.loadJSON(heatmap);
    tm.refresh();

}

// How to draw the heatmap of host resources
function hostHeatMap() {

    // Clear the previous data
    delete heatmap.children;
    heatmap.children = [];

    // CPU part
    var cpu = {};
    cpu.name = "CPU Usage";
    cpu.id = selectedNode.id + "_cpu";
    cpu.data = {};
    cpu.data.$area = 200;
    cpu.children = [];

    var cpuUsage = {};
    cpuUsage.name = "CPU utilization";
    cpuUsage.id = selectedNode.id + "_cpuusage";
    cpuUsage.data = {};
    cpuUsage.data.$area = 200;
    cpuUsage.data.$color = percentToColor(selectedNode.data.os.cpuUsage.usedCPUPercent);
    cpuUsage.data.value = (truncateDecimals(selectedNode.data.os.cpuUsage.usedCPUPercent * 100) / 100) + " %";

    cpu.children.push(cpuUsage);

    heatmap.children.push(cpu);

    // Memory part
    var memory = {};
    memory.name = "Memory Usage";
    memory.id = selectedNode.id + "_memory";
    memory.data = {};
    memory.data.$area = 600;
    memory.children = [];

    var totalMemory = {};
    totalMemory.name = "Total available memory";
    totalMemory.id = selectedNode.id + "_totalmemory";
    totalMemory.data = {};
    totalMemory.data.$area = 200;
    totalMemory.data.$color = "#0000ff";
    totalMemory.data.value = (truncateDecimals(selectedNode.data.os.memoryUsage.totalMemory * 100) / 100) + " GB";

    memory.children.push(totalMemory);

    var usedMemory = {};
    usedMemory.name = "Used memory";
    usedMemory.id = selectedNode.id + "_usedmemory";
    usedMemory.data = {};
    usedMemory.data.$area = 200;
    usedMemory.data.$color = percentToColor(selectedNode.data.os.memoryUsage.usedMemoryPercent);
    usedMemory.data.value = (truncateDecimals(selectedNode.data.os.memoryUsage.usedMemoryPercent * 100) / 100) + " %<br/>(" +
        (truncateDecimals(selectedNode.data.os.memoryUsage.usedMemory * 100) / 100) + " GB)";

    memory.children.push(usedMemory);

    var freeMemory = {};
    freeMemory.name = "Free memory";
    freeMemory.id = selectedNode.id + "_freememory";
    freeMemory.data = {};
    freeMemory.data.$area = 200;
    freeMemory.data.$color = percentToColor(100 - selectedNode.data.os.memoryUsage.freeMemoryPercent);
    freeMemory.data.value = (truncateDecimals(selectedNode.data.os.memoryUsage.freeMemoryPercent * 100) / 100) + " %<br/>(" +
        (truncateDecimals(selectedNode.data.os.memoryUsage.freeMemory * 100) / 100) + " GB)";

    memory.children.push(freeMemory);

    heatmap.children.push(memory);

    // Disk I/O part
    var disks = {};
    disks.name = "Disk Usage";
    disks.id = selectedNode.id + "_disk";
    disks.data = {};
    disks.data.$area = selectedNode.data.os.diskUsages.length * 500;
    disks.children = [];

    // Add each disks
    for (var i = 0; i < selectedNode.data.os.diskUsages.length; i++) {
        var diskUsage = selectedNode.data.os.diskUsages[i];

        var disk = {};
        disk.name = "Usage of " + diskUsage.name;
        disk.id = selectedNode.id + "_disk" + i;
        disk.data = {};
        disk.data.$area = 500;
        disk.children = [];

        var diskQueue = {};
        diskQueue.name = "Disk queue";
        diskQueue.id = disk.id + "_queue";
        diskQueue.data = {};
        diskQueue.data.$area = 100;
        diskQueue.data.$color = percentToColor(Math.min((diskUsage.diskQueue / 10) * 100, 100));
        diskQueue.data.value = truncateDecimals(diskUsage.diskQueue * 100) / 100;

        disk.children.push(diskQueue);

        var diskReads = {};
        diskReads.name = "Disk reads";
        diskReads.id = disk.id + "_reads";
        diskReads.data = {};
        diskReads.data.$area = 100;
        diskReads.data.$color = percentToColor(Math.min((diskUsage.diskReads / 300) * 100, 100));
        diskReads.data.value = truncateDecimals(diskUsage.diskReads * 100) / 100;

        disk.children.push(diskReads);

        var diskWrites = {};
        diskWrites.name = "Disk writes";
        diskWrites.id = disk.id + "_writes";
        diskWrites.data = {};
        diskWrites.data.$area = 100;
        diskWrites.data.$color = percentToColor(Math.min((diskUsage.diskWrites / 150) * 100, 100));
        diskWrites.data.value = truncateDecimals(diskUsage.diskWrites * 100) / 100;

        disk.children.push(diskWrites);

        var diskReadBytes = {};
        diskReadBytes.name = "Disk bytes read";
        diskReadBytes.id = disk.id + "_readbytes";
        diskReadBytes.data = {};
        diskReadBytes.data.$area = 100;
        diskReadBytes.data.$color = percentToColor(Math.min((diskUsage.diskReadBytes / 3000000) * 100, 100));
        diskReadBytes.data.value = (truncateDecimals(diskUsage.diskReadBytes * 100) / 100) + " Byte/sec";

        disk.children.push(diskReadBytes);

        var diskWriteBytes = {};
        diskWriteBytes.name = "Disk bytes written";
        diskWriteBytes.id = disk.id + "_writebytes";
        diskWriteBytes.data = {};
        diskWriteBytes.data.$area = 100;
        diskWriteBytes.data.$color = percentToColor(Math.min((diskUsage.diskWriteBytes / 1500000) * 100, 100));
        diskWriteBytes.data.value = (truncateDecimals(diskUsage.diskWriteBytes * 100) / 100) + " Byte/sec";

        disk.children.push(diskWriteBytes);

        disks.children.push(disk);
    }

    heatmap.children.push(disks);

    // Network I/O part
    var network = {};
    network.name = "Network Usage";
    network.id = selectedNode.id + "_network";
    network.data = {};
    network.data.$area = selectedNode.data.os.netUsages.length * 500;
    network.children = [];

    for (var i = 0; i < selectedNode.data.os.netUsages.length; i++) {
        var netUsage = selectedNode.data.os.netUsages[i];

        var net = {};
        net.name = "Usage of " + netUsage.name + " (" + netUsage.address + ")";
        net.id = selectedNode.id + "_net" + i;
        net.data = {};
        net.data.$area = 500;
        net.children = [];

        var rxTraffic = {};
        rxTraffic.name = "RX Traffic";
        rxTraffic.id = net.id + "_rxtraffic";
        rxTraffic.data = {};
        rxTraffic.data.$area = 100;
        rxTraffic.data.$color = percentToColor(Math.min((netUsage.rxTraffic / 200) * 100, 100));
        rxTraffic.data.value = (truncateDecimals(netUsage.rxTraffic * 100) / 100) + " Kbit/sec";

        net.children.push(rxTraffic);

        var rxPackets = {};
        rxPackets.name = "RX Packets";
        rxPackets.id = net.id + "_rxpackets";
        rxPackets.data = {};
        rxPackets.data.$area = 100;
        rxPackets.data.$color = percentToColor(Math.min((netUsage.rxPackets / 200) * 100, 100));
        rxPackets.data.value = (truncateDecimals(netUsage.rxPackets * 100) / 100) + " Packets";

        net.children.push(rxPackets);

        var txTraffic = {};
        txTraffic.name = "TX Traffic";
        txTraffic.id = net.id + "_txtraffic";
        txTraffic.data = {};
        txTraffic.data.$area = 100;
        txTraffic.data.$color = percentToColor(Math.min((netUsage.txTraffic / 200) * 100, 100));
        txTraffic.data.value = (truncateDecimals(netUsage.txTraffic * 100) / 100) + " Kbit/sec";

        net.children.push(txTraffic);

        var txPackets = {};
        txPackets.name = "TX Packets";
        txPackets.id = net.id + "_txpackets";
        txPackets.data = {};
        txPackets.data.$area = 100;
        txPackets.data.$color = percentToColor(Math.min((netUsage.txPackets / 200) * 100, 100));
        txPackets.data.value = (truncateDecimals(netUsage.txPackets * 100) / 100) + " Packets";

        net.children.push(txPackets);

        network.children.push(net);

    }

    heatmap.children.push(network);
}


// Functions for heat map conversions

function percentToColor(percent) {
    if (percent >= 50) {
        return rgbToHex(255, Math.round(((1 - (percent / 100)) * 255)), 0);
    }
    if (percent <= 15) {
        return rgbToHex(0, Math.round((percent / 15) * 32) + 192, Math.round(((1 - (percent / 15)) * 240)));
    }
    return rgbToHex(Math.round(((percent - 15) / 35) * 224) + 31, Math.round(((1 - ((percent-15) / 35)) * 31)) + 200, 0);
}

// Functions to convert rgb values to hexa strings
function componentToHex(c) {
    var hex = c.toString(16);
    return hex.length == 1 ? "0" + hex : hex;
}

function rgbToHex(r, g, b) {
    return "#" + componentToHex(r) + componentToHex(g) + componentToHex(b);
}

truncateDecimals = function (number) {
    return Math[number < 0 ? 'ceil' : 'floor'](number);
};
// End of Heatmap related things **********************************************


// Check if the system structure has changed since the previous query
function hasSystemChanged() {

    if (graph == null) return true; // That's the first query, sure redraw then
   
    var numberOfMachines = 0; // To count how many server machines we had previously
    for (var j = 0; j < graph.length; j++) {
        if (graph[j].data.nodetype == "machine") {
            numberOfMachines++;
        }
    }

    var hostsFound = 0; // To count how many we found of them
    for (var i = 0; i < jsonData.machines.length; i++) {

        // Check if server machines were changed
        var found = false;
        for (var j = 0; j < graph.length; j++) {
            if (jsonData.machines[i].host == graph[j].id) {
                found = true;
                hostsFound++;
                break;
            }
        }
        if (!found) return true; // If we couldn't find the machine then return true

    }

    if (numberOfMachines != hostsFound) return true;

    return false; // Every component was found from previous query, the system hasn't changed sicne then

}

// Drawing the system as a graph
function drawSystem() {

    var node = {};
    node.data = {};
    node.adjacencies = [];
    node.data.$color = "#83548B";
    node.data.$type = "circle";
    node.id = "graphnode0";
    node.name = "";

    graph.push(node);

    for (var i = 0; i < jsonData.machines.length; i++) {
        var node = {};
        node.data = {};
        node.adjacencies = [];
        var adj = {};
        adj.nodeTo = "graphnode0";
        adj.nodeFrom = jsonData.machines[i].host;
        node.adjacencies.push(adj);
        node.data.$type = "image";
        node.id = jsonData.machines[i].host;
        node.name = jsonData.machines[i].host;
        node.data.nodetype = "machine";

        graph.push(node);
    }

    // init ForceDirected
    fd = new $jit.ForceDirected({
        //id of the visualization container
        injectInto: 'infovis',
        //Enable zooming and panning
        //with scrolling and DnD
        width: 1024,
        height: 900,
        Navigation: {
            enable: true,
            type: 'Native',
            //Enable panning events only if we're dragging the empty
            //canvas (and not a node).
            panning: 'avoid nodes',
            zooming: 10 //zoom speed. higher is more sensible
        },
        // Change node and edge styles such as
        // color and width.
        // These properties are also set per node
        // with dollar prefixed data-properties in the
        // JSON structure.
        Node: {
            overridable: true,
            dim: 7
        },
        Edge: {
            overridable: true,
            type: 'line',
            color: '#23A4FF',
            lineWidth: 4
        },
        // Add node events
        Events: {
            enable: true,
            enableForEdges: true,
            type: 'Native',
            //Change cursor style when hovering a node
            onMouseEnter: function () {
                fd.canvas.getElement().style.cursor = 'move';
            },
            onMouseLeave: function () {
                fd.canvas.getElement().style.cursor = '';
            },
            //Update node positions when dragged
            onDragMove: function (node, eventInfo, e) {
                var pos = eventInfo.getPos();
                node.pos.setc(pos.x, pos.y);
                fd.plot();
            },
            //Implement the same handler for touchscreens
            onTouchMove: function (node, eventInfo, e) {
                $jit.util.event.stop(e); //stop default touchmove event
                this.onDragMove(node, eventInfo, e);
            },
            onClick: function (node, eventInfo, e) {
                if (!node) return;
                if (node.nodeFrom) {
                    console.log("target is an edge");
                } else {
                    console.log("target is a node");
                }
            }
        },
        //Number of iterations for the FD algorithm
        iterations: 200,
        //Edge length
        levelDistance: 130,
        // This method is only triggered
        // on label creation and only for DOM labels (not native canvas ones).
        onCreateLabel: function (domElement, node) {
            // Create a 'name' and 'close' buttons and add them
            // to the main node label
            var nameContainer = document.createElement('span'),
                style = nameContainer.style;
            nameContainer.className = 'name';
            nameContainer.innerHTML = node.name;
            domElement.appendChild(nameContainer);
            style.fontSize = "1.2em";
            style.color = "#ddd";

            //Toggle a node selection when clicking
            //its name. This is done by animating some
            //node styles like its dimension and the color
            //and lineWidth of its adjacencies.
            nameContainer.onclick = function () {
                //set final styles
                fd.graph.eachNode(function (n) {
                    if (n.id != node.id) delete n.selected;
                    n.setData('dim', 7, 'end');
                    n.eachAdjacency(function (adj) {
                        adj.setDataset('end', {
                            lineWidth: 1.0,
                            color: '#23a4ff'
                        });
                    });
                });
                if (!node.selected) {
                    node.selected = true;
                    node.setData('dim', 17, 'end');
                    node.eachAdjacency(function (adj) {
                        adj.setDataset('end', {
                            lineWidth: 3,
                            color: '#ff0000'
                        });
                    });
                } else {
                    delete node.selected;
                }
                //trigger animation to final styles
                fd.fx.animate({
                    modes: ['node-property:dim',
                            'edge-property:lineWidth:color'],
                    duration: 500
                });
                
                if (selectedNode) delete selectedNode;
                selectedNode = node;
                setDataForSelectedNode();
                drawHeatMap(); // draw the heat map for the selected node

            };
        },
        // Change node styles when DOM labels are placed
        // or moved.
        onPlaceLabel: function (domElement, node) {
            var style = domElement.style;
            var left = parseInt(style.left);
            var top = parseInt(style.top);
            var w = domElement.offsetWidth;
            style.left = (left - w / 2) + 'px';
            style.top = (top - 32) + 'px';
            style.display = '';
        }
    });
    // load JSON data.
    fd.loadJSON(graph);

    //load images
    fd.graph.eachNode(function (node) {
        if (node.getData('type') == 'image') {
            if (node.data.nodetype == "machine") {
                var image = images["server"];
                node.setData('image', image); // store this image object in node
                node.setData('height', image.height);
                node.setData('width', image.width);
            }
        }
    });


    // compute positions incrementally and animate.
    fd.computeIncremental({
        iter: 40,
        property: 'end',
        onStep: function (perc) {

        },
        onComplete: function () {

            fd.animate({
                modes: ['linear'],
                transition: $jit.Trans.Elastic.easeOut,
                duration: 2500
            });
        }
    });
    // end
}

// Set the measurement data from the server for the user selected node
function setDataForSelectedNode() {

    if (selectedNode.data.nodetype == "machine") {
        for (var i = 0; i < jsonData.machines.length; i++) {
            if (jsonData.machines[i].host == selectedNode.id) {
                selectedNode.data.os = jsonData.machines[i].os;
            }
        }
    }

}

// Rete network visualization functions ***************************************************
// Drawing the system as a graph
function drawReteNet() {

    for (var i = 0; i < jsonData.rete.length; i++) {
        var reteNode = jsonData.rete[i];

        var node = {};
        node.data = {};

        node.adjacencies = [];

        if (reteNode.nodeClass == "Alpha") {
            node.data.$type = "rectangle";
            node.data.$color = "red";
        }
        else if(reteNode.nodeClass == "Beta"){
            node.data.$type = "beta";
            node.data.$color = "red";
        }
        else {
            node.data.$type = "circle";
            node.data.$dim = 10;
        }

        node.id = reteNode.reteNode;
        node.name = reteNode.nodeType + " " + reteNode.reteNode + " on " + reteNode.hostName;
        node.data.nodetype = "rete";

        for (var j = 0; j < reteNode.subscribers.length; j++) {
            var subsciber = reteNode.subscribers[j];

            var edge = {};
            edge.nodeTo = subsciber.reteNode;
            edge.nodeFrom = reteNode.reteNode;
            edge.data = {};
            edge.data.$type = 'label-arrow-line';
            edge.data.$direction = [];
            edge.data.$direction.push(reteNode.reteNode);
            edge.data.$direction.push(subsciber.reteNode);
            edge.data.labeltext = "Updates:" + reteNode.updateMessagesSent + "/Changes:" + reteNode.changesCount;
            edge.data.slot = subsciber.slot;

            node.adjacencies.push(edge);
        }

        rete_graph.push(node);
    }

    // init ForceDirected
    fd_rete = new $jit.ForceDirected({
        //id of the visualization container
        injectInto: 'infovis-rete',
        //Enable zooming and panning
        //with scrolling and DnD
        width: 1024,
        height: 900,
        Navigation: {
            enable: true,
            type: 'Native',
            //Enable panning events only if we're dragging the empty
            //canvas (and not a node).
            panning: 'avoid nodes',
            zooming: 10 //zoom speed. higher is more sensible
        },
        // Change node and edge styles such as
        // color and width.
        // These properties are also set per node
        // with dollar prefixed data-properties in the
        // JSON structure.
        Node: {
            overridable: true,
            dim: 7
        },
        Edge: {
            overridable: true,
            type: 'line',
            color: '#23A4FF',
            lineWidth: 4
        },
        // Add node events
        Events: {
            enable: true,
            enableForEdges: true,
            type: 'Native',
            //Change cursor style when hovering a node
            onMouseEnter: function () {
                fd_rete.canvas.getElement().style.cursor = 'move';
            },
            onMouseLeave: function () {
                fd_rete.canvas.getElement().style.cursor = '';
            },
            //Update node positions when dragged
            onDragMove: function (node, eventInfo, e) {
                var pos = eventInfo.getPos();
                node.pos.setc(pos.x, pos.y);
                fd_rete.plot();
            },
            //Implement the same handler for touchscreens
            onTouchMove: function (node, eventInfo, e) {
                $jit.util.event.stop(e); //stop default touchmove event
                this.onDragMove(node, eventInfo, e);
            }
        },
        //Number of iterations for the FD algorithm
        iterations: 200,
        //Edge length
        levelDistance: 130,
        // This method is only triggered
        // on label creation and only for DOM labels (not native canvas ones).
        onCreateLabel: function (domElement, node) {
            // Create a 'name' and 'close' buttons and add them
            // to the main node label
            var nameContainer = document.createElement('span'),
                style = nameContainer.style;
            nameContainer.className = 'name';
            nameContainer.innerHTML = node.name;
            domElement.appendChild(nameContainer);
            style.fontSize = "1.2em";
            style.color = "#ddd";

        },
        // Change node styles when DOM labels are placed
        // or moved.
        onPlaceLabel: function (domElement, node) {
            var style = domElement.style;
            var left = parseInt(style.left);
            var top = parseInt(style.top);
            var w = domElement.offsetWidth;
            style.left = (left - w / 2) + 'px';
            style.top = (top - 32) + 'px';
            style.display = '';
        }
    });
    // load JSON data.
    fd_rete.loadJSON(rete_graph);

    // compute positions incrementally and animate.
    fd_rete.computeIncremental({
        iter: 40,
        property: 'end',
        onStep: function (perc) {

        },
        onComplete: function () {

            fd_rete.animate({
                modes: ['linear'],
                transition: $jit.Trans.Elastic.easeOut,
                duration: 2500
            });
        }
    });
    // end
}

// Other things **********************************************

// Load the images when the document is ready
function loadImages() {
    var serverImage = new Image();
    serverImage.src = "server-icon.png";

    images = {
        server: serverImage
    };
}