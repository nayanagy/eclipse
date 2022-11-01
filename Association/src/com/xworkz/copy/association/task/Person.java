package com.xworkz.copy.association.task;

public class Person {
	public String name;
	public Email[] emails;
	public Job job;

	public Person(String name, Email[] emails, Job job) {
		super();
		this.name = name;
		this.emails = emails;
		this.job = job;
	}

	public void showoff() {
		System.out.println(this.name);
		if (emails != null) {
			for (int i = 0; i < emails.length; i++) {
				Email email = emails[i];

				if (email != null) {
					email.showoff();
				}
			}
		} else {
			System.out.println("Email is null");
		}

		if (job != null) {
			this.job.display1();
		} else {
			System.out.println("Job is null");
		}

	}
}
