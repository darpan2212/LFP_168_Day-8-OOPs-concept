package com.oops.concept.inheritance;

public class Father extends GrandFather {

	public String businessName;
	
	@Override
	public String toString() {
		return surname+" "+name;
	}
}
