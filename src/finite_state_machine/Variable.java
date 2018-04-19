package finite_state_machine;

public class Variable extends Expression {
    private String varname;
    public Variable(String varname) {
	this.varname=varname;
    }
    public String getName() {
	return varname;
    }
}
