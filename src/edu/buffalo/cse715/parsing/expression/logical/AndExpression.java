package edu.buffalo.cse715.parsing.expression.logical;

import edu.buffalo.cse715.parsing.expression.Expression;
import edu.buffalo.cse715.parsing.expression.IBinaryExpression;
import edu.buffalo.cse715.parsing.expression.relational.RelationalExpression;

/**
 * @author Shashank Raghunath
 * @email sraghuna@buffalo.edu
 *
 */
public class AndExpression extends LogicalExpression implements IBinaryExpression {

	private RelationalExpression expressionA;
	private RelationalExpression expressionB;

	public AndExpression(RelationalExpression expressionA, RelationalExpression expressionB) {
		super();
		this.expressionA = expressionA;
		this.expressionB = expressionB;
	}

	public AndExpression() {
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

	@Override
	public void setExpressionA(Expression expression) {
		// TODO Auto-generated method stub
		this.expressionA = (RelationalExpression) expression;
	}

	@Override
	public void setExpressionB(Expression expression) {
		// TODO Auto-generated method stub
		this.expressionB = (RelationalExpression) expression;
	}

}
