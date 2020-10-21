package designpattern.template;

public class Client {
	public static void main(String[] args) {
		PPTTemplate pptTemplate = new ConcretePPT();
		pptTemplate.templateFunction();
		
		PPTTemplate pptTemplate2 = new ConcretePPT2();
		pptTemplate2.templateFunction();
	}
}
