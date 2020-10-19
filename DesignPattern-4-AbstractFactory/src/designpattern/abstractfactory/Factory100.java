package designpattern.abstractfactory;

public class Factory100 extends Factory {
	@Override
	public Coin productCoin() {
		System.out.println("I create 100 Coin");
		return new Coin100();
	}
	
	@Override
	public Paper productPaper() {
		System.out.println("I create 100 Paper");
		return new Paper100();
	}
}
