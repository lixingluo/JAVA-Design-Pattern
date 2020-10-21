package designpattern.component;

public abstract class Decorator extends Component{
	Component component;
	public Decorator(Component component) {
		// TODO Auto-generated constructor stub
		this.component = component;
	}
	public void show() {
		component.show();
	}
}
