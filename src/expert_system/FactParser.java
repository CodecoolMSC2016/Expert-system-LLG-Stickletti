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

		for (int i = 0; i < nodeList.getLength(); i++) {
			Node node = nodeList.item(i);
			Node tempNode = ((Element) node).getElementsByTagName("Description").item(0);
			Element element = (Element) tempNode;
			System.out.println(element.getAttribute("value"));

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

