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
public class StringValueExpression extends Expression implements Literal<String> {

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

}
