package expert_system;

import java.util.HashMap;
import java.util.Map;

public class RuleRepository {

	Map<String, Question> ruleMap = new HashMap<>();

	public Question addQuestion(String id, Question question) {
		ruleMap.put(id, question);
		return question;
	}

	public Iterator getIterator() {
		return null;
	}

	class QuestionIterator implements Iterator {

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public Object Next() {
			// TODO Auto-generated method stub
			return null;
		}
	}
}
