/**
 * 
 */
package edu.buffalo.cse715.parsing.expression.literal;

import finite_state_machine.Context;

/**
 * @author Shashank Raghunath
 * @email sraghuna@buffalo.edu
 *
 */
public class NumberValueExpression extends ValueExpression implements Literal<Number> {

	private Number literal;

	public NumberValueExpression() {
		// TODO Auto-generated constructor stub
	}

	public NumberValueExpression(Number literal) {
		super();
		this.literal = literal;
	}

	public Number getLiteral() {
		return literal;
	}

	public void setLiteral(Number literal) {
		this.literal = literal;
	}
	
	public Literal evaluate(Context c) {
		NumberValueExpression answer = new NumberValueExpression();
		answer.setLiteral(literal);
		return answer;
		}

}
