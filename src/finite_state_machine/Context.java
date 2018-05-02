package finite_state_machine;

import java.util.HashMap;
import java.util.Map;

import edu.buffalo.cse715.parsing.expression.VariableExpression;
import edu.buffalo.cse715.parsing.expression.literal.StringValueExpression;
import edu.buffalo.cse715.parsing.expression.literal.ValueExpression;

public class Context {
	private Map<String,String> variableLookup=new HashMap<String,String>();
	private Graph transitions;
	private String state;
	
	public Context(Graph transitions,String state) {
		this.variableLookup=variableLookup;
		this.state=state;
	}
	
	public ValueExpression getvar(VariableExpression varname) {
		return new StringValueExpression(variableLookup.get(varname.getName()));
	}
	
	
	
}
