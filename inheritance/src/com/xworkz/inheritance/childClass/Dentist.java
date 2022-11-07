package com.xworkz.inheritance.childClass;

import com.xworkz.inheritance.things.Doctor;

public class Dentist extends Doctor {
	public String dentistName;
	public int workingours;

	public Dentist() {
		System.out.println("Defalut constructor of Dentist");
	}

}
