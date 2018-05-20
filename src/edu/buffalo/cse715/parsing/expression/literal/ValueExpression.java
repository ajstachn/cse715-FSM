package edu.buffalo.cse715.parsing.expression.literal;

import edu.buffalo.cse715.parsing.expression.Expression;

public abstract class ValueExpression extends Expression {

	public ValueExpression() {
		// TODO Auto-generated constructor stub
	}
	
	public abstract StringValueExpression expectString();
	
	public abstract IntValueExpression expectInt() throws IllegalStateException;
	
	public abstract FloatValueExpression expectFloat() throws IllegalStateException;
	
	public abstract BooleanValueExpression expectBool() throws IllegalStateException;
	
	public enum Exprtype {STRING_EXPR,INT_EXPR,FLOAT_EXPR,BOOL_EXPR};
	
	public static Exprtype promote(ValueExpression a, ValueExpression b) {
		if (a instanceof FloatValueExpression || b instanceof FloatValueExpression) {
			return Exprtype.FLOAT_EXPR;
		} else if (a instanceof IntValueExpression || b instanceof IntValueExpression) {
			return Exprtype.INT_EXPR;
		} else if (a instanceof BooleanValueExpression || b instanceof BooleanValueExpression) {
			return Exprtype.BOOL_EXPR;
		} else {
			return Exprtype.STRING_EXPR;
		}
	}
	
}
