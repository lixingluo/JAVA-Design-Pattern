package designpattern.prototype;

public class Client {
	public static void main(String[] args) {
		Master master1 = new Master();
		master1.setName("zs");
		master1.setNum(1);
		master1.setStatus(0);
		master1.display();
		
		Master master2 = new Master();
		master2.copy(master1);
		master2.display();
		
		Master master3;
		master3 = master1.clone();
		master3.display();
	}
}
