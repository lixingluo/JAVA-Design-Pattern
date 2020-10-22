package designpattern.strategy;

public class CommonMember extends Customer {

	@Override
	public void buy() {
		// TODO Auto-generated method stub
		System.out.println("我是普通会员，我叫："+this.getNameString()+"，使用普通支付，享受9.5折优惠.");
	}

}
