package designpattern.visitor;

public abstract class AwardChecker {	
	public abstract void visitStudent(Student student);
	public abstract void visitTeacher(Teacher teacher);
}
