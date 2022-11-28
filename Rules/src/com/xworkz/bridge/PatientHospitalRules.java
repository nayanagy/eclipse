package com.xworkz.bridge;

import com.xworkz.rules.HospitalRules;

public class PatientHospitalRules implements HospitalRules {

	@Override
	public float appointmentTime(String DoctorName) {
		System.out.println("running appointmentTime method");
		return 5;
	}

	@Override
	public boolean consumingMedicine() {
		System.out.println("running consumingMedicine method");
		return true;
	}

	@Override
	public boolean vehicalSound() {
		System.out.println("running vehicalSound method");
		return false;
	}

	@Override
	public int limitOfVisiters() {
		System.out.println("running limitOfVisiters method");
		return 50;
	}

	@Override
	public boolean mobileUsage() {
		System.out.println("running mobileUsage method");
		return false;
	}

}
