package expert_system;

public abstract class MultipleValue extends Value {

	private String[] trueValue;
	private String[] falseValue;

	public MultipleValue(String trueValue) {
		this.trueValue = trueValue.split(",");

	}

	public String[] getTrueValue() {
		return trueValue;

	}

	public String[] getFalseValue() {
		return falseValue;

	}

	public void setFalseValue(String falseValue) {
		this.falseValue = falseValue.split(",");

	}
}

