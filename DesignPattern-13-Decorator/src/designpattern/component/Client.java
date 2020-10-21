package designpattern.component;

public class Client {
	public static void main(String[] args) {
		Component book = new Book("C++");
		Component cover = new Cover(book);
		Component label = new Label(cover);
		
		label.show();
	}
}
