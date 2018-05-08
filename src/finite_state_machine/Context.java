package finite_state_machine;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import edu.buffalo.cse715.parsing.expression.VariableExpression;
import edu.buffalo.cse715.parsing.expression.literal.StringValueExpression;
import edu.buffalo.cse715.parsing.expression.literal.ValueExpression;

public class Context {
	private VariableLookup variableLookup;
	private Graph transitions;
	private State state;
	private Boolean negate; 
	
	public Context(Graph transitions,State state,VariableLookup lookup) {
		this.variableLookup=lookup;
		this.state=state;
		this.negate=false;
	}
	
	public ValueExpression getvar(VariableExpression varname) {
		return new StringValueExpression(variableLookup.getValue(state, varname.getName()));
	}
	
	public Context toggleNegate() {
		Context c = new Context(transitions,state,variableLookup);
		c.negate=true;
		return c;
	}
	
	public abstract class ContextIterator implements Iterator<Context> {
       
		private Iterator<String> iterator;
		public ContextIterator(String root) {
			iterator = transitions.getNextStates(root).iterator();
		}
		public Context next() {
			return new Context(transitions,transitions.nodeMap.get(iterator.next()),variableLookup);
		}
		
	}
	
}
