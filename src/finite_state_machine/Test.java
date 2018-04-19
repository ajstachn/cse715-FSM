
package finite_state_machine;
import java.util.HashMap;
import java.util.Map;

public class Test {
	public static void main(String[] args) {
		Expression expr = new IsEqual(new ConstantExpr(new IntegerValue(7)),new AdditionOp(new Variable("foo"),new ConstantExpr(new IntegerValue(3))));

		Map<String,PrimitiveValue> varMap = new HashMap<String,PrimitiveValue>();
		varMap.put("foo",new IntegerValue(4));
		Context cxt = new Context() {
				public PrimitiveValue getvar(Variable name) {
					return varMap.get(name.getName());
				}
			};
		
		System.out.println(expr.evaluate(cxt));
	}
}
