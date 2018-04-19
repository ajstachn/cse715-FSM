package finite_state_machine;

public abstract class PrimitiveValue {
	public abstract PrimitiveValue makeValue(String str);
	public abstract boolean getBool();
}
