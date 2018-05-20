package edu.buffalo.cse715.parsing.expression.edge;

import edu.buffalo.cse715.parsing.expression.Expression;
import edu.buffalo.cse715.parsing.expression.literal.ValueExpression;
import finite_state_machine.Context;

import java.util.List;
import java.util.ArrayList;

public class EdgeExpression extends Expression {
	List<String> leftEdgeVector;
	List<String> rightEdgeVector;


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

	

	public ValueExpression evaluate(Context cxt) {
		//TODO Fill in
		return null;
	}

}
