package com.xworkz.inheritance.childClass;

import com.xworkz.inheritance.things.BachelorParty;

public class Marriage extends BachelorParty {
	public static String name="om";
	public Marriage(int noOfMembers) {
		super(noOfMembers);
		
	}
	public static void display() {
		BachelorParty.display();
		System.out.println(name);
	}

}
