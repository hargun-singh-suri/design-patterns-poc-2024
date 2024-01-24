package com.hargun.dp.creational.abstractfactory.cofee;

public class EspressoCreator implements CoffeeFactory {

	@Override
	public Coffee createCoffee() {
		return new Espresso();
	}

}
