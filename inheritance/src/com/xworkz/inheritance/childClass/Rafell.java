package com.xworkz.inheritance.childClass;

import com.xworkz.inheritance.things.WarJet;

public class Rafell extends WarJet {
	@Override
	public void fly() {
		super.fly();
		System.out.println("Running method fly in rafell");
	}

}
