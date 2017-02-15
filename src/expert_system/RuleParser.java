package expert_system;

import java.io.File;
import java.io.FileInputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class RuleParser extends XmlParser {

	String fileName = "rules.xml";
	NodeList nodeList;

	public RuleRepository getRuleRepository() {
		RuleRepository ruleRepo = new RuleRepository();
		loadXmlDocument(fileName);
		String id;
		String question;
		Node node;
		Element element;
		Node questionNode;
		Question q;
		for (int i = 0; i < nodeList.getLength(); i++) {
			node = nodeList.item(i);
			element = (Element) node;
			id = element.getAttribute("id");
			questionNode = element.getElementsByTagName("Question").item(0);
			question = questionNode.getTextContent();

			getValue(element);
			q = new Question(question);
			ruleRepo.addQuestion(id, q);
		}

		return ruleRepo;
	}

	public Value getValue(Element element) {
		Node answerNode = element.getElementsByTagName("Answer").item(0);
		NodeList selections = ((Element) answerNode).getElementsByTagName("Selection");
		Node selection1 = selections.item(0);
		Node selection2 = selections.item(1);
		NodeList trueChild = ((Element) selection1).getChildNodes();
		Node trueValues = trueChild.item(1);
		NodeList falseChild = ((Element) selection2).getChildNodes();
		Node falseValues = falseChild.item(1);
		String trueElement = ((Element) trueValues).getAttribute("value");
		String falseElement = ((Element) falseValues).getAttribute("value");
		return null;

	}

	@Override
	public void loadXmlDocument(String fullPath) {

		try {

			FileInputStream file = new FileInputStream(new File(fullPath));
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(file);
			doc.getDocumentElement().normalize();
			nodeList = doc.getElementsByTagName("Rule");

		} catch (Exception e) {

			System.out.println("Sorry but I was unable to open your data file");
			e.printStackTrace();

		}
	}
}
