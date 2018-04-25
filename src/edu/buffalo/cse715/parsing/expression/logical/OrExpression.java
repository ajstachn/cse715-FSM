package edu.buffalo.cse715.parsing.expression.logical;

import edu.buffalo.cse715.parsing.expression.relational.RelationalExpression;

/**
 * @author Shashank Raghunath
 * @email sraghuna@buffalo.edu
 *
 */
public class OrExpression extends LogicalExpression {

	private RelationalExpression expressionA;
	private RelationalExpression expressionB;

	public OrExpression(RelationalExpression expressionA, RelationalExpression expressionB) {
		super();
		this.expressionA = expressionA;
		this.expressionB = expressionB;
	}

	public OrExpression() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RelationalExpression getExpressionA() {
		return expressionA;
	}

	public void setExpressionA(RelationalExpression expressionA) {
		this.expressionA = expressionA;
	}

	public RelationalExpression getExpressionB() {
		return expressionB;
	}

	public void setExpressionB(RelationalExpression expressionB) {
		this.expressionB = expressionB;
	}

}
