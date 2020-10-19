package designpattern.adapter;

public class Client {
	public static void main(String[] args) {
		Computer newComputer = new Computer(330);
		newComputer.playGames();
	}
}
