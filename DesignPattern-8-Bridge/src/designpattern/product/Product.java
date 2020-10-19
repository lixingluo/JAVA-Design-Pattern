package designpattern.product;

import designpattern.company.Company;

public abstract class Product {
	Company company;
	public Product(Company company) {
		// TODO Auto-generated constructor stub
		this.company = company;
	}
	public abstract void display();
}
