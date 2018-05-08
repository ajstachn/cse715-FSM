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
public class StringValueExpression extends ValueExpression implements Literal<String> {

	private String literal;

	public StringValueExpression() {
		// TODO Auto-generated constructor stub
	}

	public StringValueExpression(String literal) {
		super();
		this.literal = literal;
	}

	public String getLiteral() {
		return literal;
	}

	public void setLiteral(String literal) {
		this.literal = literal;
	}
	public Literal evaluate(Context c) {
		StringValueExpression answer = new StringValueExpression();
		answer.setLiteral(literal);
		return answer;
		}

}
