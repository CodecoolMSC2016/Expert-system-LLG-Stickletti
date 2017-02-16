package expert_system;

import java.util.ArrayList;

public class ESProvider {
	FactParser factParser;
	RuleParser ruleParser;

	public ESProvider(FactParser factParser, RuleParser ruleParser) {
		this.factParser = factParser;
		this.ruleParser = ruleParser;
	}

	public ArrayList<String> answerCollection = new ArrayList<>();

	public boolean getAnswerByQuestion(String questionID) {

		return false;
	}

	public void collectAnswers() {
		answerCollection.add(this.toString());
	}

	public String evaluate() {
		return null;
	}
}
