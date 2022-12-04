package com.xworkz.follower;

import com.xworkz.rules.MetroRules;

public class Passengers implements MetroRules {

	@Override
	public boolean wearMask() {
		System.out.println("running wearMask method");
		return false;
	}

	@Override
	public boolean ticket() {
		System.out.println("running ticket method");
		return false;
	}

}
