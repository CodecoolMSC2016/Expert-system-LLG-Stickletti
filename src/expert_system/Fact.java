package expert_system;

import java.util.Set;

public class Fact {

	String id;
	boolean value;

	public void setFactValueByID(String id, boolean value) {
		this.id = id;
		this.value = value;
	}

	public Set<String> getIDSet() {
		return null;
	}

	public boolean getValueByID() {
		return false;
	}

	public String getDescription() {
		return null;
	}

	public Fact(String description) {

	}
}

