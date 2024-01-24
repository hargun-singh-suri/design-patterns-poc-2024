package com.hargun.dp.creational.factory.abstractfactory;

import com.hargun.dp.creational.factory.abstractfactory.addon.ChocoSyrupCreator;
import com.hargun.dp.creational.factory.abstractfactory.addon.CoffeeAddOnFactory;
import com.hargun.dp.creational.factory.abstractfactory.addon.MilkFoamCreator;
import com.hargun.dp.creational.factory.abstractfactory.cofee.CoffeeFactory;
import com.hargun.dp.creational.factory.abstractfactory.cofee.EspressoCreator;
import com.hargun.dp.creational.factory.abstractfactory.cofee.LatteCreator;

public class CoffeeShop {

	public static void main(String args[]) {

		// Create cofee
		CoffeeFactory coffeeFactory = getCoffeeFactoryInstance(CoffeeType.ESPRESSO);
		coffeeFactory.createCoffee().prepare();

		// Add on
		CoffeeAddOnFactory coffeeAddOnFactory = getCoffeeAddOnFactoryInstance(CoffeeAddOnType.MILKFOAM);
		coffeeAddOnFactory.createCoffeeAddOn().addOn();
	}

	private static CoffeeFactory getCoffeeFactoryInstance(CoffeeType coffeeType) {
		return switch (coffeeType) {
		case ESPRESSO -> new EspressoCreator();
		case LATTE -> new LatteCreator();
		};
	}

	private static CoffeeAddOnFactory getCoffeeAddOnFactoryInstance(CoffeeAddOnType milkfoam) {
		return switch (milkfoam) {
		case MILKFOAM -> new MilkFoamCreator();
		case CHOCOSYRUP -> new ChocoSyrupCreator();

		};
	}

	/*
	 * 
	 * Output -
	 * 
	 * Prepare Espresso
	 * 
	 * Milk Foam Added !!
	 * 
	 */

}
