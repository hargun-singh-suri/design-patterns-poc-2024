package com.hargun.dp.creational.builder.manufacturingsystem_example;

public interface Builder {

	Builder addBrandName();

	Builder constructBody();

	Builder insertWheels();
	
	Vehicle getVehicle();
	
}
