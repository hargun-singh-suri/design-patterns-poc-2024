package com.hargun.dp.creational.abstractfactory.coffeeexample.cofee;

public class EspressoCreator implements CoffeeFactory {

	@Override
	public Coffee createCoffee() {
		return new Espresso();
	}

}
