package com.xworkz.inheritance.childClass;

import com.xworkz.inheritance.things.PoliticalParty;

public class BJP extends PoliticalParty {
	public String president;

	public BJP(int noOfMembers,String state, String president) {
		super( noOfMembers,state);
		this.president = president;
	}

	public void display() {
		super.display();
		System.out.println(this.president);
	}

}
