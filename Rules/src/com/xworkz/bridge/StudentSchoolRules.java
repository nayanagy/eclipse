package com.xworkz.bridge;

import com.xworkz.rules.SchoolRules;

public class StudentSchoolRules implements SchoolRules {

	@Override
	public String nameOfSchool() {
		System.out.println("running nameOfSchool method");
		return null;
	}

	@Override
	public boolean mobileUsage() {
		System.out.println("running mobileUsage method");
		return false;
	}

	@Override
	public boolean id() {
		System.out.println("running id method");
		return false;
	}

	@Override
	public String locationOfSchool() {
		System.out.println("running locationOfSchool method");
		return null;
	}

	@Override
	public String principleofSchool() {
		System.out.println("running principleofSchool method");
		return null;
	}

}
