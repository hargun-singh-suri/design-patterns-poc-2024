package com.hargun.dp.creational.builder.manufacturingsystem_example;

public class Car extends Vehicle {
	private String brandName;

	public Car(String brandName) {
		this.brandName = brandName;
		System.out.println("Create a car with brand name : " + brandName);
	}

	public String getBrandName() {
		return brandName;
	}
}
