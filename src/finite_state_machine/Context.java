package finite_state_machine;

import java.util.Iterator;
import edu.buffalo.cse715.parsing.expression.literal.StringValueExpression;
import edu.buffalo.cse715.parsing.expression.literal.ValueExpression;

public class Context {
	private State curstate;
	private Graph transitions;
	
	public Context(Graph transitions,State curstate) {
		this.transitions=transitions;
		this.curstate=curstate;
	}
	
	public class ContextIterator implements Iterator<Context> {
		private Iterator<Integer> nextStates;
		
		private ContextIterator() {
			nextStates=transitions.getNextStates(transitions.lookupNode(curstate));
		}
		public Context next() {
			int id=nextStates.next();
			return new Context(transitions,transitions.lookupState(id));
		}
		public boolean hasNext() {
			return nextStates.hasNext();
		}
	}
	
	public ValueExpression getvar(String varname) {
		return new StringValueExpression(curstate.get(transitions.lookupVar(varname)));
	}
	
	
	
}
