package expert_system;

import sun.awt.SunHints.Value;

public class Answer {

	private Value value;
	

	public boolean evaluateAnswerbyInput(String input) {
		input=input.toLowerCase();
		if (input.equals(value) && input == "yes"))
		{ return true;
		}
		}
		return false;
	}
	public void addValue(Value value) {

		this.value = value;
	}

	public String[] getInputPattern() {
		
		return value.getInputPattern();
	}
}

