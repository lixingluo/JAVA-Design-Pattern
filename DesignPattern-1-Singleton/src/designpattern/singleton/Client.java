package designpattern.singleton;

import java.lang.reflect.Constructor;

public class Client {
	public static void main(String[] args) {
		/**
		 * Singleton1 singletonX = new Singleton1(); - error - private default
		 * constructor
		 */
		Singleton1 singleton1, singleton2, singleton3;
		singleton1 = Singleton1.getInstance();
		singleton2 = Singleton1.getInstance();
		singleton3 = Singleton1.getInstance();

		if (singleton1 == singleton2 && singleton2 == singleton3 && singleton3 == singleton1) {
			System.out.println("These three singleton1s are same object");
		} else {
			System.out.println("These three singleton1s are totally different");
		}

		Singleton2 singleton4, singleton5, singleton6;

		singleton4 = Singleton2.getInstance();
		singleton5 = Singleton2.getInstance();
		singleton6 = Singleton2.getInstance();

		if (singleton4 == singleton5 && singleton4 == singleton6 && singleton5 == singleton6) {
			System.out.println("These three singleton2s are same object");
		} else {
			System.out.println("These three singleton2s are totally different");
		}

		try {
			Constructor<Singleton1> con = Singleton1.class.getDeclaredConstructor();
			con.setAccessible(true);

			// 通过反射获取实例
			Singleton1 single1 = (Singleton1) con.newInstance();
			Singleton1 single2 = (Singleton1) con.newInstance();

			if (singleton1 == single1) {
				System.out.println("通过java 反射技术生成的对象和 单例模式生成的对象相同！");
			} else {
				System.out.println("通过java 反射技术生成的对象和 单例模式生成的对象不同！");
			}
			if (single2 == single1) {
				System.out.println("通过java 反射技术生成的对象相同！");
			} else {
				System.out.println("通过java 反射技术生成的对象不同！");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		// Class c = Class.forName("designpattern.singleton.Singleton1");
		// Object object = c.newInstance();//生成一个对象
		//
		// if(singleton1 == object){
		// System.out.println("singleton 1 = object,即单例模式和反射机制生成的对象相同！");
		// }
		// else
		// {
		// System.out.println("singleton 1 ！= object,即单例模式和反射机制生成的对象不同！");
		// }
	}
}
