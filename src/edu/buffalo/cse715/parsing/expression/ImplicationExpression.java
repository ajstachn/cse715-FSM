package edu.buffalo.cse715.parsing.expression;

import edu.buffalo.cse715.parsing.expression.literal.ValueExpression;
import finite_state_machine.Context;

/**
 * @author Shashank Raghunath
 * @email sraghuna@buffalo.edu
 *
 */
public class ImplicationExpression extends Expression {

	private Expression expressionA;
	private Expression expressionB;

	public ImplicationExpression() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ImplicationExpression(Expression expressionA, Expression expressionB) {
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


	public ValueExpression evaluate(Context cxt) {
		//TODO Fill in
		return null;
	}

	
}
