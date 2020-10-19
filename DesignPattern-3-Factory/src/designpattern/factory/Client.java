package designpattern.factory;

public class Client {
	public static void main(String[] args) {
		Rmb rmb100;
		Rmb rmb20;
		Rmb rmb10;
		
		Factory factory100;
		Factory factory20;
		Factory factory10;

		factory100 = (Factory) XMLUtil.getData("factory", 0);
		factory20 = (Factory) XMLUtil.getData("factory", 1);
		factory10 = (Factory) XMLUtil.getData("factory", 2);
		/**
		 * getData - input the node item value, not its content value, return a specific class
		 */
		rmb100 = factory100.product();
		rmb20 = factory20.product();
		rmb10 = factory10.product();
		
		System.out.println("rmb100 value is: " + rmb100.value());
		System.out.println("rmb20 value is: " + rmb20.value());
		System.out.println("rmb10 value is: " + rmb10.value());
	}
}
