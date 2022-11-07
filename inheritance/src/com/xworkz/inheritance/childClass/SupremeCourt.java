package com.xworkz.inheritance.childClass;

import com.xworkz.inheritance.things.Court;

public class SupremeCourt extends Court {
	public String judgeName;
	public int noOfLawyers;

	public SupremeCourt() {
		System.out.println("default constructor of SupremeCourt");
	}

}
