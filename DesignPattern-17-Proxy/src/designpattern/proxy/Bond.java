package designpattern.proxy;

public class Bond extends Investment {

	@Override
	public void buy(Investor investor) {
		// TODO Auto-generated method stub
		if(investor.getMoney() >= 2000) {
			investor.buy(2000);
			System.out.println(investor.getName() + "购买基金后的金额为:" + investor.getMoney());
		}
	}

	@Override
	public void redemption(Investor investor) {
		// TODO Auto-generated method stub
		System.out.println(investor.getName()+"赎回一份股票！");
		investor.redemption(2000);
		System.out.println(investor.getName() + "赎回基金后的金额为：" + investor.getMoney());
	}

}
