package com.hargun.dp.creational.builder.manufacturingsystem_example;

public class MotorCycle extends Vehicle {

	private String brandName;

	public MotorCycle(String brandName) {
		this.brandName = brandName;
		System.out.println("Create a motor cycle with brand name : " + brandName);
	}

	public String getBrandName() {
		return brandName;
	}

}
