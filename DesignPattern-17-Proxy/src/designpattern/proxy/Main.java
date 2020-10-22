package designpattern.proxy;

public class Main {
	public static void main(String[] args) {
		Investor laozhang = new Investor(20000, "老张");
		Company companyA = new Company();
		companyA.buy(laozhang);
		companyA.redemption(laozhang);
 	}
}
