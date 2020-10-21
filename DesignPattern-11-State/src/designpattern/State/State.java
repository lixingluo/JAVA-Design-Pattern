package designpattern.State;

public abstract class State {
	protected String stateString;
	public abstract void display();
	public abstract void changeState(Screen screen);
}
