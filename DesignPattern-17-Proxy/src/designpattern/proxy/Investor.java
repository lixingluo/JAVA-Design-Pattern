package designpattern.proxy;

public class Investor {
	private int money;
	private String name;
	
	public int getMoney() {
		return this.money;	
	}
	
	public String getName() {
		return this.name;
	}
	
	public void buy(int amount) {
		this.money -= amount;
	}
	
	public void redemption(int amount) {
		this.money += amount;
	}
	
	public Investor(int money, String name) {
		this.money = money;
		this.name = name;
	}
}
