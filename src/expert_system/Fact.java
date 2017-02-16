package expert_system;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Fact {

	String id;
	boolean value;
	String description;
	Map<String, Boolean> factMap = new HashMap<>();

	public void setFactValueByID(String id, boolean value) {

		this.id = id;
		this.value = value;

		factMap.put(id, value);
	}

	public Set<String> getIDSet() {

		return factMap.keySet();
	}

	public boolean getValueByID() {
		return factMap.get(id);
	}

	public String getDescription() {
		return null;
	}

	public Fact(String description) {
		this.description = description;
	}
}
