package com.hargun.dp.creational.simplefactory;

public class Latte implements Coffee {

	@Override
	public void prepare() {
		System.out.println(String.format("Prepare Latte"));
	}

}
