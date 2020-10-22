package designpattern.visitor;

public class Student extends People {
	public Student(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void accept(AwardChecker checker) {
		// TODO Auto-generated method stub
		checker.visitStudent(this);
	}


}
