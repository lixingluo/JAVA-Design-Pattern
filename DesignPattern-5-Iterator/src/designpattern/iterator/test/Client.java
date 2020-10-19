package designpattern.iterator.test;

import java.util.ArrayList;
import java.util.List;

import designpattern.iterator.control.AbstractControl;
import designpattern.iterator.tv.AbstractTV;
import designpattern.iterator.tv.ConcreteTV;

public class Client {
	public static void main(String[] args) {
		List<String> newList = new ArrayList<String>() {
			{
				add("笑傲江湖");
				add("天下第一");
				add("倚天屠龙记");
			}
		};
		AbstractTV<String> abstractTV = new ConcreteTV<String>(newList);
		AbstractControl<String> control = abstractTV.createIterator();

		// ConcreteTV<String> concreteTV = new ConcreteTV<String>(newList);
		// AbstractControl<String> control = new ConcreteControl<String>(concreteTV);

		System.out.println("第一次打开电视节目列表:");
		control.showList();
		control.addChannel("独孤九剑");
		System.out.println("第二次打开电视节目列表:");
		control.showList();
		control.removeChannel("天下第一");
		System.out.println("第三次打开电视节目列表:");
		control.showList();

		System.out.println("现在在看的电视节目: " + control.currentItem());
		while (!control.isLast()) {
			control.next();
			System.out.println("现在在看的电视节目: " + control.currentItem());
		}
		while (!control.isFirst()) {
			control.forward();
			System.out.println("现在在看的电视节目: " + control.currentItem());
		}
	}
}
