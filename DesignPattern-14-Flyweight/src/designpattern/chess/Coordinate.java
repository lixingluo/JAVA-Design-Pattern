package designpattern.chess;

public class Coordinate {
	private int xLabel, yLabel;
	
	public Coordinate(int xLabel, int yLabel) {
		// TODO Auto-generated constructor stub
		this.xLabel = xLabel;
		this.yLabel = yLabel;
	}
	
	public void show() {
		System.out.println("Row: " + this.xLabel + "; Column: " + this.yLabel);
	}
}
