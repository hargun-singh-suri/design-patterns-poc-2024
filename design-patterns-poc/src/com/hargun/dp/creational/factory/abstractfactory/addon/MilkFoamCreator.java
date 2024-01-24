package com.hargun.dp.creational.factory.abstractfactory.addon;

public class MilkFoamCreator implements CoffeeAddOnFactory {

	@Override
	public CoffeeAddOn createCoffeeAddOn() {
		return new MilkFoam();
	}

}
