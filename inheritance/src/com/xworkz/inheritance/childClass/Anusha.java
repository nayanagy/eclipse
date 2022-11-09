package com.xworkz.inheritance.childClass;

import com.xworkz.inheritance.things.Criminal;

public class Anusha extends Criminal {
	public boolean jail;

	public Anusha(String type, int imprisonment, boolean jail) {
		super(type, imprisonment);
		this.jail = jail;
	}

	public void display() {
		super.display();
		System.out.println(this.jail);
	}

}
