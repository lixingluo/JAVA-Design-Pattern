package designpattern.State;

public class NormalState extends State {

	public NormalState() {
		// TODO Auto-generated constructor stub
		this.stateString = "NormalState";
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Now it's " + this.stateString);
	}

	@Override
	public void changeState(Screen screen) {
		// TODO Auto-generated method stub
		if(this.stateString == "NormalState") {
			screen.setState(new LargeState());
		} else {
			System.out.println("1 - Error Happened!");
		}
	}
}
