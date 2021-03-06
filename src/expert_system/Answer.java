package expert_system;

import java.util.ArrayList;

public class Answer {

	private Value value;
	public static ArrayList<Value> answerCollection = new ArrayList<>();

	public boolean evaluateAnswerbyInput(String input) {
		input = input.toLowerCase();
		if (input.equals(value) && input == "yes") {
			answerCollection.add(value);
			return true;
		}
		answerCollection.add(value);
		return false;

	}

	public void addValue(Value value) {

		this.value = value;
	}

	public String[] getInputPattern() {
		return value.getInputPattern();
	}
}

