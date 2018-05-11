/**
 * 
 */
package edu.buffalo.cse715.parsing.expression.literal;

import edu.buffalo.cse715.parsing.expression.Expression;

/**
 * @author Shashank Raghunath
 * @email sraghuna@buffalo.edu
 *
 */
public class BooleanValueExpression extends ValueExpression implements Literal<Boolean> {

	private Boolean literal;

	public BooleanValueExpression() {
		// TODO Auto-generated constructor stub
	}

	public BooleanValueExpression(Boolean literal) {
		super();
		this.literal = literal;
	}

	public Boolean getLiteral() {
		return literal;
	}

	public void setLiteral(Boolean literal) {
		this.literal = literal;
	}

	@Override
	public void setExpressionA(Expression expression) {
		// TODO Auto-generated method stub
		
	}

}
