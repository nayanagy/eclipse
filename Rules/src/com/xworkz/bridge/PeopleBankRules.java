package com.xworkz.bridge;

import com.xworkz.rules.Bank;

public class PeopleBankRules implements Bank {

	@Override
	public String name() {
		System.out.println("Running name method");
		return null;
	}

	@Override
	public String branch() {
		System.out.println("Running branch method");
		return null;
	}

	@Override
	public long accNumber() {
		System.out.println("Running accNumber method");
		return 0;
	}

	@Override
	public boolean aadharLink() {
		System.out.println("Running aadharLink method");
		return false;
	}

	@Override
	public long mblNo() {
		System.out.println("Running mblNo method");
		return 0;
	}

}
