package edu.buffalo.cse715.parsing.expression.controlflow;

import edu.buffalo.cse715.parsing.expression.Expression;

public class ControlFlowExpression extends Expression {
	private Expression expression;
	private RangeValue rangeValue;

	@Override
	public Expression getExpressionA() {
		// TODO Auto-generated method stub
		return expression;
	}

	@Override
	public void setExpressionA(Expression expression) {
		this.expression = expression;

	}

	public RangeValue getRangeValue() {
		return rangeValue;
	}

	public void setRangeValue(RangeValue rangeValue) {
		this.rangeValue = rangeValue;
	}
}
