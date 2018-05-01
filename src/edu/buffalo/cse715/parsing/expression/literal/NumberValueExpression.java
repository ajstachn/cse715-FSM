/**
 * 
 */
package edu.buffalo.cse715.parsing.expression.literal;

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

}
