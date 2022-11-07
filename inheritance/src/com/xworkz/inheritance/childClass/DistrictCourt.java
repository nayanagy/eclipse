package com.xworkz.inheritance.childClass;

import com.xworkz.inheritance.things.Court;

public class DistrictCourt extends Court {
	public String judgeName;
	public int noOfLawyers;

	public DistrictCourt() {
		System.out.println("default constructor of DistrictCourt");
	}

}
