package expert_system;

import java.io.File;
import java.io.FileInputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class FactParser extends XmlParser {

	String fileName = "facts.xml";
	NodeList nodeList;

	public FactRepository getFactRepository() {
		FactRepository factRepo = new FactRepository();
		loadXmlDocument(fileName);
		Node node;
		Element element;
		String factId;

		for (int i = 0; i < nodeList.getLength(); i++) {
			node = nodeList.item(i);
			element = ((Element) node);
			factId = element.getAttribute("id");
			System.out.println(factId);

			Node descriptNode = element.getElementsByTagName("Description").item(0);
			String description = descriptNode.getTextContent();

		}

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
			nodeList = doc.getElementsByTagName("Fact");

		} catch (Exception e) {

			System.out.println("Sorry but I was unable to open your data file");
			e.printStackTrace();

		}
	}
}

