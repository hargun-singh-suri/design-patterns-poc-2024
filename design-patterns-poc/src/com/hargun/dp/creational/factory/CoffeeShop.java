package com.hargun.dp.creational.factory;

public class CoffeeShop {

	public static void main(String args[]) {

		CoffeeFactory coffeeFactory = getCoffeeFactoryInstance(CoffeeType.CAPPICINO);
		coffeeFactory.createCoffee().prepare();
	}

	private static CoffeeFactory getCoffeeFactoryInstance(CoffeeType coffeeType) {
		return switch (coffeeType) {
		case ESPRESSO -> new EspressoCreator();
		case LATTE -> new LatteCreator();
		case CAPPICINO -> new CappuccinoCreator();
		};
	}

	/**
	 * Output
	 * 
	 * Prepare Cappuccino
	 */

}
