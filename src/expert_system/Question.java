package expert_system;

public class Question {

	private String question;
	private Answer answerEvaluater;

	public String getQuestion() {

		return question;
	}

	public Question(String question) {

		this.question = question;

	}

	public void setAnswerEvaluator(Answer answer) {

		this.answerEvaluater = answer;

	}

	public boolean getEvaluatedAnswer(String input) {

		Boolean boolvalue;
		boolvalue = answerEvaluater.evaluateAnswerbyInput(input);

		return boolvalue;
	}
}
