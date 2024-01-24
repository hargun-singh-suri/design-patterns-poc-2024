package com.hargun.dp.creational.abstractfactory.cofee;

public class LatteCreator implements CoffeeFactory {

	@Override
	public Coffee createCoffee() {
		return new Latte();
	}

}
