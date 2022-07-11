package com.oops.concept;

import com.oops.concept.inheritance.Father;
import com.oops.concept.inheritance.GrandFather;
import com.oops.concept.inheritance.Son;

public class MultiLevelImpl {

	public static void main(String[] args) {

		GrandFather grandFather = new GrandFather();
		grandFather.age = 70;
		grandFather.name = "Dhirubhai";
		grandFather.surname = "Ambani";

		Father father = new Father();
		father.age = 48;
		father.name = "Mukeshbhai";
		father.surname = grandFather.surname;
		father.businessName = "Jio";
	
		Son son = new Son();
		son.name = "Aakash";
		son.surname = father.surname;
		son.age =25;
		son.businessName = father.businessName;
		son.businessName = "MBA";
		
		System.out.println(grandFather.toString());
		System.out.println(father.toString());
		System.out.println(son.toString());

	}

}