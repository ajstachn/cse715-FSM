package edu.buffalo.cse715.parsing.expression;

import edu.buffalo.cse715.parsing.expression.literal.ValueExpression;
import finite_state_machine.Context;

/**
 * @author Shashank Raghunath
 * @email sraghuna@buffalo.edu
 *
 */
public class VariableExpression extends Expression {

	private String name;

	public VariableExpression() {
		super();
		// TODO Auto-generated constructor stub
	}

	public VariableExpression(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public ValueExpression evaluate(Context cxt) {
		//TODO Fill in
		return null;
	}


	
}
