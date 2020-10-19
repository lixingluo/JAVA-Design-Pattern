package designpattern.adapter;

public class Adapter1 extends Adapter {
	private PowerSource1 powerSource = new PowerSource1();
	@Override
	public void transform() {
		powerSource.show();
	}
	
}
