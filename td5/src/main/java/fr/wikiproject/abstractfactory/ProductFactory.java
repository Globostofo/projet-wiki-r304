package fr.wikiproject.abstractfactory;

class ProductFactory {
	static AbstractProductFactory getFactory(String env) {
		if (env.equals("1")) return new ProductFactoryImpl1();
		else if (env.equals("2")) return new ProductFactoryImpl2();
		else throw new IllegalArgumentException("Invalid env: " + env);
	}
}
