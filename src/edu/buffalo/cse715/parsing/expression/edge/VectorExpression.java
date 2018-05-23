package edu.buffalo.cse715.parsing.expression.edge;

import java.util.ArrayList;
import java.util.List;

import edu.buffalo.cse715.parsing.expression.Expression;
import edu.buffalo.cse715.parsing.expression.literal.ValueExpression;

public class VectorExpression extends ValueExpression {
	
	private List<String> vectorValue;
	
	public VectorExpression(String vectorString) {
		// TODO Auto-generated constructor stub
		int len = vectorString.length();
		vectorString = vectorString.substring(1,len-1);
		String [] token = vectorString.split(",");
		List<String> vector = new ArrayList<>();
		for(String str : token) {
			vector.add(str);
		}
		setVectorValue(vector);
	}

	@Override
	public void setExpressionA(Expression expression) {
		// TODO Auto-generated method stub
		
	}

	public List<String> getVectorValue() {
		return vectorValue;
	}

	public void setVectorValue(List<String> vectorValue) {
		this.vectorValue = vectorValue;
	}

}
