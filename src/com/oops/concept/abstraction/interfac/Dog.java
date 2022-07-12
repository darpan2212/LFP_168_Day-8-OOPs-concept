package com.oops.concept.abstraction.interfac;

public class Dog implements Animal{

	@Override
	public void sleep() {
		System.out.println("Dog is sleeping");
	}

	@Override
	public void eat() {
		System.out.println("Dog is eating");
	}

	@Override
	public void running() {
		System.out.println("Dog is running");
	}

	
	
}