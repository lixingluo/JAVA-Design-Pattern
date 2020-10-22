package designpattern.strategy;

public class Main {
	public static void main(String[] args) {
		Customer customer1, customer2, customer3, customer4;

		customer1 = (Customer) XmlUtil.getObject("customer", 0);
		customer2 = (Customer) XmlUtil.getObject("customer", 1);
		customer3 = (Customer) XmlUtil.getObject("customer", 2);
		customer4 = (Customer) XmlUtil.getObject("customer", 2);

		customer1.setNameString("AAA");
		customer1.setMoney(2000);

		customer2.setNameString("BBB");
		customer2.setMoney(3000);

		customer3.setNameString("CCC");
		customer3.setMoney(5000);

		customer4.setNameString("DDD");
		customer4.setMoney(4000);

		SuperMarket superMarket = new SuperMarket();
		superMarket.welcome();
		superMarket.buy(customer1);
		superMarket.buy(customer2);
		superMarket.buy(customer3);
		superMarket.buy(customer4);
		superMarket.banner();
	}
}
