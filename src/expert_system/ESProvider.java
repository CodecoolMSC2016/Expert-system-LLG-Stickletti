package expert_system;

import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;

public class ESProvider {
	FactParser factParser;
	RuleParser ruleParser;
	private Map<String, Question> ruleMap = RuleRepository.ruleMap;
	public ArrayList<Value> answerCollection = Answer.answerCollection;

	public ESProvider(FactParser factParser, RuleParser ruleParser) {
		this.factParser = factParser;
		this.ruleParser = ruleParser;
	}

	public boolean getAnswerByQuestion(String questionID) {
		int answerindex = 0;
		for (Entry<String, Question> elements : ruleMap.entrySet()) {
			if (elements.getKey().contains(questionID)) {
				return (boolean) answerCollection.toArray()[answerindex];
			}
			answerindex++;
		}
		return false;
	}

	public void collectAnswers() {

		for (Value elements : answerCollection) {
			System.out.print(elements.toString());
		}

	}

	public String evaluate() {
		return null;
	}
}
