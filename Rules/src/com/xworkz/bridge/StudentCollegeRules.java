package com.xworkz.bridge;

import com.xworkz.rules.CollegeRules;

public class StudentCollegeRules implements CollegeRules {

	@Override
	public boolean wearID() {
		System.out.println("running wearId method");
		return false;
	}

	@Override
	public float time(boolean followed) {
		System.out.println("running time method");
		return 0;
	}

	@Override
	public boolean uniform(String color) {
		System.out.println("running uniform method");
		return false;
	}

	@Override
	public boolean useMobile() {
		System.out.println("running useMobile method");
		return false;
	}

	@Override
	public int attendence() {
		System.out.println("running attendence method");
		return 0;
	}

}
