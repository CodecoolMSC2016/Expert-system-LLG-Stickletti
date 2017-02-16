package expert_system;

import java.util.ArrayList;

public class ESProvider {
	FactParser factParser;
	RuleParser ruleParser;
	public ESProvider(FactParser factParser, RuleParser ruleParser) {
		this.factParser = factParser;
		this.ruleParser = ruleParser;
	}

	public boolean getAnswerByQuestion(String questionID) {
		
			for (int i = 0; i < ruleMap.size() ; i++)
			{if (ruleMap.get((ruleMap.keySet().toArray())[i]).contains(quastionID);
			{
				return answerCollection[i];
			}
				
			}
		
	}

	public void collectAnswers() {
		private boolean elements;
		for (elements : answerCollection)
		{System.out.print(elements);}
	}

	public String evaluate() {
		return null;
	}
}
