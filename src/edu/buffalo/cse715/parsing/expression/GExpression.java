/**
 * 
 */
package edu.buffalo.cse715.parsing.expression;

import java.util.ArrayList;
import java.util.Stack;

import edu.buffalo.cse715.parsing.expression.literal.ValueExpression;
import finite_state_machine.Context;

/**
 * @author Shashank Raghunath
 * @email sraghuna@buffalo.edu
 *
 */
public class GExpression extends Expression {

	private Expression expression;

	public GExpression() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GExpression(Expression expression) {
		super();
		this.expression = expression;
	}

	public Expression getExpression() {
		return expression;
	}

	public void setExpression(Expression expression) {
		this.expression = expression;
	}

	@Override
	public Expression getExpressionA() {
		return expression;
	}
	
	public ValueExpression evaluate(Context cxt) {
		Stack<Context> stack;
		stack = new Stack<Context>();
		stack.add(cxt);
		while(!stack.isEmpty()) {
		   Context local = stack.pop();
		   
		}
		return null;
	}
}
