package edu.buffalo.cse715.parsing.expression.literal;

import edu.buffalo.cse715.parsing.expression.Expression;

public abstract class ValueExpression extends Expression {

	public ValueExpression() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Expression getExpressionA() {
		return this;
	}
}
