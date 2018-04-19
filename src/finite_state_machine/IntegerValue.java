package finite_state_machine;

public class IntegerValue extends PrimitiveValue {
	private int n;
	public IntegerValue(int n) {
		this.n=n;
	}
	
	public static IntegerValue makeIntegerValue(PrimitiveValue val) throws UnsupportedOperationException {
		if (val instanceof IntegerValue) {
			return (IntegerValue)val;
		} else if (val instanceof StringValue) {
			StringValue str=(StringValue)val;
			return new IntegerValue(Integer.parseInt(str.getVal()));
		} else {
			throw new UnsupportedOperationException("invalid type");
		}
	}
	
	public int getVal() {
		return n;
	}
	
	public String toString() {
		return Integer.toString(n);
	}
}
