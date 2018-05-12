package edu.buffalo.cse715.parsing.expression.edge;

import edu.buffalo.cse715.parsing.expression.Expression;
import java.util.List;
import java.util.ArrayList;

public class EdgeExpression extends Expression {
	List<String> leftEdgeVector;
	List<String> rightEdgeVector;

	@Override
	public Expression getExpressionA() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setExpressionA(Expression expression) {
		// TODO Auto-generated method stub

	}

	public List<String> getLeftEdgeVector() {
		if (leftEdgeVector == null)
			leftEdgeVector = new ArrayList<String>();
		return leftEdgeVector;
	}

	public void setLeftEdgeVector(List<String> leftEdgeVector) {
		this.leftEdgeVector = leftEdgeVector;
	}

	public List<String> getRightEdgeVector() {
		if (rightEdgeVector == null)
			rightEdgeVector = new ArrayList<String>();
		return rightEdgeVector;
	}

	public void setRightEdgeVector(List<String> rightEdgeVector) {
		this.rightEdgeVector = rightEdgeVector;
	}

}
