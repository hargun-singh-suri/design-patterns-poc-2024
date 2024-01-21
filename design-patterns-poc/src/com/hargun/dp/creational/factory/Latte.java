package com.hargun.dp.creational.factory;

public class Latte implements Coffee {

	@Override
	public void prepare() {
		System.out.println(String.format("Prepare Latte"));
	}

}
