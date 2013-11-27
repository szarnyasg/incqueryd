package hu.bme.mit.incqueryd.rete.dataunits;

import java.io.Serializable;

/**
 * Interface for tuples.
 * @author szarnyasg
 *
 */
public interface Tuple extends Serializable, Comparable<Tuple> {
	
	Object get(int index);
	int size();
	
}
