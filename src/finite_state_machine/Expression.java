package finite_state_machine;

public abstract class Expression {

	public abstract PrimitiveValue evaluate(Context cxt) throws UnsupportedOperationException;

}
