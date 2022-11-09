package com.xworkz.inheritance.things;

public class PoliticalParty {
	public int noOfMembers;
	public String state;

	public PoliticalParty(int noOfMembers, String state) {
		
		this.noOfMembers = noOfMembers;
		this.state = state;
	}

	public void display() {
		System.out.println(this.noOfMembers);
		System.out.println(this.state);
	}

}
