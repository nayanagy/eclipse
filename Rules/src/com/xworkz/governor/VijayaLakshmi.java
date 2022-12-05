package com.xworkz.governor;

import com.xworkz.rules.KarnatakaRTO;

public class VijayaLakshmi extends JavaTrainee implements KarnatakaRTO {

	public VijayaLakshmi(String name, double salary, String jobRole, int age, String location) {
		super(name, salary, jobRole, age, location);

	}

	@Override
	public boolean paidTax(double amount) {
		System.out.println("running paidTax method");
		System.out.println(amount);
		return false;
	}

	@Override
	public double gst() {
		System.out.println("running gst method");
		return 0;
	}

	@Override
	public double vat() {
		System.out.println("running vat method");
		return 0;
	}

}
