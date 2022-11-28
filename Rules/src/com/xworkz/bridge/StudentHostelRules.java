package com.xworkz.bridge;

import com.xworkz.rules.HostelRules;

public class StudentHostelRules implements HostelRules {

	@Override
	public float studyTime() {
		System.out.println("Running studyTime method");
		return 0;
	}

	@Override
	public Float outingTime() {
		System.out.println("Running outingTime method");
		return null;
	}

	@Override
	public String permissionForLeavs() {
		System.out.println("Running permissionForLeavs method");
		return null;
	}

	@Override
	public int snacksTime() {
		System.out.println("Running snacksTime method");
		return 0;
	}

	@Override
	public boolean outSidefood() {
		System.out.println("Running outSidefood method");
		return false;
	}

}
