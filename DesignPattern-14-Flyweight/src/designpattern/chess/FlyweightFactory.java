package designpattern.chess;

import java.util.Hashtable;

public class FlyweightFactory {
	private static FlyweightFactory flyweightFactory = null;
	private static Hashtable<String, Chess> hashtable = null;
	
	private FlyweightFactory() {
		// TODO Auto-generated constructor stub
	}
	
	public static FlyweightFactory getInstance() {
		if(flyweightFactory == null) {
			synchronized (FlyweightFactory.class) {
				if(flyweightFactory == null) {
					flyweightFactory = new FlyweightFactory();
				}
			}
		}
		
		if(hashtable == null) {
			synchronized (FlyweightFactory.class) {
				if(hashtable == null) {
					hashtable = new Hashtable<String, Chess>();
					Chess blackChess = new WhiteChess();
					Chess whiteChess = new BlackChess();
					hashtable.put("b", blackChess);
					hashtable.put("w", whiteChess);
				}
			}
		}
		
		return flyweightFactory;
	}
	
	public Chess getColor(String color) {
		return hashtable.get(color);
	}
}
