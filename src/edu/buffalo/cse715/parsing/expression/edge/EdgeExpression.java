package edu.buffalo.cse715.parsing.expression.edge;

import edu.buffalo.cse715.parsing.expression.Expression;
import edu.buffalo.cse715.parsing.expression.IBinaryExpression;

public class EdgeExpression extends Expression implements IBinaryExpression{
	private Expression expressionA;
	private Expression expressionB;

	public Expression getExpressionA() {
		// TODO Auto-generated method stub
		return expressionA;
	}

	
	public void setExpressionA(Expression expression) {
		this.expressionA = expression;

	}
	

	public Expression getExpressionB() {
		// TODO Auto-generated method stub
		return expressionB;
	}

	
	public void setExpressionB(Expression expression) {
		this.expressionB = expression;
	}
	
	
}
