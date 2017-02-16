package expert_system;

import java.util.HashMap;
import java.util.Map;

public class RuleRepository {
	public int position = 0;
	Map<String, Question> ruleMap = new HashMap<>();

	public Question addQuestion(String id, Question question) {
		ruleMap.put(id, question);
		return question;
	}

	public Iterator getIterator() {
		return new QuestionIterator();
	}

	public class QuestionIterator implements Iterator {

		int index;

		@Override
		public boolean hasNext() {
			if (index < ruleMap.size()) {
				return true;
			}
			return false;
		}

		@Override
		public Object Next() {
			if (this.hasNext()) {
				return map.get((ruleMap.keySet().toArray())[position] );
			position ++;
				//return ruleMap.values();
			}
			return null;
		}
	}
}
