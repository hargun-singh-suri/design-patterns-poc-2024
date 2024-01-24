package com.hargun.dp.creational.abstractfactory.addon;

public class ChocoSyrupCreator implements CoffeeAddOnFactory {

	@Override
	public CoffeeAddOn createCoffeeAddOn() {
		return new ChocoSyrup();
	}

}
