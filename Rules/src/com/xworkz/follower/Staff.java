package com.xworkz.follower;

import com.xworkz.rules.AirportRules;

public class Staff implements AirportRules {

	@Override
	public boolean wearMask() {

		return false;
	}

	@Override
	public int luggage() {

		return 0;
	}

}
