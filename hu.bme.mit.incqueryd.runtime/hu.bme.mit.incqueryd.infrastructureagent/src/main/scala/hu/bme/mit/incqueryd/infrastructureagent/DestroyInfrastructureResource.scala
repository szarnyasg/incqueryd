package hu.bme.mit.incqueryd.infrastructureagent

import com.codahale.metrics.annotation.Timed
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.Response
import javax.ws.rs.core.MediaType
import eu.mondo.utils.UnixUtils
import scala.collection.JavaConversions._
import hu.bme.mit.incqueryd.actorservice.LocalActorService
import hu.bme.mit.incqueryd.coordinator.client.Coordinator
import javax.ws.rs.QueryParam
import hu.bme.mit.incqueryd.infrastructureagent.client.DefaultInfrastructureAgent._
import upickle._
import hu.bme.mit.incqueryd.inventory.Inventory
import hu.bme.mit.incqueryd.actorservice.AkkaUtils
import akka.actor.PoisonPill

@Path(DestroyInfrastructure.path)
@Produces(Array(MediaType.APPLICATION_JSON))
class DestroyInfrastructureResource {

  @GET
  @Timed
  def execute(@QueryParam(inventoryParameter) inventoryJson: String, @QueryParam(currentIpParameter) currentIp: String): Response = {
    val inventory = read[Inventory](inventoryJson)
    val isMaster = inventory.master.ip == currentIp
    if (isMaster) {
      stopCoordinator(currentIp)
    }
    Response.ok.build 
  }
  
  private def stopCoordinator(currentIp: String) {
    AkkaUtils.findActor(Coordinator.actorId(currentIp)) ! PoisonPill
  }

}
