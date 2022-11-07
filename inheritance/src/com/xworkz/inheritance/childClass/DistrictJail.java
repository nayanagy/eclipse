package com.xworkz.inheritance.childClass;

import com.xworkz.inheritance.things.Jail;

public class DistrictJail extends Jail {
	public String jailerName;
	public int prisoner;

	public DistrictJail() {
		System.out.println("Default cpnstructor of DistrictJail");
	}
}
