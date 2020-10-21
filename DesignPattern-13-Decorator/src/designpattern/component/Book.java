package designpattern.component;

public class Book extends Component {

	public String name;
	
	public Book(String name) {
		// TODO Auto-generated constructor stub
		this.name = "This is " + name + " book";
	}
	
	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println(this.name);
	}
}
