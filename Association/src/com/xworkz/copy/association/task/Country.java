package com.xworkz.copy.association.task;

public class Country {
	public String name;
	public String president;
	public int noOfStates;
	public String capital;

	public Country(String name, String president, int noOfStates, String capital) {
		super();
		this.name = name;
		this.president = president;
		this.noOfStates = noOfStates;
		this.capital = capital;
	}

	public void display() {
		System.out.println(this.name);
		System.out.println(this.capital);
		System.out.println(this.noOfStates);
		System.out.println(this.president);
	}

}
