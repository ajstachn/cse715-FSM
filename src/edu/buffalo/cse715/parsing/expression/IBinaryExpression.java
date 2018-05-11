package edu.buffalo.cse715.parsing.expression;

public interface IBinaryExpression extends IExpression {

	public Expression getExpressionB();
	public void setExpressionB(Expression expression);
}
