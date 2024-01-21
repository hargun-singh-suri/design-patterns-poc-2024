package com.hargun.dp.creational.factory;

public class LatteCreator implements CoffeeFactory {

	@Override
	public Coffee createCoffee() {
		return new Latte();
	}

}
