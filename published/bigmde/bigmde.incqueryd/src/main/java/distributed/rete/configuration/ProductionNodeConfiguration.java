package distributed.rete.configuration;

import akka.actor.ActorRef;

public class ProductionNodeConfiguration extends ReteNodeConfiguration {

	private static final long serialVersionUID = 1L;

	public ProductionNodeConfiguration(ActorRef coordinator, String targetActorPath) {
		super(coordinator, targetActorPath);
	}

}