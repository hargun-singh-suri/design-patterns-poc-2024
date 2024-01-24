package com.hargun.dp.creational.abstractfactory.addon;

public class MilkFoamCreator implements CoffeeAddOnFactory {

	@Override
	public CoffeeAddOn createCoffeeAddOn() {
		return new MilkFoam();
	}

}
