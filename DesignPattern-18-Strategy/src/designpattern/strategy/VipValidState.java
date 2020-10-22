package designpattern.strategy;

public class VipValidState extends State {

	@Override
	public void buy(Customer customer) {
		// TODO Auto-generated method stub
		System.out.println("我是超级会员，我叫：" + customer.getNameString() + "，我的积分是："+customer.getMoney() +
				">=5000，享受9.0折优惠！");
	}

}
