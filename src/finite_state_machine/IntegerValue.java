package finite_state_machine;

public class IntegerValue extends PrimitiveValue {
	private int n;
	public IntegerValue(int k) {
		n=k;
	}
	public IntegerValue makeValue(String str) {
		return new IntegerValue(Integer.parseInt(str));
	}
	public int getVal() {
		return n;
	}
	public void setVal(int k) {
		n=k;
	}
	public boolean getBool() {
		return false;
	}
	public String toString() {
		return Integer.toString(n);
	}
}
