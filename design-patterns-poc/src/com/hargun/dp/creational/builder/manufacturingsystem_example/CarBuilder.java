package com.hargun.dp.creational.builder.manufacturingsystem_example;

public class CarBuilder implements Builder {

	Car car;

	public CarBuilder(String brandName) {
		this.car = new Car(brandName);
	}

	@Override
	public Builder addBrandName() {
		car.addPart("Brand Name Added " + car.getBrandName());
		return this;
	}

	@Override
	public Builder constructBody() {
		car.addPart("Car Body Constructed");
		return this;
	}

	@Override
	public Builder insertWheels() {
		car.addPart("Car Wheels Added");
		return this;
	}

	@Override
	public Vehicle getVehicle() {
		return car;
	}

}
