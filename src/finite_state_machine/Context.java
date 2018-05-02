package finite_state_machine;

import edu.buffalo.cse715.parsing.expression.VariableExpression;
import edu.buffalo.cse715.parsing.expression.literal.ValueExpression;

public abstract class Context {
	public abstract ValueExpression getvar(VariableExpression varname);
	
}
