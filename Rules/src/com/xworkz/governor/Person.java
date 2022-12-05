package com.xworkz.governor;

public abstract class Person extends Object {
	private String name;
	private double salary;
	private String jobRole;
	private int age;
	private String location;

	public Person(String name, double salary, String jobRole, int age, String location) {
		this.name = name;
		this.salary = salary;
		this.jobRole = jobRole;
		this.age = age;
		this.location = location;

	}

	public void eat() {
		System.out.println("running eat method");
	}

	public void sleep() {
		System.out.println("running sleep method");
	}

	public void display() {
		System.out.println(name);
		System.out.println(salary);
		System.out.println(jobRole);
		System.out.println(age);
		System.out.println(location);
	}

}
