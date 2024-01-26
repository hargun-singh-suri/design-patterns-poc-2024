package com.hargun.dp.creational.abstractfactory.coffeeexample.cofee;

public class Espresso implements Coffee {

	@Override
	public void prepare() {
		System.out.println(String.format("Prepare Espresso"));
	}

}
