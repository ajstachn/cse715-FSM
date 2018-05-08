package finite_state_machine;

import java.util.Map;

public class VariableLookup {

	private Map<String,Integer> table;
	public VariableLookup(Map<String,Integer> table) {
		this.table = table;
	}
	public String getValue(State s,String name) {
		return s.get(table.get(name));
	}
}
