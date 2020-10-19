package designpattern.iterator.tv;

import java.util.List;

import designpattern.iterator.control.AbstractControl;

public abstract class AbstractTV<T> {
	protected List<T> list; 
	public AbstractTV(List<T> list) {
		this.list = list;
	}
	public List<T> getList() {
		return this.list;
	}
	public boolean addObject(T obj) {
		return this.list.add(obj);
	}
	public boolean removeObject(T obj) {
		return this.list.remove(obj);
	}
	/***
	 * 在这个类中，我们并没有直接将持有的大量对象放在该类中，而是通过构造注入的方法，在Client类中将新建的对象，通过构造注入的方法，使实体聚合对象拥有这些对象
	 */
	public abstract AbstractControl<T> createIterator();
}
