package designpattern.strategy;

public class SuperMarket {
	public void buy(Customer customer){
		customer.buy();//购物者购买
	}
	
	
	public void welcome(){
		System.out.println("--------------顾客你好，欢迎来到**超市购物，本超市现有如下优惠政策-------------------");
		System.out.println("(1)会员:购物享有9.5折优惠");
		System.out.println("(2)既是会员又采用支付宝支付，购物享有9.2折优惠");
		System.out.println("(3)vip会员（消费总额已超过1000元），购物享有9折优惠");
		System.out.println("-----------------------------------------------------------------");
		System.out.println("");
	}
	
	public void banner(){
		System.out.println("-----------------------------------------------------------------");		
	}
}
