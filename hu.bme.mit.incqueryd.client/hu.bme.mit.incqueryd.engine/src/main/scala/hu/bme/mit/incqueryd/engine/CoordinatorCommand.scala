package hu.bme.mit.incqueryd.engine

import org.eclipse.incquery.runtime.rete.recipes.ReteRecipe
import org.openrdf.model.Model
import hu.bme.mit.incqueryd.inventory.Inventory

sealed trait CoordinatorCommand
case class LoadData(databaseUrl: String, vocabulary: Model, inventory: Inventory) extends CoordinatorCommand
case class StartQuery(recipeJson: String, index: DeploymentResult) extends CoordinatorCommand
case class CheckResults(recipeJson: String, network: DeploymentResult, patternName: String) extends CoordinatorCommand
case class StopQuery(network: DeploymentResult) extends CoordinatorCommand