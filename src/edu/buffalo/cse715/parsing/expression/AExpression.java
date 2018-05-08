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
public class AExpression extends Expression {

	private Expression expression;

	public AExpression() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AExpression(Expression expression) {
		super();
		this.expression = expression;
	}

	public Expression getExpression() {
		return expression;
	}

	public void setExpression(Expression expression) {
		this.expression = expression;
	}

	@Override
	public Expression getExpressionA() {
		return expression;
	}
	
	public ValueExpression evaluate(Context cxt) {
		
		return expression.evaluate(cxt.toggleNegate());
		
	}

}
