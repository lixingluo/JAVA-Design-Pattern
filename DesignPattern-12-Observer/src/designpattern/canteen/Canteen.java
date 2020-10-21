package designpattern.canteen;

import java.util.ArrayList;
import java.util.List;

public class Canteen {	
	
	List<Observer> observers = new ArrayList<>();
	
	public void addObserver(Observer observer) {
		observers.add(observer);
	}
	
	public void raisePrice() {
		notifyServer();
	}
	
	public void notifyServer() {
		for(Observer observer : observers) {
			observer.reject();
		}
	}
}
