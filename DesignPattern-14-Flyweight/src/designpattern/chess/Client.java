package designpattern.chess;

public class Client {
	public static void main(String[] args) {
		Chess blackChess1, blackChess2, whiteChess1, whiteChess2;
		
		FlyweightFactory flyweightFactory = FlyweightFactory.getInstance();
		
		blackChess1 = flyweightFactory.getColor("b");
		blackChess2 = flyweightFactory.getColor("b");
		whiteChess1 = flyweightFactory.getColor("w");
		whiteChess2 = flyweightFactory.getColor("w");
		
		System.out.println("Is blackChess1 equal to blackChess2 ? " + (blackChess1 == blackChess2));
		System.out.println("Is whiteChess1 equal to whiteChess2 ? " + (whiteChess1 == whiteChess2));
		
		blackChess1.show(new Coordinate(1, 2));
		blackChess2.show(new Coordinate(3, 4));
		whiteChess1.show(new Coordinate(5, 6));
		whiteChess2.show(new Coordinate(7, 8));
		
		blackChess1.display();
		blackChess2.display();
		whiteChess1.display();
		whiteChess2.display();
	}
}
