package com.xworkz.follower;

import com.xworkz.rules.BankRules;

public class KarnatakaBank implements BankRules {

	@Override
	public boolean wearMask() {
		System.out.println("running wearmask method");
		return false;
	}

	@Override
	public double balance() {
		System.out.println("running balance method");
		return 0;
	}

}
