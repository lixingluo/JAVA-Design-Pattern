package designpattern.visitor;

public class Client {
	public static void main(String[] args) {
		People studentA, studentB, teacherA, teacherB;
		
		ObjectStructure objstructure = new ObjectStructure();
		
		studentA = new Student("Aaron");
		studentB = new Student("Ada");
		teacherA = new Teacher("Baird");
		teacherB = new Teacher("Baldwin");
		
		objstructure.add(studentA);
		objstructure.add(studentB);
		objstructure.add(teacherA);
		objstructure.add(teacherB);
		
		AwardChecker award1, award2;
		award1 = (AwardChecker) XmlUtil.getObject("people", 0);
		award2 = (AwardChecker) XmlUtil.getObject("people", 1);
		objstructure.accept(award1);
		objstructure.accept(award2);
		/***
		 * 访问者模式:
		 * 不同的人处理相同的事情有着不同的方法
		 * 
		 * 相同的访问者可以以不同的方式访问不同的元素(award1, studentA, teacherA)
		 * 相同的元素可以接受不同访问者以不同访问方式访问(studentA, award1, award2)
		 * 
		 */
	}
}
