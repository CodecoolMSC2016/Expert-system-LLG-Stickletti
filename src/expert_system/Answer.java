package expert_system;

public class Answer {

	private Value value;

	public boolean evaluateAnswerbyInput(String input) {
		input = input.toLowerCase();
		if (input.equals(value) && input == "yes") {
			return true;
		}
		return false;

	}

	public void addValue(Value value) {

		this.value = value;
	}

	public String[] getInputPattern() {
		// ez MI?
		return value.getInputPattern();
	}
}

