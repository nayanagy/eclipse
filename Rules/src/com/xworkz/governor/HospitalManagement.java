package com.xworkz.governor;

import com.xworkz.rules.HospitalRule;

public class HospitalManagement {

	private HospitalRule hospital;

	public HospitalManagement() {
		System.out.println("Default const of HospitalManagement");
	}

	public HospitalManagement(HospitalRule hospital) {
		this.hospital = hospital;
	}

	public void checking() {
		System.out.println("running wearMask and maintainSilence");
		if (this.hospital != null) {
			boolean check = this.hospital.wearMask();
			boolean check1 = this.hospital.maintainSilence();
			{
				if (check == true && check1 == true) {
					System.out.println("Doctor follow the rules");
				} else {
					System.out.println("Doctor not follow the rulesF");
				}
			}
		}
	}
}
