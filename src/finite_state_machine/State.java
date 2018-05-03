package finite_state_machine;

import java.util.ArrayList;

public class State {
	public ArrayList<String> keyVar = new ArrayList<String>();
	public String method = null;
	public boolean hashed = false;
	public int time = 0;

	public int getSize() {
		return keyVar.size();
	}

	public void set(int index, String value) {
		keyVar.add(index,value);
	}

	public String get(int index) {
		return keyVar.get(index);
	}
	
	public void setMethod(String m) {
		method = m;
	}
	
	public String getMethod() {
		return method;
	}

	public void remove(int index) {
		keyVar.remove(index);
	}

	public void copy(State s) {
		for (int j=0; j<s.getSize(); j++) {
			keyVar.add(j,s.get(j));
		}
		if (s.method != null)
			method = new String(s.method);
		time = s.time;
	}
	
	public String toString() {
		StringBuffer sbKeys = new StringBuffer();
		sbKeys.append(keyVar.get(0));
		for (int j=1; j<keyVar.size(); j++) {
			sbKeys.append(",");
			sbKeys.append(keyVar.get(j));
		}
		return sbKeys.toString();
	}

	public void print(int flag) {
		if (flag == 0)
			System.out.println(toString());
		else if (flag == 1)
			System.out.println(toString() + " (" + method + ") " + hashed + " time=" + time);
	}
}

