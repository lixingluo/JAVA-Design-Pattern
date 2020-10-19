package designpattern.adapter;

public class PowerSource1 extends PowerSource {

	protected PowerSource1() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Successfully transform 220v to 20v");
	}

}
