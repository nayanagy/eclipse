package com.xworkz.bridge;

import com.xworkz.rules.CompanyRules;

public class EmployeeCompanyRules implements CompanyRules {

	@Override
	public boolean wearID() {
		System.out.println("Running wearID method");
		return true;
	}

	@Override
	public float loginTime(boolean followed) {
		System.out.println("Running logintime method");
		return 9.00f;
	}

	@Override
	public boolean dressCode(String type) {
		System.out.println("Running dressCode method");
		return true;
	}

	@Override
	public int logOutTime(int hours) {
		System.out.println("Running logout method");
		return 0;
	}

	@Override
	public String behavior() {
		System.out.println("Running behavior method");
		return "good";
	}

}
