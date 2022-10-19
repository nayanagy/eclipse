package com.xworkz.copy.thing;

import com.xworkz.copy.Place;
import com.xworkz.copy.Subjects;

public class School {

	public String name;
	public int no_students;
	public long phone;;
	public String email;
	public Place city;
	public int[] employee_id;
	public int[] salary;
	public Subjects subject;
	public String[] commetie;
	public int[] classes;

	public School(String name, int no_students, long phone, String email, Place city, int[] employee_id, int[] salary, Subjects subject, String[] commetie, int[] classes) {
		System.out.println("constructor of school");
		this.name = name;
		this.no_students = no_students;
		this.phone = phone;
		this.email = email;
		this.city = city;
		this.employee_id = employee_id;
		this.salary = salary;
		this.subject = subject;
		this.commetie = commetie;
		this.classes = classes;
	}

	public void display() {
		System.out.println(this.name);
		System.out.println(this.no_students);
		System.out.println(this.phone);
		System.out.println(this.email);
		System.out.println(this.city);
		System.out.println(this.subject);
		

		for (int i = 0; i < employee_id.length; i++) {
			System.out.println(employee_id[i]);
		}
		for (int i = 0; i < salary.length; i++) {
			System.out.println(salary[i]);
		}

		for (int i = 0; i < commetie.length; i++) {
			System.out.println(commetie[i]);
		}
		for (int i = 0; i < classes.length; i++) {
			System.out.println(classes[i]);
		}
	}

}
