package designpattern.abstractfactory;

public class FactoryPaper extends Factory2 {
	@Override
	public Rmb10Paper TenRmb() {
		System.out.println("I created Paper 10");
		return new Rmb10Paper();
	}
	
	@Override
	public Rmb100Paper HundredRmb() {
		System.out.println("I created Paper 100");
		return new Rmb100Paper();
	}
}
