package finite_state_machine;
import java.util.Map;

public class AdditionOp extends Expression {
    Expression rhs,lhs;
    public AdditionOp(Expression rhs, Expression lhs) {
	this.rhs=rhs;
	this.lhs=lhs;
    }
    public int getRhs(Context cxt) {
    	IntegerValue v=(IntegerValue)Expression.evaluate(rhs,cxt);
    	return v.getVal();
    }
	public int getLhs(Context cxt) {
		IntegerValue v=(IntegerValue)Expression.evaluate(lhs,cxt);
		return v.getVal();
    }
}
