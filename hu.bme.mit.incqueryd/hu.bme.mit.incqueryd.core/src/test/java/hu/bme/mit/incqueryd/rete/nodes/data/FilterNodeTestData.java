package hu.bme.mit.incqueryd.rete.nodes.data;

import hu.bme.mit.incqueryd.rete.dataunits.ChangeSet;

/**
 * 
 * @author szarnyasg
 * 
 */
public class FilterNodeTestData {

	protected ChangeSet incomingChangeSet;
	protected ChangeSet expectedChangeSet;

	public FilterNodeTestData(ChangeSet incomingChangeSet, ChangeSet expectedChangeSet) {
		super();
		this.incomingChangeSet = incomingChangeSet;
		this.expectedChangeSet = expectedChangeSet;
	}

	public ChangeSet getIncomingChangeSet() {
		return incomingChangeSet;
	}

	public ChangeSet getExpectedChangeSet() {
		return expectedChangeSet;
	}

}
