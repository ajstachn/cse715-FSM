package finite_state_machine;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Graph {
	
	private int newid=0;
	private Map<Integer,Set<Integer>> edges = new HashMap<Integer,Set<Integer>>();
	private Map<String,Integer> idMap = new HashMap<String,Integer>();
	private Map<Integer,State> stateMap = new HashMap<Integer,State>();
	private Map<String,Integer> varMap = new HashMap<String,Integer>();
	
	public void addVar(String varname,int varix) {
		varMap.put(varname,varix);
	}
	
	public int lookupVar(String varname) {
		return varMap.get(varname);
	}
	
	private int addNode(State st) {
		String statestr=st.toString();
		int id;
		if (idMap.containsKey(statestr)) {
			return idMap.get(statestr);
		} else {
			id=newid;
			++newid;
			idMap.put(statestr, id);
			stateMap.put(id, st);
		}
		return id;
	}
	
	public int lookupNode(State st) {
		return idMap.get(st.toString());
	}
	
	public State lookupState(int id) {
		return stateMap.get(id);
	}
	
	public void addEdge(State head,State tail) {
		int headid=addNode(head);
		int tailid=addNode(tail);
		
		Set<Integer> transitions=edges.get(headid);
		if (transitions == null) {
			transitions=new HashSet<Integer>();
			edges.put(headid, transitions);
		}
		
		transitions.add(tailid);
	}
	
	public Iterator<Integer> getNextStates(Integer curState) {
		return edges.get(curState).iterator();
	}
	
	public String toString() {
		String retVal="";
		for (Integer key: edges.keySet()) {
			retVal+=stateMap.get(key)+"->[";
			Set<Integer> vals = edges.get(key);
			for (Integer dest: vals) {
				retVal+=" "+stateMap.get(dest)+" ";
			}
			retVal+="]\n";
		}
		return retVal;
	}

}
