package designpattern.factory;

public class Factory10 extends Factory {
	@Override
	public Rmb product() {
		return new Rmb10();
	}
}
