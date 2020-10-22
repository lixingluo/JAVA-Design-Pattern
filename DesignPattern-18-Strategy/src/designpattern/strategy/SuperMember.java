package designpattern.strategy;

public class SuperMember extends Customer {
	private State state;

	@Override
	public void setMoney(int money) {
		// TODO Auto-generated method stub
		super.setMoney(money);
		if (this.getMoney() >= 5000) {
			this.state = new VipValidState();
		} else {
			this.state = new VipNotValidState();
		}
	}

	@Override
	public void buy() {
		// TODO Auto-generated method stub
		this.state.buy(this);
	}

}
