package com.oops.concept.abstraction.interfac;

public class AnimalImpl {

	public static void main(String[] args) {
		
		Animal dog = new Dog();
		
		dog.eat();
		dog.sleep();
		
		Animal lion = new Lion();
		
		lion.eat();
		lion.sleep();
		lion.running();
//		lion.doHunting();
		
		System.out.println(Lion.livesIn);
	}
	
}