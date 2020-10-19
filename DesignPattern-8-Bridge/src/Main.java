import designpattern.company.Company;
import designpattern.company.Microsoft;
import designpattern.product.Excel;
import designpattern.product.Product;

public class Main {
	public static void main(String[] args) {
		Company company = new Microsoft();
		Product product = new Excel(company);
		product.display();
	}
}
