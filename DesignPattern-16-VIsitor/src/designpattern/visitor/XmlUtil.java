package designpattern.visitor;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XmlUtil {
	public static Object getObject(String nodeName, Integer index) {
		DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
		try {
			DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
			Document doc = documentBuilder.parse("config.xml");
			
			NodeList nodeList = doc.getElementsByTagName(nodeName);
			Node node = nodeList.item(index).getFirstChild();
			String className = node.getNodeValue();
			
			Class c = Class.forName(className);
			Object object = c.newInstance();
			return object;
		} catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
