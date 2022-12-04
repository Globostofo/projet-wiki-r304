package fr.wikiproject.abstractfactory;

class ProductFactoryImpl1 implements AbstractProductFactory {
	public ProductA createProductA() {
		return new ProductA1();
	}

	public ProductB createProductB() {
		return new ProductB1();
	}
}
