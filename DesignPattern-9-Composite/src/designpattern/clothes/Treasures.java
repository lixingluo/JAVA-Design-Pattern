package designpattern.clothes;

import java.util.ArrayList;
import java.util.List;

public class Treasures extends Dress {

	List<Dress> dressList = new ArrayList<>();
	@Override
	protected void show() {
		// TODO Auto-generated method stub
		for(Dress dress : dressList) {
			dress.show();
		}
	}
	
	public void add(Dress dress) {
		dressList.add(dress);
	}

	@Override
	public void operate() {
		// TODO Auto-generated method stub
		this.show();
	}
}
