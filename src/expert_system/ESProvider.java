package expert_system;

import java.util.ArrayList;

public class ESProvider {
	FactParser factParser;
	RuleParser ruleParser;

	public ESProvider(FactParser factParser, RuleParser ruleParser) {
		this.factParser = factParser;
		this.ruleParser = ruleParser;
	}
	Map<String, Question,Boolean> evalMap = new HashMap<>();
	public ArrayList<E> <String> answerCollection = new Arraylist <>;
	
	public boolean getAnswerByQuestion(String questionID)
	{
	}

	public void collectAnswers() {
		answerCollection.add(this.toString());
	}

	public String evaluate() {
		return null;
	}
}

