package designpattern.State;

public class Client {
	public static void main(String[] args) {
		Screen screen = new Screen();
		screen.display();
		screen.click();
		screen.display();
		screen.click();
		screen.display();
		screen.click();
		screen.display();
	}
}
