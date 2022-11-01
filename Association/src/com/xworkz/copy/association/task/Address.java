package com.xworkz.copy.association.task;

public class Address {
	public Location location;

	public Address(Location location) {
		super();
		this.location = location;
	}

	public void torisu() {
		// Location:custom
		if (location != null) {
			this.location.show();
		} else {
			System.out.println("Location is null");
		}

	}
}