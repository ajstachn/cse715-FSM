package finite_state_machine;

public class BooleanValue extends PrimitiveValue{
	boolean val;
	public BooleanValue(boolean val) {
		this.val=val;
	}
	public BooleanValue makeValue(String str) {
		return new BooleanValue(Boolean.parseBoolean(str));
	}
	public boolean getBool() {
		return val;
	}
}
