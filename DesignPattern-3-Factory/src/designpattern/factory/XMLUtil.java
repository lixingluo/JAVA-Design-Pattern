package designpattern.factory;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XMLUtil {
	public static Object getData(String nodeName, int index) {
		DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
		try {
			DocumentBuilder dBuilder = dFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(new File("config.xml"));
			
			NodeList nl = doc.getElementsByTagName(nodeName);
			Node classNode = nl.item(index).getLastChild(); 
			String className = classNode.getNodeValue();
			System.out.println(className);
			
			Class c= Class.forName(className);
			Object object = c.newInstance();
			return object;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
/**
 * Single Responsibility principle && Open–closed principle
 * To Spring Framework - AOP(Aspect Oriented Programming), IOC(Inversion of Control) important
 */