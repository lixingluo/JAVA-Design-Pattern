package designpattern.visitor;

public class Teacher extends People {

	public Teacher(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void accept(AwardChecker checker) {
		// TODO Auto-generated method stub
		checker.visitTeacher(this);
	}

}
