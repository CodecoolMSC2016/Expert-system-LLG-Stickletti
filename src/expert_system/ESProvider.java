package expert_system;

public class ESProvider {
	FactParser factParser;
	RuleParser ruleParser;

	public ESProvider(FactParser factParser, RuleParser ruleParser) {
		this.factParser = factParser;
		this.ruleParser = ruleParser;
	}
}

