package designpattern.factory;

public class Factory100 extends Factory {
	@Override
	public Rmb product() {
		return new Rmb100();
	}
}
