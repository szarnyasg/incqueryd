package hu.bme.mit.incqueryd.rete.actors.testkits;

import hu.bme.mit.incqueryd.rete.dataunits.ReteNodeSlot;
import hu.bme.mit.incqueryd.rete.nodes.data.BetaTestData;
import hu.bme.mit.incqueryd.util.ReteNodeType;

import java.io.IOException;

import akka.actor.ActorSystem;
import akka.testkit.JavaTestKit;

// @formatter:off
/** 
 * 
 * Test plan
 * ---------
 * 
 *                       (primaryParentActor)  (secondaryParentActor)
 *                                 |                    |
 *                                 +-------+   +--------+
 *                                         |   | 
 *                                   (9) V |   |  (5) V
 *                                  (12) ^ |   |  (8) ^
 *                                         |   |
 *                                         V   V
 *  (coordinatorActor) <--------------> (betaActor)
 *                           (1) >           ^
 *                           (2) <           |
 *                                           | (3) ^   (6) V   (10) V
 *                                           | (4) V   (7) ^   (11) ^
 *                                           |
 *                                           V
 *                                      (targetActor) 
 * 
 * 
 *  (1) ! ReteNodeConfiguration
 *  (2) ? CONFIGURATION_RECEIVED
 *  
 *  (3) ! SUBSCRIBE_SINGLE
 *  (4) ? SUBSCRIBED
 *  
 *  (5) ! UpdateMessage, stack: [secondaryParentActor] 
 *  (6) ? UpdateMessage, stack: [secondaryParentActor, betaActor]
 *  (7) ! ReadyMessage, stack: [secondaryParentActor]
 *  (8) ? ReadyMessage, stack: []
 * 
 *  (9) ! UpdateMessage, stack: [primaryParentActor] 
 * (10) ? UpdateMessage, stack: [primaryParentActor, betaActor]
 * (11) ! ReadyMessage, stack: [primaryParentActor]
 * (12) ? ReadyMessage, stack: []
 * 
 * Legend:
 *  - [!] sent by the test framework, [?] expected by the test framework
 *  - the stack is represented according to the immutable.Stack Scala class' toString() method: 
 *    the top item in the stack is the _first_ in the list (unlike the java.util.Stack class' toString()) 
 *
 */
// @formatter:on
public class BetaActorTestKit extends ReteActorTestKit {

	protected final JavaTestKit primaryParentActor;
	protected final JavaTestKit secondaryParentActor;

	public BetaActorTestKit(final ActorSystem system, final ReteNodeType type, final String recipeFile)
			throws IOException {
		super(system, type, recipeFile);

		primaryParentActor = new JavaTestKit(system);
		secondaryParentActor = new JavaTestKit(system);
	}

	public void test(final BetaTestData data) throws IOException {		
		// Act and Assert
		configure(coordinatorActor, reteActor, conf);
		subscribe(targetActor, reteActor);
		testComputation(primaryParentActor, reteActor, targetActor, data.getPrimaryChangeSet(),
				data.getExpectedFirstChangeSet(), ReteNodeSlot.PRIMARY);
		testComputation(secondaryParentActor, reteActor, targetActor, data.getSecondaryChangeSet(),
				data.getExpectedSecondChangeSet(), ReteNodeSlot.SECONDARY);
	}

}
