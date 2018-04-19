package finite_state_machine;

public abstract class Expression {
	public static PrimitiveValue evaluate(Expression expr) {
		if (expr instanceof AdditionOp) {
			AdditionOp add=(AdditionOp)expr;
			return new IntegerValue(add.getLhs()+add.getRhs());
		}
		else {
			return new BooleanValue();
		}
	}

	
}