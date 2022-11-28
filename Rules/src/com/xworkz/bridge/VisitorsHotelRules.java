package com.xworkz.bridge;

import com.xworkz.rules.Hotel;

public class VisitorsHotelRules implements Hotel {

	@Override
	public float dinnerTime() {
		System.out.println("Running dinnerTime Method ");
		return 0;
	}

	@Override
	public boolean washingMachine() {
		System.out.println("Running  washingMachine Method ");
		return false;
	}

	@Override
	public boolean useMinWater() {
		System.out.println("Running useMinWater Method ");
		return false;
	}

	@Override
	public boolean hygine() {
		System.out.println("Running hygine Method ");
		return false;
	}

	@Override
	public float inTime() {
		System.out.println("Running inTime Method ");
		return 0;
	}

}
