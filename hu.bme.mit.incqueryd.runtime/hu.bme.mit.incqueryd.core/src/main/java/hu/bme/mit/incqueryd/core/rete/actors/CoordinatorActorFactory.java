/*******************************************************************************
 * Copyright (c) 2010-2014, Gabor Szarnyas, Istvan Rath and Daniel Varro
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Gabor Szarnyas - initial API and implementation
 *******************************************************************************/
package hu.bme.mit.incqueryd.core.rete.actors;

import akka.actor.Actor;
import akka.actor.UntypedActorFactory;

public class CoordinatorActorFactory implements UntypedActorFactory {

	private static final long serialVersionUID = 1L;
	private final String architectureFile;
	private final boolean remoting;

	public CoordinatorActorFactory(final String architectureFile, final boolean remoting) {
		this.architectureFile = architectureFile;
		this.remoting = remoting;
	}
	
	@Override
	public Actor create() throws Exception {
		return new CoordinatorActor(architectureFile, remoting);
	}

}