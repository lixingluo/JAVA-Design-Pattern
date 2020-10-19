package designpattern.test;

import designpattern.clothes.Dress;
import designpattern.clothes.Pants;
import designpattern.clothes.Shirt;
import designpattern.clothes.Skirt;
import designpattern.clothes.Treasures;

public class Main {
	public static void main(String[] args) {
		Dress dress = new Treasures();
		Dress dressA = new Treasures();
		Dress dressB = new Treasures();
		
		Dress dress1 = new Treasures();
		Dress dress2 = new Treasures();
		
		Dress shirtDress = new Shirt();
		Dress skirtDress = new Skirt();
		Dress pantsDress = new Pants();
		
		dress1.add(shirtDress);
		dress1.add(skirtDress);
		dress2.add(pantsDress);
		
		dressA.add(dress1);
		dressB.add(dress2);
		
		dress.add(dressA);
		dress.add(dressB);
		
		dressA.operate();
		System.out.println("--------------------------");
		dressB.operate();
		System.out.println("--------------------------");
		dress.operate();
	}
}
