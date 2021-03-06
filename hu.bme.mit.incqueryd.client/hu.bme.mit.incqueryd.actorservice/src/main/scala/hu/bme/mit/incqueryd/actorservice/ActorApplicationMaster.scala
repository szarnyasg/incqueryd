package hu.bme.mit.incqueryd.actorservice

import java.util.Collections
import org.apache.hadoop.fs.Path
import org.apache.hadoop.yarn.api.ApplicationConstants
import org.apache.hadoop.yarn.api.records._
import org.apache.hadoop.yarn.client.api.AMRMClient.ContainerRequest
import org.apache.hadoop.yarn.client.api.{ AMRMClient, NMClient }
import org.apache.hadoop.yarn.conf.YarnConfiguration
import org.apache.hadoop.yarn.util.Records
import scala.collection.JavaConverters._
import org.apache.hadoop.fs.FileSystem
import hu.bme.mit.incqueryd.yarn.AdvancedYarnClient
import org.apache.hadoop.yarn.api.records.ContainerLaunchContext
import org.apache.hadoop.yarn.api.records.Priority
import org.apache.hadoop.yarn.api.records.Resource
import org.apache.commons.cli.Options
import org.apache.commons.cli.PosixParser

object ActorApplicationMaster {
  
  val options = new Options
  options.addOption("jarpath", true, "JAR path")
  options.addOption("zkpath", true, "ZooKeeper path belongs to the actor")
  options.addOption("actorname", true, "The name of the Actor")
  options.addOption("actorclass", true, "The class name of the Actor")
  options.addOption("memory", true, "Requested memory in MB")
  options.addOption("cpu", true, "Requested CPU cores")
  
  def main(args: Array[String]) {
    val parser = (new PosixParser).parse(options, args)
    val jarPath = parser.getOptionValue("jarpath")
    val memory_mb = parser.getOptionValue("memory")
    val cpu_cores = parser.getOptionValue("cpu")
    val zkActorPath = parser.getOptionValue("zkpath")
    val actorName = parser.getOptionValue("actorname")
    val actorClassName = parser.getOptionValue("actorclass")

    val applicationClassName = "hu.bme.mit.incqueryd.actorservice.server.ActorApplication" // XXX duplicated class name to avoid dependency on runtime
    
    // Create new YARN configuration
    implicit val conf = new YarnConfiguration()
    
    conf.set(YarnConfiguration.RM_SCHEDULER_MAXIMUM_ALLOCATION_MB, memory_mb)
    // Create a client to talk to the RM
    val rmClient = AMRMClient.createAMRMClient().asInstanceOf[AMRMClient[ContainerRequest]]

    // Initialize YARN client with configuration
    rmClient.init(conf)

    // Start YARN client
    rmClient.start()

    /*
     * Register ApplicationMaster(appHostName, appHostPort, appTrackingURL)
     */
    rmClient.registerApplicationMaster("", 0, "")

    //create a client to talk to NM
    val nmClient = NMClient.createNMClient()
    nmClient.init(conf)
    nmClient.start()

    // set priority
    val priority = Records.newRecord(classOf[Priority])
    priority.setPriority(0)

    //resources needed by each Actor
    val resource = Records.newRecord(classOf[Resource])
    resource.setMemory(new Integer(memory_mb))
    resource.setVirtualCores(new Integer(cpu_cores))
    
    val containerRequest = new ContainerRequest(resource, null, null, priority, true)
    rmClient.addContainerRequest(containerRequest)

    var responseId = 0
    var completedContainers = 0
    
    while (completedContainers < 1) {
      
      val appMasterJar = AdvancedYarnClient.setUpLocalResource(new Path(jarPath), FileSystem.get(conf))

      val env = AdvancedYarnClient.setUpEnv(conf, false)

      val response = rmClient.allocate(responseId + 1)
      responseId += 1
      
      for (container <- response.getAllocatedContainers.asScala) {
        
        val ctx = Records.newRecord(classOf[ContainerLaunchContext])

        ctx.setCommands(
            List(
              s"$$JAVA_HOME/bin/java -Xmx${memory_mb}m -XX:MaxPermSize=${memory_mb}m -XX:MaxDirectMemorySize=${memory_mb}m $applicationClassName $zkActorPath $actorName $actorClassName " + 
                " 1>" + ApplicationConstants.LOG_DIR_EXPANSION_VAR + "/stdout" +
                " 2>" + ApplicationConstants.LOG_DIR_EXPANSION_VAR + "/stderr").asJava)
        ctx.setLocalResources(Collections.singletonMap("appMaster.jar", appMasterJar))
        ctx.setEnvironment(env)

        System.out.println("Launching container " + container)
        nmClient.startContainer(container, ctx) 
      }

      for (status <- response.getCompletedContainersStatuses.asScala) {
        println("Completed container " + status.getContainerId)
        completedContainers += 1
      }

      Thread.sleep(100)
    }
    rmClient.unregisterApplicationMaster(FinalApplicationStatus.SUCCEEDED, "", "")
    rmClient.stop()
  }

}
