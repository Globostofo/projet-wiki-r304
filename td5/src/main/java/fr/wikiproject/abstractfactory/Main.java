package fr.wikiproject.abstractfactory;


public class Main {
	public static void main(String[] args) {
		AbstractProductFactory productFactory1 = ProductFactory.getFactory("1");
		ProductA productA1 = productFactory1.createProductA();
		productA1.methodA();

		AbstractProductFactory productFactory2 = ProductFactory.getFactory("2");
		ProductA productA2 = productFactory2.createProductA();
		productA2.methodA();
	}
}
