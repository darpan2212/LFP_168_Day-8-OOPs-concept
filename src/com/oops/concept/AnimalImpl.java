package com.oops.concept;

import com.oops.concept.inheritance.Cat;
import com.oops.concept.inheritance.Dog;
import com.oops.concept.inheritance.Lion;

public class AnimalImpl {

	public static void main(String[] args) {

		Dog rocky = new Dog();
		rocky.name = "Rocky";
		rocky.age = 6;
		rocky.breed = "Huskey";
		rocky.size = 4.3;
		rocky.color = "Black";

		rocky.eat();
		rocky.sleep();

		System.out.println("----------------------------");
		Dog tommy = new Dog();
		tommy.name = "Tommy";
		tommy.age = 4;
		tommy.breed = "Pug";
		tommy.size = 2.1;
		tommy.color = "WhiteGrey";

		tommy.eat();
		tommy.sleep();
		
		System.out.println("----------------------------");
		Cat mini = new Cat();
		mini.name = "Mini";
		mini.eat();
		
		System.out.println("----------------------------");
		
		Lion sheru = new Lion();
		sheru.name = "Sheru";
		sheru.eat();
		sheru.sleep();

	}

}