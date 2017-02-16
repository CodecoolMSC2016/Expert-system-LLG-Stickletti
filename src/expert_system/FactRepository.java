package expert_system;

import java.util.ArrayList;

public class FactRepository {

	ArrayList<Fact> factList = new ArrayList<>();

	public Iterator getIterator() {
		return new FactIterator();
	}

	public void addFact(Fact fact) {
		factList.add(fact);

	}

	class FactIterator implements Iterator {

		int index;

		@Override
		public boolean hasNext() {
			if (index < factList.size()) {
				return true;
			}
			return false;
		}

		@Override
		public Object Next() {
			if (this.hasNext()) {
				return factList.get(index);
			}
			return null;
		}
	}
}
