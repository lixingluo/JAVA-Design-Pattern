package designpattern.abstractfactory;

public class Factory10 extends Factory {
	@Override
	public Coin productCoin() {
		System.out.println("I create 10 Coin");
		return new Coin10();
	}
	
	@Override
	public Paper productPaper() {
		System.out.println("I create 10 Paper");
		return new Paper10();
	}
}
