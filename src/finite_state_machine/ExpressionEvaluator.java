package finite_state_machine;

import edu.buffalo.cse715.parsing.expression.Expression;
import edu.buffalo.cse715.parsing.expression.literal.NumberValueExpression;
import edu.buffalo.cse715.parsing.expression.literal.ValueExpression;

public class ExpressionEvaluator {
	public static ValueExpression evaluate(Expression expr, Context cxt) {
		return new NumberValueExpression(3);
	}
	
}
