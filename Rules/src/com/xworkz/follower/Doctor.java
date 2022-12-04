package com.xworkz.follower;

import com.xworkz.rules.HospitalRule;

public class Doctor implements HospitalRule {

	@Override
	public boolean maintainSilence() {
		System.out.println("running maintainSilence method");
		return false;
	}

	@Override
	public boolean wearMask() {
		System.out.println("running wearMask method");
		return false;
	}

}
