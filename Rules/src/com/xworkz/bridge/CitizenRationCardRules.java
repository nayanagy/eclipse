package com.xworkz.bridge;

import com.xworkz.rules.RationCardRules;

public class CitizenRationCardRules implements RationCardRules {

	@Override
	public int income() {
		System.out.println("Running income method");
		return 0;
	}

	@Override
	public boolean bplCard() {
		System.out.println("Running bplCard method");
		return false;
	}

	@Override
	public boolean fourWheeler() {
		System.out.println("Running fourWheeler method");
		return false;
	}

	@Override
	public int acresOfLand() {
		System.out.println("Running acresOfLand method");
		return 0;
	}

	@Override
	public boolean govtJob() {
		System.out.println("Running govtJob method");
		return false;
	}

}
