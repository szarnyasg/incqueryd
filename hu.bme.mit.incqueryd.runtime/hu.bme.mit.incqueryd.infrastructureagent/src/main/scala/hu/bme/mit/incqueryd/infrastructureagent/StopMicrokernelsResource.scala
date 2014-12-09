package hu.bme.mit.incqueryd.infrastructureagent

import com.codahale.metrics.annotation.Timed
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.Response
import javax.ws.rs.core.MediaType

@Path("/stop")
@Produces(Array(MediaType.APPLICATION_JSON))
class StopMicrokernelsResource {

  @GET
  @Timed
  def execute(): Response = {
    Response.ok.build // TODO
  }

}
