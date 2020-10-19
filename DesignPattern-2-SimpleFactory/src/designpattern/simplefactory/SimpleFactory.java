package designpattern.simplefactory;

public class SimpleFactory {
	public Rmb getRmb20() {
		return new Rmb20();
	}
	public Rmb getRmb100() {
		return new Rmb100();
	}
}
