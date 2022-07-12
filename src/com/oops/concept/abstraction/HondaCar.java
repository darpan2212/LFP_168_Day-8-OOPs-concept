package com.oops.concept.abstraction;

public class HondaCar extends Car {

	public HondaCar(int noOfWheel, int horsePower) {
		super.noOfWheel = noOfWheel;
		super.horsePower = horsePower;
	}
	
	@Override
	public int getNumberOfWheels() {
		return noOfWheel;
	}

	@Override
	public int getHorsePower() {
		return horsePower;
	}
	
}