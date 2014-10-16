package hu.bme.mit.incqueryd.csp.util.data;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.incquery.runtime.rete.recipes.ReteNodeRecipe;

public class MultiParentReteNode extends ReteNode {
	
	protected List<ReteEdge> parentEdges;

	public MultiParentReteNode(ReteNodeRecipe reteNode) {
		super(reteNode);
		
		parentEdges = new ArrayList<>();
	}
	public void createParentEdge(ReteNode par) {
		ReteEdge parentEdge = new ReteEdge(par);
		parentEdges.add(parentEdge);
	}

	@Override
	public boolean calculateHeuristics() {
		
		boolean parentsReady = true;
		for (ReteEdge parentEdge : parentEdges) {
			ReteNode parent = parentEdge.getTarget();
			if (!parent.isValid()) {
				parentsReady = false;
				break;
			}
			else
			{
				if(!parentEdge.isValid()) {
					int tupleNumber = parent.getTupleNumber();
					int arity = parent.getTupleArity();
					parentEdge.setTupleNumber(tupleNumber);
					parentEdge.setTupleArity(arity);
					parentEdge.valid();
				}
			}
		}
		
		if(parentsReady) {
			//TODO better heuristics later
			int tupleNumber = 0;
			int arity = 0;
			for (ReteEdge parentEdge : parentEdges) {
				ReteNode parent = parentEdge.getTarget();
				tupleNumber += parent.getTupleNumber();
				arity = parent.getTupleArity();
			}
			
			this.tupleNumber = tupleNumber;
			this.tupleArity = arity;
			
			this.valid = true;
		}
		
		return parentsReady;
	}

}
