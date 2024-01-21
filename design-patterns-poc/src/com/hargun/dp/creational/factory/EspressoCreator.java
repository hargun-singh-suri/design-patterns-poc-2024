package com.hargun.dp.creational.factory;


public class EspressoCreator implements CoffeeFactory {

	@Override
	public Coffee createCoffee() {
		return new Espresso();
	}

}
