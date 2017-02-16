package expert_system;

public abstract class SingleValue extends Value {

	private String trueValue;
	private String falseValue;

	public SingleValue(String param) {
		this.trueValue = param;

	}

	public String getTrueValue() {
		
		return trueValue;

	}

	public String getFalseValue() {
		return falseValue;

	}

	public void setFalseValue(String param) {
		falseValue = param;

	}
	public void setTruevalue(String param) {
		trueValue = param;

	}
}
}

