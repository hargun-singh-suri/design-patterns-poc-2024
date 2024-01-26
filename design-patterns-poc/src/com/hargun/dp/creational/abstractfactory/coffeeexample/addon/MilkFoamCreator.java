package com.hargun.dp.creational.abstractfactory.coffeeexample.addon;

public class MilkFoamCreator implements CoffeeAddOnFactory {

	@Override
	public CoffeeAddOn createCoffeeAddOn() {
		return new MilkFoam();
	}

}
