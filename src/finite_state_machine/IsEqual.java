package finite_state_machine;

public class IsEqual extends Expression {
	private Expression lhs,rhs;
	public IsEqual(Expression lhs, Expression rhs) {
		this.lhs=lhs;
		this.rhs=rhs;
	}
	
	public PrimitiveValue evaluate(Context cxt) throws UnsupportedOperationException {
		PrimitiveValue lval=lhs.evaluate(cxt);
		PrimitiveValue rval=rhs.evaluate(cxt);

		if ((lval instanceof IntegerValue) || (rval instanceof IntegerValue)) {
			IntegerValue a=IntegerValue.makeIntegerValue(lval);
			IntegerValue b=IntegerValue.makeIntegerValue(rval);
			return new BooleanValue(a.getVal() == b.getVal());
		} else if ((lval instanceof BooleanValue) || (rval instanceof BooleanValue)) {
			BooleanValue a=BooleanValue.makeBooleanValue(lval);
			BooleanValue b=BooleanValue.makeBooleanValue(rval);
			return new BooleanValue(a.getVal() == b.getVal());
		} else if ((lval instanceof StringValue) && (rval instanceof StringValue)) {
			StringValue a=(StringValue)lval;
			StringValue b=(StringValue)rval;
			return new BooleanValue(a.getVal().equals(b.getVal()));
		} else {
			throw new UnsupportedOperationException("invalid types");
		}
	}
}
