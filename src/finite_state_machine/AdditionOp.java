package finite_state_machine;
import java.util.Map;

public class AdditionOp extends Expression {
	Expression rhs,lhs;
	public AdditionOp(Expression lhs, Expression rhs) {
		this.rhs=rhs;
		this.lhs=lhs;
	}

	public PrimitiveValue evaluate(Context cxt) throws UnsupportedOperationException {
		IntegerValue a=IntegerValue.makeIntegerValue(lhs.evaluate(cxt));
		IntegerValue b=IntegerValue.makeIntegerValue(rhs.evaluate(cxt));
		return new IntegerValue(a.getVal()+b.getVal());
	}

	public String toString() {
		return "("+this.lhs+"+"+this.rhs+")";
	}
}
