package finite_state_machine;

public class Variable extends Expression {
	private String varname;
	
	public Variable(String varname) {
		this.varname=varname;
	}

	public PrimitiveValue evaluate(Context cxt) throws UnsupportedOperationException {
		return cxt.getvar(this);
	}

	public String getName() {
		return varname;
	}
	
	public String toString() {
		return "<" + varname + ">";
	}
}
