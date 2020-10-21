package designpattern.component;

public class Cover extends Decorator {

	public Cover(Component component) {
		// TODO Auto-generated constructor stub
		super(component);
	}
	
	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Get the Cover");
		super.show();
	}
}
