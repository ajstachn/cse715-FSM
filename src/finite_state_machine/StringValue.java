package finite_state_machine;

public class StringValue extends PrimitiveValue {
	private String str;
	public StringValue(String str) {
		this.str=str;
	}

	public String getVal() {
		return str;
	}

	public String toString() {
		return "\"" + this.getVal() + "\"";
	}
}
