package designpattern.iterator.control;

import java.util.List;

import designpattern.iterator.tv.ConcreteTV;

public class ConcreteControl<T> implements AbstractControl<T> {
	private final List<T> list;
	private int cursor;
	private ConcreteTV<T> tv;

	public ConcreteControl(ConcreteTV<T> concreteTV) {
		// TODO Auto-generated constructor stub
		this.list = concreteTV.getList();
		this.cursor = 0;
		this.tv = concreteTV;
	}

	@Override
	public T currentItem() {
		// TODO Auto-generated method stub
		if(this.list.size() > 0) 
			return this.list.get(cursor);
		else {
			return null;
		}
	}

	@Override
	public void next() {
		// TODO Auto-generated method stub
		if (cursor < list.size()) {
			cursor++;
		}
	}

	@Override
	public void forward() {
		// TODO Auto-generated method stub
		if (cursor > -1) {
			cursor--;
		}
	}

	@Override
	public boolean isLast() {
		// TODO Auto-generated method stub
		if(list.size() > 0)
			return (cursor == list.size() - 1);
		else {
			return true;
		}
	}

	@Override
	public boolean isFirst() {
		// TODO Auto-generated method stub
		if(list.size() > 0)
			return (cursor == 0);
		else {
			return true;
		}
	}

	@Override
	public boolean addChannel(T obj) {
		// TODO Auto-generated method stub
		return this.tv.addObject(obj);
	}

	@Override
	public boolean removeChannel(T obj) {
		// TODO Auto-generated method stub
		return this.tv.removeObject(obj);
	}

	@Override
	public void showList() {
		// TODO Auto-generated method stub
		for (int i = 0; i < list.size(); i++) {
			System.out.println(this.list.get(i).toString());
		}
	}
}
