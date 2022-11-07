package com.xworkz.inheritance.childClass;

import com.xworkz.inheritance.things.Doctor;

public class Cardiologist extends Doctor {
	public double salary;
	public String cardiologistName;

	public Cardiologist() {
		System.out.println("default constructor of Cardiologist");
	}

}
