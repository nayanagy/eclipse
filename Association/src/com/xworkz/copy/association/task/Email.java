package com.xworkz.copy.association.task;

public class Email {
	public String id;
	public String password;
	public long mobileNo;
	public Company company;

	public Email(String id, String password, long mobileNo, Company company) {
		super();
		this.id = id;
		this.password = password;
		this.mobileNo = mobileNo;
		this.company = company;
	}

	public void showoff() {
		System.out.println(this.id);
		System.out.println(this.password);
		System.out.println(this.mobileNo);
		if (company != null) {
			this.company.exhibit();
		} else {
			System.out.println("Company is null");
		}
	}
}