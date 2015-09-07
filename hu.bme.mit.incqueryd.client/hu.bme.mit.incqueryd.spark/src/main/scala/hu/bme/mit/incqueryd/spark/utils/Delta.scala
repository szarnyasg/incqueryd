package hu.bme.mit.incqueryd.spark.utils

import hu.bme.mit.incqueryd.engine.rete.dataunits.ChangeType
import akka.actor.ActorPath

trait Delta {
  def inputActorPath: ActorPath
  def changeType: ChangeType 
}
case class VertexDelta(inputActorPath: ActorPath, changeType: ChangeType, vertexId: String) extends Delta
case class EdgeDelta(inputActorPath: ActorPath, changeType: ChangeType, subjectId: String, objectId: String) extends Delta
case class AttributeDelta(inputActorPath: ActorPath, changeType: ChangeType, subjectId: String, objectValue: Object) extends Delta