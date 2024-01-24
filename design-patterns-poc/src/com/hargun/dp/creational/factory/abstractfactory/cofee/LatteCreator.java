package com.hargun.dp.creational.factory.abstractfactory.cofee;

public class LatteCreator implements CoffeeFactory {

	@Override
	public Coffee createCoffee() {
		return new Latte();
	}

}
