package designpattern.iterator.control;

public interface AbstractControl<T> {
	T currentItem();
	void next();
	void forward();
  boolean isLast();
  boolean isFirst();
  
  boolean addChannel(T obj);
  boolean removeChannel(T obj);
  void showList();
}