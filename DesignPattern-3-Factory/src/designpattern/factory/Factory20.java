package designpattern.factory;

public class Factory20 extends Factory {
	@Override
	public Rmb product() {
		return new Rmb20();
	}
}
