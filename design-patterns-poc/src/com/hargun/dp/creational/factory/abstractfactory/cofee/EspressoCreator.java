package com.hargun.dp.creational.factory.abstractfactory.cofee;

public class EspressoCreator implements CoffeeFactory {

	@Override
	public Coffee createCoffee() {
		return new Espresso();
	}

}
