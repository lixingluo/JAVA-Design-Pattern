package designpattern.chess;

public abstract class Chess {
	public abstract void display();
	Coordinate coordinate;
	public void show(Coordinate coordinate) {
		this.coordinate = coordinate;
		this.coordinate.show();
	}
}
