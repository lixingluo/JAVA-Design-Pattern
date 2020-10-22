package designpattern.strategy;

public class CommonMemberWithAliPay extends Customer implements AliPay {

	@Override
	public void buy() {
		// TODO Auto-generated method stub
		this.pay();
	}

	@Override
	public void pay() {
		// TODO Auto-generated method stub
		System.out.println("我是普通会员，我叫："+this.getNameString()+"，但是使用支付宝支付，所以享受9.2折优惠!");
	}

}
