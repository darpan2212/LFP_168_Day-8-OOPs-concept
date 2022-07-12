package com.oops.concept.association;

public class AssociationImpl {

	public static void main(String[] args) {

		Person p1 = new Person();
		p1.name = "Shubham Rastogi";

		Mobile m1 = new Mobile();
		m1.mobileNumber = "9988776655";

		Mobile m2 = new Mobile();
		m2.mobileNumber = "9998887788";

		p1.mobileNumbers = new Mobile[] { m1, m2 };

		
		System.out.println(p1.name);
		
		for(int i=0;i<p1.mobileNumbers.length;i++) {
			System.out.println(p1.mobileNumbers[i].mobileNumber);	
		}
	}

}