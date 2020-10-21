package designpattern.State;

public class Screen {
	State state;
	public Screen() {
		// TODO Auto-generated constructor stub
		this.state = new NormalState();
	}
	
	public void setState(State state) {
		this.state = state;
	}
	
	public void click() {
		this.state.changeState(this);
	}
	
	public void display() {
		this.state.display();
	}
}
