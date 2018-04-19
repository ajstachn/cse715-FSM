
package finite_state_machine;
import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
	Expression expr = new AdditionOp(new Variable("foo"),new ConstantExpr(new IntegerValue(3)));
	Map<String,PrimitiveValue> cxt = new HashMap<String,PrimitiveValue>();
	cxt.put("foo",new IntegerValue(3));
	System.out.println(Expression.evaluate(expr,cxt));
    }
}
