package finite_state_machine;
import java.util.Map;

public abstract class Expression {
    public static PrimitiveValue evaluate(Expression expr, Map<String,PrimitiveValue> cxt) {
	if (expr instanceof AdditionOp) {
	    AdditionOp add=(AdditionOp)expr;
	    return new IntegerValue(add.getLhs(cxt)+add.getRhs(cxt));
	} if (expr instanceof Variable) {
	    Variable var=(Variable)expr;
	    return cxt.get(var.getName());
	} if (expr instanceof ConstantExpr) {
	    return ((ConstantExpr)expr).getVal();
	}else {
	    return new BooleanValue();
	}
    }
}
