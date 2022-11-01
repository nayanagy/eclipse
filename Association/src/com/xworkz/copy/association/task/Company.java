package com.xworkz.copy.association.task;

public class Company {
	public String companyName;
	public String ownerName;
	public Address address;

	public Company(String companyName, String ownerName, Address address) {
		super();
		this.companyName = companyName;
		this.ownerName = ownerName;
		this.address = address;
	}

	public void exhibit() {
		System.out.println(this.companyName);
		System.out.println(this.ownerName);
		if (address != null) {
			this.address.torisu();
		} else {
			System.out.println("Address is null");
		}
	}
}
