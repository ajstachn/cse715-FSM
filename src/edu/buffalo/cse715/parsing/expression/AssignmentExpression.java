package edu.buffalo.cse715.parsing.expression;

/**
 * @author Shashank Raghunath
 * @email sraghuna@buffalo.edu
 *
 */
public class AssignmentExpression extends Expression implements IBinaryExpression {

	private VariableExpression variable;
	private Expression expression;

	public AssignmentExpression() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AssignmentExpression(VariableExpression variable, Expression expression) {
		super();
		this.variable = variable;
		this.expression = expression;
	}

	public VariableExpression getVariable() {
		return variable;
	}

	public void setVariable(VariableExpression variable) {
		this.variable = variable;
	}

	public Expression getExpression() {
		return expression;
	}

	public void setExpression(Expression expression) {
		this.expression = expression;
	}

	@Override
	public Expression getExpressionA() {
		return variable;
	}

	@Override
	public Expression getExpressionB() {
		// TODO Auto-generated method stub
		return expression;
	}

	@Override
	public void setExpressionA(Expression expression) {
		// TODO Auto-generated method stub
		this.variable = (VariableExpression) expression;
	}

	@Override
	public void setExpressionB(Expression expression) {
		// TODO Auto-generated method stub
		this.expression = expression;
	}
}
