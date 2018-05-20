package edu.buffalo.cse715.parsing.expression.controlflow;

import edu.buffalo.cse715.parsing.expression.Expression;
import edu.buffalo.cse715.parsing.expression.literal.ValueExpression;
import finite_state_machine.Context;

public class ControlFlowExpression extends Expression {
	private Expression expression;
	private RangeValue rangeValue;

	public Expression getExpressionA() {
		// TODO Auto-generated method stub
		return expression;
	}

	public void setExpressionA(Expression expression) {
		this.expression = expression;

	}

	public RangeValue getRangeValue() {
		return rangeValue;
	}

	public void setRangeValue(RangeValue rangeValue) {
		this.rangeValue = rangeValue;
	}
	

	public ValueExpression evaluate(Context cxt) {
		//TODO Fill in
		return null;
	}

}
