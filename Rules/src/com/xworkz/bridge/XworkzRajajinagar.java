package com.xworkz.bridge;

import com.xworkz.rules.DevelopmentInstitute;
import com.xworkz.rules.Institute;
import com.xworkz.rules.TestingInstitute;
import com.xworkz.rules.xworkz;

public class XworkzRajajinagar implements Institute, DevelopmentInstitute, TestingInstitute, xworkz {

	@Override
	public boolean presentation() {
		System.out.println("Running presentation method");
		return false;
	}

	@Override
	public boolean interview() {
		System.out.println("Running interview method");
		return false;
	}

	@Override
	public boolean training() {
		System.out.println("Running training method");
		return false;
	}

	@Override
	public boolean placement() {
		System.out.println("Running placement method");
		return false;
	}

}
