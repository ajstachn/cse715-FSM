package finite_state_machine;

public class Variable extends Expression {
    private String varname;
    public PrimitiveValue type;
    public Variable(String varname, PrimitiveValue type) {
    	this.varname=varname;
    	this.type=type;
    }
    public PrimitiveValue getVal(String str) {
    	return type.makeValue(str);
    }
    public String getName() {
    	return varname;
    }
}
