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

	

	public ValueExpression evaluate(Context cxt) {
		//TODO Fill in
		return null;
	}

	@Override
	public StringValueExpression expectString() {
		return new StringValueExpression(literal.toString());
	}

	@Override
	public IntValueExpression expectInt() throws IllegalStateException {
		throw new IllegalStateException("Cannot convert bool to int");
	}

	@Override
	public FloatValueExpression expectFloat() throws IllegalStateException {
		throw new IllegalStateException("Cannot convert bool to float");
	}

	@Override
	public BooleanValueExpression expectBool() throws IllegalStateException {
		return this;
	}


}
