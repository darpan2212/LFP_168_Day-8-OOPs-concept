package com.oops.concept.abstraction;

public abstract class Car {

	int noOfWheel;
	int horsePower;
	
	public abstract int getNumberOfWheels();
	
	public abstract int getHorsePower();
	
	public void drive() {
		System.out.println("Car is built for the drive");
	}
}