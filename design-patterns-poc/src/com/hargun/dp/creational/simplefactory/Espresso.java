package com.hargun.dp.creational.simplefactory;

public class Espresso implements Coffee {

	@Override
	public void prepare() {
		System.out.println(String.format("Prepare Espresso"));
	}

}
