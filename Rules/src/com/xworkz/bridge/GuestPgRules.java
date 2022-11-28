package com.xworkz.bridge;

import com.xworkz.rules.PgRules;

public class GuestPgRules implements PgRules{

	@Override
	public float inTime() {
		System.out.println("Running intime method");
		return 0;
	}

	@Override
	public float dinnerTime() {
		System.out.println("Running dinnerTime method");
		return 0;
	}

	@Override
	public boolean washingMachine() {
		System.out.println("Running washingMachine method");
		return false;
	}

	@Override
	public boolean useMinWater() {
		System.out.println("Running useMinWater method");
		return false;
	}

	@Override
	public boolean hygine() {
		System.out.println("Running hygine method");
		return false;
	}

}
