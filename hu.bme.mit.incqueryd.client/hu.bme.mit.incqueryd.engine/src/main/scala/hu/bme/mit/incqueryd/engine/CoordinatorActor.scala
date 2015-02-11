package hu.bme.mit.incqueryd.engine

import akka.actor.Actor
import eu.mondo.driver.file.FileGraphDriverRead
import hu.bme.mit.incqueryd.inventory.{ MachineInstance, Inventory }
import org.eclipse.emf.ecore.util.EcoreUtil
import org.openrdf.model.vocabulary.{ OWL, RDF, RDFS }
import org.openrdf.model.{ Model, URI }
import scala.collection.JavaConversions._
import scala.collection.mutable.ListBuffer
import hu.bme.mit.incqueryd.inventory.MachineInstance
import scala.collection.JavaConverters._
import java.util.ArrayList
import hu.bme.mit.incqueryd.actorservice.AkkaUtils
import hu.bme.mit.incqueryd.actorservice.ActorId
import hu.bme.mit.incqueryd.actorservice.RemoteActorService
import java.security.MessageDigest
import org.apache.commons.codec.digest.DigestUtils
import hu.bme.mit.incqueryd.engine.rete.actors.ReteActor
import org.eclipse.incquery.runtime.rete.recipes.ReteRecipe
import org.eclipse.incquery.runtime.rete.recipes.ReteNodeRecipe
import org.eclipse.incquery.runtime.rete.recipes.RecipesFactory
import scala.collection.mutable
import hu.bme.mit.incqueryd.inventory.MachineInstance
import org.openrdf.model.Statement
import org.openrdf.model.Resource
import org.eclipse.incquery.runtime.rete.recipes.ProductionRecipe
import org.eclipse.incquery.runtime.matchers.psystem.queries.PQuery
import hu.bme.mit.incqueryd.engine.util.RecipeDeserializer
import org.eclipse.incquery.runtime.rete.recipes.TypeInputRecipe
import akka.actor.ActorRef
import akka.actor.PoisonPill
import hu.bme.mit.incqueryd.engine.util.ReteNodeConfiguration
import hu.bme.mit.incqueryd.engine.util.EObjectSerializer
import akka.pattern.ask
import akka.util.Timeout
import akka.dispatch.Futures
import scala.concurrent.Future
import scala.concurrent.Await

object CoordinatorActor {
  final val sampleResult = List(ChangeSet(Set(Tuple(List(42))), true))
}

class CoordinatorActor extends Actor {

  def receive = {
    case LoadData(databaseUrl, vocabulary, inventory) => AkkaUtils.propagateException(sender) {
      val types = getTypes(vocabulary, databaseUrl)
      val typeInputRecipes = types.map(_.getInputRecipe)
      val plan = allocate(typeInputRecipes, types, inventory)
      val index = deploy(plan, types)
      configureIndex(index)
      sender ! index
    }
    case StartQuery(recipeJson, index) => {
      val recipe = RecipeDeserializer.deserializeFromString(recipeJson).asInstanceOf[ReteRecipe]
      val notTypeInputRecipes = recipe.getRecipeNodes.filterNot(_.isInstanceOf[TypeInputRecipe])
      val types = index.inputActorsByType.keySet
      val plan = allocate(notTypeInputRecipes, types, index.deployedInventory)
      val network = deploy(plan, types)
      configureNetwork(network, recipe)
      sender ! network
    }
    case CheckResults() => {
      sender ! CoordinatorActor.sampleResult
    }
    case StopQuery(network) => {
      undeploy(network)
      sender ! "Ready"
    }
  }

  def getPatternName(recipe: ReteNodeRecipe): Option[String] = {
    recipe match {
      case recipe: ProductionRecipe => recipe.getPattern match { // XXX it is Object :(
        case pQuery: PQuery => Some(pQuery.getFullyQualifiedName)
        case _ => None
      }
      case _ => None
    }
  }

  def getTypes(vocabulary: Model, databaseUrl: String): Set[RdfType] = {
    val driver = new FileGraphDriverRead(databaseUrl)
    val rdfClassStatements = vocabulary.filter(null, RDF.TYPE, RDFS.CLASS).toSet
    val owlClassStatements = vocabulary.filter(null, RDF.TYPE, OWL.CLASS).toSet
    val classes = getUriSubjects(rdfClassStatements union owlClassStatements)
    val classTypes: Set[RdfType] = classes.map(RdfType(RdfType.Class, _, driver))
    val objectProperties = getUriSubjects(vocabulary.filter(null, RDF.TYPE, OWL.OBJECTPROPERTY).toSet)
    val objectPropertyTypes: Set[RdfType] = objectProperties.map(RdfType(RdfType.ObjectProperty, _, driver))
    val datatypeProperties = getUriSubjects(vocabulary.filter(null, RDF.TYPE, OWL.DATATYPEPROPERTY).toSet)
    val datatypePropertyTypes: Set[RdfType] = datatypeProperties.map(RdfType(RdfType.DatatypeProperty, _, driver))
    classTypes union objectPropertyTypes union datatypePropertyTypes
  }
  
  def getUriSubjects(statements: Set[Statement]): Set[Resource] = {
    statements.map(_.getSubject).filter(_.isInstanceOf[URI]) // Discard blank Actors
  }

  def allocate(recipes: Iterable[ReteNodeRecipe], types: Set[RdfType], inventory: Inventory): DeploymentPlan = {
    val recipesSorted = recipes.toList.sortBy(-RecipeUtils.getEstimatedMemoryUsageMb(_, types))
    val allocation = mutable.Map[ReteNodeRecipe, MachineInstance]()
    val allocatedInstances = new ArrayList(inventory.machineInstances)
    for (recipe <- recipesSorted) {
      val memoryUsageMb = RecipeUtils.getEstimatedMemoryUsageMb(recipe, types)
      val goodInstances = allocatedInstances.filter(_.memoryMb > memoryUsageMb)
      if (goodInstances.isEmpty) {
        throw new IllegalArgumentException(s"Can't allocate ${RecipeUtils.getName(recipe)} on any machine!") // XXX return Option instead?
      } else {
        val selectedInstance = goodInstances.head
        allocation.put(recipe, selectedInstance)
        val allocatedInstance = selectedInstance.copy(memoryMb = selectedInstance.memoryMb - memoryUsageMb)
        allocatedInstances.remove(selectedInstance)
        allocatedInstances.add(allocatedInstance)
      }
    }
    val deployedInventory = inventory.copy(machineInstances = allocatedInstances.toList)
    DeploymentPlan(allocation.toMap, deployedInventory)
  }

  def deploy(deploymentPlan: DeploymentPlan, types: Set[RdfType]): DeploymentResult = {
	val inputActorsByType = mutable.Map[RdfType, ActorRef]()
	val otherActorsByEmfUri = mutable.Map[String, ActorRef]()
    for ((recipe, instance) <- deploymentPlan.allocation) {
      val actorId = RemoteReteActor.actorId(recipe, instance) 
      val actor = new RemoteActorService(instance.ip).start(actorId, classOf[ReteActor])
      recipe match {
        case recipe: TypeInputRecipe => inputActorsByType.put(RecipeUtils.findType(types, recipe).get, actor)
        case recipe => otherActorsByEmfUri.put(RecipeUtils.getEmfId(recipe), actor)
      }
    }
    DeploymentResult(inputActorsByType.toMap, otherActorsByEmfUri.toMap, deploymentPlan.deployedInventory)
  }

  def undeploy(deploymentResult: DeploymentResult): Unit = {
    for (actor <- deploymentResult.inputActorsByType.values ++ deploymentResult.otherActorsByEmfId.values) {
      actor ! PoisonPill
    }
  }
  
  def configureIndex(index: DeploymentResult): Unit = {
    implicit val timeout: Timeout = Timeout(AkkaUtils.defaultTimeout)
    val typeConfigurations = index.inputActorsByType.map { case (rdfType, actor) =>
      val nodeRecipe = rdfType.getInputRecipe;
      actor.ask(new ReteNodeConfiguration(nodeRecipe, List()))
    }
    import context.dispatcher
    val allConfigurations = Future.sequence(typeConfigurations)
    Await.result(allConfigurations, timeout.duration)
  }
  
  def configureNetwork(network: DeploymentResult, recipe: ReteRecipe): Unit = {
    implicit val timeout: Timeout = Timeout(AkkaUtils.defaultTimeout)
    val otherConfigurations = network.otherActorsByEmfId.map { case (emfId, actor) =>
      val maybeNodeRecipe = recipe.getRecipeNodes.find(RecipeUtils.getEmfId(_) == emfId)
      if (maybeNodeRecipe.isEmpty) {
        println("Programming error")
      }
      actor.ask(new ReteNodeConfiguration(maybeNodeRecipe.get, List()))
    }
    import context.dispatcher
    val allConfigurations = Future.sequence(otherConfigurations)
    Await.result(allConfigurations, timeout.duration)
  }

}