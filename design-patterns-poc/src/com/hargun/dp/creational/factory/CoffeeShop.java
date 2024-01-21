package com.hargun.dp.creational.factory;

public class CoffeeShop {

	public static void main(String args[]) {

		// espresso
		CoffeeFactory espressoCreator = new EspressoCreator();
		Coffee espresso = espressoCreator.createCoffee();
		espresso.prepare();

		CoffeeFactory latteCreator = new LatteCreator();
		Coffee latte = latteCreator.createCoffee();
		latte.prepare();

		/**
		 * Output
		 * 
		 * Prepare Espresso
		 * 
		 * Prepare Latte
		 * 
		 */
	}

}
