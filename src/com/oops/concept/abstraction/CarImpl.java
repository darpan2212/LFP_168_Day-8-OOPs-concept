package com.oops.concept.abstraction;

public class CarImpl {

	public static void main(String[] args) {
		
		HondaCar honda = new HondaCar(4, 600);
		
		honda.drive();
		System.out.println(honda.getHorsePower());

		BmwCar bmw = new BmwCar();
		
		bmw.drive();
		System.out.println(bmw.getHorsePower());
		
	}
	
}
