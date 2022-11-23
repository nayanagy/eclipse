package com.xworkz.inheritance.things;

public class BachelorParty {
	public static String location="banglore";
	public int noOfMembers;

	public BachelorParty(int noOfMembers) {
		super();
		this.noOfMembers = noOfMembers;
	}

	public static void  display() {
		System.out.println(location);
		
	}

}

