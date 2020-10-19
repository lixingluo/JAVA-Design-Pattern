package designpattern.abstractfactory;

public class Client {
	public static void main(String[] args) {
		Factory factory10 = null;
		Factory factory100 = null;
		factory10 = (Factory)XMLUtil.getData("factory", 0);
		factory100 = (Factory)XMLUtil.getData("factory", 1);
		Coin coin1 = factory10.productCoin();
		Paper paper1 = factory10.productPaper();
		Coin coin2 = factory100.productCoin();
		Paper paper2 = factory100.productPaper();
		coin1.display();
		paper1.display();
		coin2.display();
		paper2.display();
		
		Factory2 factoryCoin = null;
		Factory2 factoryPaper = null;
		factoryCoin = (Factory2)XMLUtil.getData("factory", 2);
		factoryPaper = (Factory2)XMLUtil.getData("factory", 3);
		Rmb10 rmb10_1 = factoryCoin.TenRmb();
		Rmb100 rmb100_1 = factoryCoin.HundredRmb();
		Rmb10 rmb10_2 = factoryPaper.TenRmb();
		Rmb100 rmb100_2 = factoryPaper.HundredRmb();
		rmb10_1.display();
		rmb100_1.display();
		rmb10_2.display();
		rmb100_2.display();
	}
}
