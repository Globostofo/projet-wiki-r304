package fr.wikiproject.abstractfactory;

class ProductFactoryImpl2 implements AbstractProductFactory {
	public ProductA createProductA() {
		return new ProductA2();
	}

	public ProductB createProductB() {
		return new ProductB2();
	}
}
