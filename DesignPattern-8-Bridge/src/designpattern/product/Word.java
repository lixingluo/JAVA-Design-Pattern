package designpattern.product;

import designpattern.company.Company;

public class Word extends Product{

	public Word(Company company) {
		// TODO Auto-generated constructor stub
		super(company);
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		company.display();
		System.out.println("This is Word");
	}
	
}
