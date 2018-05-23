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

	private Expression expressionA;
	private Expression expressionB;

	public AndExpression(Expression expressionA, Expression expressionB) {
		super();
		this.expressionA = expressionA;
		this.expressionB = expressionB;
	}

	public AndExpression() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Expression getExpressionA() {
		return expressionA;
	}

	/*public void setExpressionA(Expression expressionA) {
		this.expressionA = expressionA;
	}
	 */
	public Expression getExpressionB() {
		return expressionB;
	}

	/*public void setExpressionB(Expression expressionB) {
		this.expressionB = expressionB;
	}*/

	@Override
	public void setExpressionA(Expression expression) {
		// TODO Auto-generated method stub
		this.expressionA = (Expression) expression;
	}

	@Override
	public void setExpressionB(Expression expression) {
		// TODO Auto-generated method stub
		this.expressionB = (Expression) expression;
	}

}
