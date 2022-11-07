package com.xworkz.inheritance.childClass;

import com.xworkz.inheritance.things.Court;

public class HighCourt extends Court {
	public String judgeName;
	public int noOfCases;

	public HighCourt() {
		System.out.println("Default constructor of HighCourt");
	}

}
