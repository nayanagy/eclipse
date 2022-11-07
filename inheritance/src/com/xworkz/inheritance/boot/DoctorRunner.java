package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.childClass.Cardiologist;
import com.xworkz.inheritance.childClass.Dentist;
import com.xworkz.inheritance.childClass.ENT;
import com.xworkz.inheritance.things.Doctor;

public class DoctorRunner {

	public static void main(String[] args) {

		Dentist dentist = new Dentist();
		System.out.println(dentist.dentistName);
		System.out.println(dentist.workingours);
		System.out.println(dentist.hospitanName);
		System.out.println(dentist.income);
		System.out.println(dentist.name);

		Doctor ref = new Dentist();
		System.out.println(ref.hospitanName);
		System.out.println(ref.income);
		System.out.println(ref.name);
		Dentist doctor1 = (Dentist) ref;// casting
		System.out.println(doctor1.dentistName);
		System.out.println(doctor1.workingours);
		System.out.println(doctor1.hospitanName);
		System.out.println(doctor1.income);
		System.out.println(doctor1.name);

		ENT ent = new ENT();
		System.out.println(ent.hospitanName);
		System.out.println(ent.income);
		System.out.println(ent.name);
		System.out.println(ent.location);
		System.out.println(ent.noOfWorkers);

		Doctor ref1 = new ENT();
		System.out.println(ref1.hospitanName);
		System.out.println(ref1.income);
		System.out.println(ref1.name);
		ENT doctor2 = (ENT) ref1;// casting
		System.out.println(doctor2.hospitanName);
		System.out.println(doctor2.income);
		System.out.println(doctor2.name);
		System.out.println(doctor2.location);
		System.out.println(doctor2.noOfWorkers);

		Cardiologist cardiologist = new Cardiologist();
		System.out.println(cardiologist.hospitanName);
		System.out.println(cardiologist.income);
		System.out.println(cardiologist.name);
		System.out.println(cardiologist.cardiologistName);
		System.out.println(cardiologist.salary);

		Doctor ref2 = new Cardiologist();
		System.out.println(ref2.hospitanName);
		System.out.println(ref2.income);
		System.out.println(ref2.name);
		Cardiologist doctor3 = (Cardiologist) ref2;// casting
		System.out.println(doctor3.hospitanName);
		System.out.println(doctor3.income);
		System.out.println(doctor3.name);
		System.out.println(doctor3.cardiologistName);
		System.out.println(doctor3.salary);

	}

}
