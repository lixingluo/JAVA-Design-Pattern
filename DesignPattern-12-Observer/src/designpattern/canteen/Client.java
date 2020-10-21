package designpattern.canteen;

public class Client {
	public static void main(String[] args) {
		Student student = new Student();
		Teacher teacher = new Teacher();
		
		Canteen canteen = new Canteen();
		canteen.addObserver(student);
		canteen.addObserver(teacher);
		
		canteen.raisePrice();
	}
}
