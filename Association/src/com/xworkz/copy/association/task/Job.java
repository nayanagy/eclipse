package com.xworkz.copy.association.task;

public class Job {
	public double salary;
	public String role;
	public int bond;
	public Company company;

	public Job(double salary, String role, int bond, Company company) {
		this.salary = salary;
		this.role = role;
		this.bond = bond;
		this.company = company;
	}

	public void display1() {
		System.out.println(this.salary);
		System.out.println(this.role);
		System.out.println(this.bond);
		if (company != null) {
			this.company.exhibit();
		} else {
			System.out.println("Company is null");
		}
	}

}
