package finite_state_machine;

public class ConstantExpr extends Expression {
    private PrimitiveValue val;
    public ConstantExpr(PrimitiveValue val) {
	this.val=val;
    }

    public PrimitiveValue getVal() {
	return val;
    }
}
