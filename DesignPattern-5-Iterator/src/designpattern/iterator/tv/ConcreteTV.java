package designpattern.iterator.tv;

import java.util.List;

import designpattern.iterator.control.ConcreteControl;
import designpattern.iterator.control.AbstractControl;

public class ConcreteTV<T> extends AbstractTV<T>{

	public ConcreteTV(List<T> list) {
		super(list);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public AbstractControl<T> createIterator() {
		return new ConcreteControl<T>(this);
	}
}
