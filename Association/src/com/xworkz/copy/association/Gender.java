package com.xworkz.copy.association;

public enum Gender {

	MALE("Male"), FEMALE("Female"), TRANSGENDER("Transgender");

	public String name;

	private Gender(String name) {
		this.name = name;
	}
}
