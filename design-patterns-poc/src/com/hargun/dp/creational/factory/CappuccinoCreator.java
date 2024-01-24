package com.hargun.dp.creational.factory;

public class CappuccinoCreator implements CoffeeFactory {

	@Override
	public Coffee createCoffee() {
		return new Cappuccino();
	}

}
