package expert_system;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

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
		
			for (int i = 0; i < ruleMap.size() ; i++)
			{
				if (ruleMap.get((ruleMap.keySet().toArray())[i]).contains(questionID);
			{
				return (boolean)answerCollection.toArray()[i];
			}
			}
		
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
