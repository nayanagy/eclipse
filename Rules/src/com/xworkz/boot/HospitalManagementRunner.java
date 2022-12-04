package com.xworkz.boot;

import com.xworkz.follower.Doctor;
import com.xworkz.governor.HospitalManagement;
import com.xworkz.rules.HospitalRule;

public class HospitalManagementRunner {

	public static void main(String[] args) {
		HospitalRule hospitalRule = new Doctor();
		HospitalManagement management = new HospitalManagement(hospitalRule);
		management.checking();

	}

}
