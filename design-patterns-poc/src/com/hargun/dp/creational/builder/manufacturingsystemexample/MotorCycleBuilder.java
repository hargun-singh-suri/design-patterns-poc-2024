package com.hargun.dp.creational.builder.manufacturingsystemexample;

public class MotorCycleBuilder implements Builder {

	MotorCycle motorCycle;

	public MotorCycleBuilder(String brandName) {
		this.motorCycle = new MotorCycle(brandName);
	}

	@Override
	public Builder addBrandName() {
		motorCycle.addPart("MotorCycle BrandName Added " + motorCycle.getBrandName());
		return this;
	}

	@Override
	public Builder constructBody() {
		motorCycle.addPart("MotorCycle Body Constructed");
		return this;
	}

	@Override
	public Builder insertWheels() {
		motorCycle.addPart("MotorCycle Wheels Added");
		return this;
	}

	@Override
	public Vehicle getVehicle() {
		return motorCycle;
	}

}
