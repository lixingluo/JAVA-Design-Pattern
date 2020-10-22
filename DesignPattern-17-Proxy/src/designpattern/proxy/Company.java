package designpattern.proxy;

public class Company extends Subject {
	Investment investment1 = new Share();
	Investment investment2 = new Share();
	Investment investment3 = new Bond();
	
	public void display() {
		System.out.println("I am Company A");
	}
	
	@Override
	public void buy(Investor investor) {
		// TODO Auto-generated method stub
		investment1.buy(investor);
		investment2.buy(investor);
		investment3.buy(investor);
	}

	@Override
	public void redemption(Investor investor) {
		// TODO Auto-generated method stub
		investment1.redemption(investor);
		investment2.redemption(investor);
		investment3.redemption(investor);
	}

}
