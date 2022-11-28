package com.xworkz.bridge;

import com.xworkz.rules.TrafficRules;

public class CitizenTrafficRules implements TrafficRules {

	@Override
	public boolean wearHelmet() {
		System.out.println("running wearHelmet method");
		return false;
	}

	@Override
	public boolean licence() {
		System.out.println("running licence method");
		return false;
	}

	@Override
	public String signal() {
		System.out.println("running signal method");
		return null;
	}

}
