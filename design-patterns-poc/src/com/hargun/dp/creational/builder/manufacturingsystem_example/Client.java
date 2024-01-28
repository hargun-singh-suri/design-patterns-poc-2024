package com.hargun.dp.creational.builder.manufacturingsystem_example;

public class Client {
	public static void main(String args[]) {

		System.out.println("Build a car !!");

		Builder builder = new CarBuilder("Porche");
		Vehicle vehicle = builder.addBrandName().constructBody().insertWheels().getVehicle();
		vehicle.showParts();
		System.out.println("Car is ready !!");

		System.out.println("------------------------");

		System.out.println("Build a Motor cycle !!");
		builder = new MotorCycleBuilder("Harley");
		vehicle = builder.addBrandName().constructBody().insertWheels().getVehicle();
		vehicle.showParts();
		System.out.println("Motor cycle is ready!!");

	}
}

/*

Build a car !!
Create a car with brand name : Porche
Car Body Constructed
Car Wheels Added
Brand Name Added Porche
Car is ready !!
------------------------
Build a Motor cycle !!
Create a motor cycle with brand name : Harley
MotorCycle BrandName Added Harley
MotorCycle Body Constructed
MotorCycle Wheels Added
Motor cycle is ready!!


*/