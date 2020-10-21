package designpattern.component;

public class Label extends Decorator {

	public Label(Component component) {
		// TODO Auto-generated constructor stub
		super(component);
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Get the Label");
		super.show();
	}
}
