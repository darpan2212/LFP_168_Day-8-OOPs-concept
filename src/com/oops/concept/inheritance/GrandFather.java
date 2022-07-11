package com.oops.concept.inheritance;

public class GrandFather {

	public String surname;
	public String name;
	public int age;

	@Override
	public String toString() {
		return name + " " + surname;
	}
}