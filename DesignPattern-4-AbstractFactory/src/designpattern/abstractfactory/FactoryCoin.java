package designpattern.abstractfactory;

public class FactoryCoin extends Factory2 {
	@Override
	public Rmb10Coin TenRmb() {
		System.out.println("I created Coin 10");
		return new Rmb10Coin();
	}
	
	@Override
	public Rmb100Coin HundredRmb() {
		System.out.println("I created Coin 100");
		return new Rmb100Coin();
	}
}
