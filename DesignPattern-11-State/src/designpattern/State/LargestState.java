package designpattern.State;

public class LargestState extends State {

	public LargestState() {
		// TODO Auto-generated constructor stub
		this.stateString = "LargestState";
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Now it's " + this.stateString);
	}

	@Override
	public void changeState(Screen screen) {
		// TODO Auto-generated method stub
		if(this.stateString == "LargestState") {
			screen.setState(new NormalState());
		}	else {
			System.out.println("3 - Error Happened!");
		}
	}

}
