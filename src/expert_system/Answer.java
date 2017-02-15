package expert_system;

public class Answer {

	private Value value;

	public boolean evaluateAnswerbyInput(String input) {

		return false;
	}

	public void addValue(Value value) {

		this.value = value;
	}

	public String[] getInputPatter() {

		return value.getInputPattern();
	}
}

