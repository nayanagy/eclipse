package com.xworkz.inheritance.things;

public class PreWeddingShoot {
	public String location;
	public String photographer;
	public String theme;

	public PreWeddingShoot(String location, String photographer, String theme) {
		super();
		this.location = location;
		this.photographer = photographer;
		this.theme = theme;
	}

	public void display() {
		System.out.println(this.location);
		System.out.println(this.photographer);
		System.out.println(this.theme);
	}

}
