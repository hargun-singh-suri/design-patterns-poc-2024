package com.hargun.dp.creational.simplefactory;

public class CoffeeShop {

	public static void main(String args[]) {
		Coffee espresso = CoffeeFactory.createCoffee(CoffeeType.ESPRESSO);
		Coffee latte = CoffeeFactory.createCoffee(CoffeeType.LATTE);

		espresso.prepare();
		latte.prepare();

		/*
		 * Output
		 * 
		 * Prepare Espresso
		 * 
		 * Prepare Latte
		 */
	}

}
