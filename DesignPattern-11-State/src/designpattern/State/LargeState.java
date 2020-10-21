package designpattern.State;

public class LargeState extends State {

	public LargeState() {
		// TODO Auto-generated constructor stub
		this.stateString = "LargeState";
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Now it's " + this.stateString);
	}

	@Override
	public void changeState(Screen screen) {
		// TODO Auto-generated method stub
		if(this.stateString == "LargeState") {
			screen.setState(new LargestState());
		}	else {
			System.out.println("2 - Error Happened!");
		}
	}

}
