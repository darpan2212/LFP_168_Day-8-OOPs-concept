package com.oops.concept.abstraction.interfac;

public class Lion implements Animal, WildAnimal{

	@Override
	public void doHunting() {
		System.out.println("Lion is hunting");
	}

	@Override
	public void sleep() {
		System.out.println("Lion is sleeping");
	}

	@Override
	public void eat() {
		System.out.println("Lion is eating");
	}

	@Override
	public void running() {
		System.out.println("Lion is running");
	}

}