package com.xworkz.boot;

import com.xworkz.bridge.PatientHospitalRules;

public class PatientHospitalRulesRunner {

	public static void main(String[] args) {
		PatientHospitalRules rule=new PatientHospitalRules();
		rule.appointmentTime("Devendra");
		rule.consumingMedicine();
		rule.limitOfVisiters();
		rule.mobileUsage();
		rule.vehicalSound();
	}

}
