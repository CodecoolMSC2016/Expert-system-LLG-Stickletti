package expert_system;

public abstract class SingleValue extends Value {

	private String trueValue;
	private String falseValue;

	public SingleValue(String trueValue) {
		this.trueValue = trueValue;

	}

	public String getTrueValue() {
		return trueValue;

	}

	public String getFalseValue() {
		return falseValue;

	}

	public void setFalseValue(String falseValue) {
		this.falseValue = falseValue;

	}
}

