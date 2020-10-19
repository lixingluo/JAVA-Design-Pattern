package designpattern.simplefactory;

public class Client {
	public static void main(String[] args) {
		SimpleFactory factory = new SimpleFactory();
		Rmb rmb1, rmb2;
		rmb1 = factory.getRmb20();
		rmb2 = factory.getRmb100();
		System.out.println("rmb1 value is: " + rmb1.getValue());
		System.out.println("rmb2 value is: " + rmb2.getValue());
	}
}
/**
 * Rmb works as a reused class : each time a new Rmb type added just need to add it as a sub class of Rmb, then add initialize it in the simplefactory class. 
 * Abstract should focus on object/class instead of details
 * 
 * SRP(Single Responsibility Principle) : separate the creation and use of the class
 * 
 * No matter how I change the inilializing of Rmb class in the SimpleFactory class not affect the usage of the Rmb class in the SimpleFactoryClient
 */