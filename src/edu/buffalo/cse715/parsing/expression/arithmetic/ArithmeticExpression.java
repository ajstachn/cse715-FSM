package edu.buffalo.cse715.parsing.expression.arithmetic;

import edu.buffalo.cse715.parsing.expression.Expression;

public abstract class ArithmeticExpression extends Expression {

	private Expression expressionA;
	private Expression expressionB;

	public ArithmeticExpression() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ArithmeticExpression(Expression expressionA, Expression expressionB) {
		super();
		this.expressionA = expressionA;
		this.expressionB = expressionB;
	}

	public Expression getExpressionA() {
		return expressionA;
	}

	public void setExpressionA(Expression expressionA) {
		this.expressionA = expressionA;
	}

	public Expression getExpressionB() {
		return expressionB;
	}

	public void setExpressionB(Expression expressionB) {
		this.expressionB = expressionB;
	}
}
