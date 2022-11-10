package com.xworkz.inheritance.childClass;

import com.xworkz.inheritance.things.Home;

public class Pg extends Home {
	@Override
	public void stay() {
		super.stay();
		System.out.println("Running method stay in pg");
	}
}
