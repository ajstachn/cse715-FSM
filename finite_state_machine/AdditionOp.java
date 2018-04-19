package finite_state_machine;
import java.util.Map;

public class AdditionOp extends Expression {
    Expression rhs,lhs;
    public AdditionOp(Expression rhs, Expression lhs) {
	this.rhs=rhs;
	this.lhs=lhs;
    }
    public int getRhs(Map<String,PrimitiveValue> cxt) {
	IntegerValue v=(IntegerValue)evaluate(rhs,cxt);
	return v.getVal();
    }
    public int getLhs(Map<String,PrimitiveValue> cxt) {
	IntegerValue v=(IntegerValue)evaluate(lhs,cxt);
	return v.getVal();
    }
}
