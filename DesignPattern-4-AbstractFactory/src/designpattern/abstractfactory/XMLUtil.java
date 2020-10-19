package designpattern.abstractfactory;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XMLUtil {
	public static Object getData(String name, int index) {
		DocumentBuilderFactory dfactory = DocumentBuilderFactory.newInstance();
		try {
			DocumentBuilder dbuilder = dfactory.newDocumentBuilder();
			Document doc = dbuilder.parse("config.xml");
			
			NodeList nodeList = doc.getElementsByTagName(name);
			Node node = nodeList.item(index).getFirstChild();
			String nodeName = node.getNodeValue();
			System.out.println(nodeName);
			
			Class c = Class.forName(nodeName);
			Object obj = c.newInstance();
			return obj;
		} catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
