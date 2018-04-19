package finite_state_machine;

public class BooleanValue extends PrimitiveValue {
	boolean val;
	public BooleanValue(boolean val) {
		this.val=val;
	}

	public static BooleanValue makeBooleanValue(PrimitiveValue val) throws UnsupportedOperationException {
		if (val instanceof BooleanValue) {
			return (BooleanValue)val;
		} else if (val instanceof StringValue) {
			StringValue str=(StringValue)val;
			return new BooleanValue(Boolean.parseBoolean(str.getVal()));
		} else {
			throw new UnsupportedOperationException("invalid type");
		}
	}
	
	public boolean getVal() {
		return val;
	}

	public String toString() {
		return Boolean.toString(val);
	}
}
