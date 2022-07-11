package com.oops.concept.polymorphism;

public class Calculator extends Arithmetic {

	public int sum(int a, int b) {
		return a + b;
	}

	public int sum(int a, int b, int c) {
		return a + b + c;
	}

	public double sum(double a, double b) {
		return (a + b);
	}

	@Override
	public double multiply(double a, double b) {
		System.out.println("overridden method");
		int sum = 0;
		for (int i = 0; i < a; i++) {
			sum += b;
		}

		return sum;
	}

}