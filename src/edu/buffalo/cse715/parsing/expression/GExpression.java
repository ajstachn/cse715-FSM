/**
 * 
 */
package edu.buffalo.cse715.parsing.expression;

import edu.buffalo.cse715.parsing.expression.literal.ValueExpression;
import finite_state_machine.Context;

/**
 * @author Shashank Raghunath
 * @email sraghuna@buffalo.edu
 *
 */
public class GExpression extends Expression {

	private Expression expression;

	public GExpression() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GExpression(Expression expression) {
		super();
		this.expression = expression;
	}

	public Expression getExpression() {
		return expression;
	}


	public ValueExpression evaluate(Context cxt) {
		//TODO Fill in
		return null;
	}

}
