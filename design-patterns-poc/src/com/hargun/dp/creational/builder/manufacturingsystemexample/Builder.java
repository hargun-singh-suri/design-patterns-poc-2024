package com.hargun.dp.creational.builder.manufacturingsystemexample;

public interface Builder {

	Builder addBrandName();

	Builder constructBody();

	Builder insertWheels();
	
	Vehicle getVehicle();
	
}
