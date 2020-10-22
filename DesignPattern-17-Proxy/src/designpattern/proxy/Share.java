package designpattern.proxy;

public class Share extends Investment {

	@Override
	public void buy(Investor investor) {
		// TODO Auto-generated method stub
		if(investor.getMoney() >= 1000) {
			investor.buy(1000);
			System.out.println(investor.getName() + "购买股票后的金额为:" + investor.getMoney());
		}
	}

	@Override
	public void redemption(Investor investor) {
		// TODO Auto-generated method stub
		System.out.println(investor.getName()+"赎回一份股票！");
		investor.redemption(1000);
		System.out.println(investor.getName() + "赎回股票后的金额为：" + investor.getMoney());
	}

}
