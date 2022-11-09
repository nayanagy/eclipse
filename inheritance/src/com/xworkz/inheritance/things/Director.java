package com.xworkz.inheritance.things;

public class Director {
	public String movie;
	public int experience;

	public Director(String movie, int experience) {
		this.experience = experience;
		this.movie = movie;
	}

	public void display() {
		System.out.println(experience);
		System.out.println(movie);
	}

}
