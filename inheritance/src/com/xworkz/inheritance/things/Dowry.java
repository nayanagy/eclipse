package com.xworkz.inheritance.things;

public class Dowry {
	public String reciver;
	public double amount;
	public String giver;

	public Dowry(String reciver, double amount, String giver) {
		super();
		this.reciver = reciver;
		this.amount = amount;
		this.giver = giver;
	}

	public void display() {
		System.out.println(this.amount);
		System.out.println(this.giver);
		System.out.println(this.reciver);
	}
}
