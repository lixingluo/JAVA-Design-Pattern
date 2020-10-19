package designpattern.adapter;

public class Adapter2 extends Adapter {
	private PowerSource2 powerSource = new PowerSource2();
	@Override
	public void transform() {
		powerSource.show();
	}

}
