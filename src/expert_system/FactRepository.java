package expert_system;

import java.util.ArrayList;

public class FactRepository {

	ArrayList<Fact> factList = new ArrayList<>();

	public Iterator getIterator() {
		return null;
	}

	public void addFact(Fact fact) {

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
