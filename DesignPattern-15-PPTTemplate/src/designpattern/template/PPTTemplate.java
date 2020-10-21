package designpattern.template;

public abstract class PPTTemplate {
	public void templateFunction(){
		header();
		body();
		tail();
	}
	
	public void header(){
		System.out.println("Header:Anhui Noraml University!");
	}
	
	public abstract void body();
	
	public void tail(){
		System.out.println("Reporter:LittleLawson");
	}
}
