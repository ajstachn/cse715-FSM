package edu.buffalo.cse715.parsing.expression;

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

}
