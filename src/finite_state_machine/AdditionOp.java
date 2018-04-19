package finite_state_machine;

public class AdditionOp extends Expression {
	Expression rhs,lhs;
	public int getRhs() {
		IntegerValue v=(IntegerValue)evaluate(rhs);
		return v.getVal();
	}
	public int getLhs() {
		IntegerValue v=(IntegerValue)evaluate(lhs);
		return v.getVal();
	}
}
