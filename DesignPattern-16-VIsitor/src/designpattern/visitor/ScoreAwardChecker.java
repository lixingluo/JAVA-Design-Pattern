package designpattern.visitor;

public class ScoreAwardChecker extends AwardChecker {
	@Override
	public void visitStudent(Student student) {
		// TODO Auto-generated method stub
		System.out.println(student.getName() + "同学您好, 我是GJJ研究员, 我正在审核你的课堂反馈积分");
	}

	@Override
	public void visitTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		System.out.println(teacher.getName() + "老师您好, 我是GJJ研究员, 我正在审核你的课堂反馈积分");
	}

}
