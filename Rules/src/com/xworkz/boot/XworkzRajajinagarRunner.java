package com.xworkz.boot;

import com.xworkz.bridge.XworkzRajajinagar;
import com.xworkz.rules.DevelopmentInstitute;
import com.xworkz.rules.Institute;
import com.xworkz.rules.TestingInstitute;
import com.xworkz.rules.xworkz;

public class XworkzRajajinagarRunner {

	public static void main(String[] args) {
		XworkzRajajinagar xworkzrajajinagar = new XworkzRajajinagar();
		xworkzrajajinagar.interview();
		xworkzrajajinagar.placement();
		xworkzrajajinagar.presentation();
		xworkzrajajinagar.training();

		System.out.println("============================================");

		xworkz xworkz = new XworkzRajajinagar();
		xworkz.interview();
		xworkz.placement();
		xworkz.presentation();
		xworkz.training();

		System.out.println("============================================");

		TestingInstitute TestingInstitute = new XworkzRajajinagar();
		TestingInstitute.interview();
		TestingInstitute.placement();
		TestingInstitute.training();

		System.out.println("============================================");

		DevelopmentInstitute DevelopmentInstitute = new XworkzRajajinagar();
		DevelopmentInstitute.interview();
		DevelopmentInstitute.placement();
		DevelopmentInstitute.training();

		System.out.println("============================================");

		Institute Institute = new XworkzRajajinagar();
		Institute.placement();
		Institute.training();

	}

}
