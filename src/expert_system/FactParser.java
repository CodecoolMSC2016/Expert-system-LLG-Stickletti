package expert_system;


import java.io.File;
import java.io.FileInputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

public class FactParser implements XmlParser {

	String fileName = "facts.xml";

	public FactRepository getFactRepository() {

		loadXmlDocument(fileName);
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
			NodeList nodelist = doc.getElementsByTagName("Fact");

		} catch (Exception e) {

			System.out.println("Sorry but I was unable to open your data file");
			e.printStackTrace();

		}
	}
}
