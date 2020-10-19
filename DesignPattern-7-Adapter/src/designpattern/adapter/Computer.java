package designpattern.adapter;

public class Computer {
	private int volume;
	public Computer(int volume) {
		this.volume = volume;
	}
	public void playGames() {
		if(this.volume == 220) {
			Adapter adapter = new Adapter1();
			adapter.transform();
			System.out.println("Successfully playing games");
		} else if(this.volume == 330) {
			Adapter adapter = new Adapter2();
			adapter.transform();
			System.out.println("Successfully playing games");
		} else {
			System.out.println("No suitable adapter, give up");
		}
	}
}
