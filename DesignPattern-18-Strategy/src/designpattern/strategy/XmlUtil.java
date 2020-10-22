package designpattern.strategy;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XmlUtil {
	public static Object getObject(String name, int index) {
		DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
		
		try {
			DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
			Document document = documentBuilder.parse("config.xml");
			
			NodeList nodeList = document.getElementsByTagName(name);
			Node node = nodeList.item(index).getFirstChild();
			
			System.out.println(node.getNodeName() + " : " + node.getNodeValue());
			
			Class class1 = Class.forName(node.getNodeValue());
			Object object = class1.newInstance();
			return object;
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}
}
