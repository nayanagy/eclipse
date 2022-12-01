package com.xworkz.bridge;

import com.xworkz.rules.xworkz;

public class sample implements xworkz {

	@Override
	public boolean interview() {
		System.out.println("Running presentation method");
		return false;
	}

	@Override
	public boolean training() {
		System.out.println("Running interview method");
		return false;
	}

	@Override
	public boolean placement() {
		System.out.println("Running training method");
		return false;
	}

	@Override
	public boolean presentation() {
		System.out.println("Running placement method");
		return false;
	}

}
