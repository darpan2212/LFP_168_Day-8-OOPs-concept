package com.oops.concept.polymorphism;

public class CalculatorImpl {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();

		System.out.println(calculator.sum(1, 2));

		System.out.println(calculator.sum(1, 2, 3));

		System.out.println(calculator.sum(4.5, 3.7));
		
		
		System.out.println("------------------------");
		
		System.out.println(calculator.multiply(4, 5));
	}

}