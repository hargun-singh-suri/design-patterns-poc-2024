package com.hargun.dp.creational.factory;

public class Cappuccino implements Coffee {

	@Override
	public void prepare() {
		System.out.println(String.format("Prepare Cappuccino"));
	}

}
