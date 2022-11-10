package com.xworkz.inheritance.childClass;

import com.xworkz.inheritance.things.Terrorist;

public class Kasab extends Terrorist {
	@Override
	public void crime() {
		super.crime();
		System.out.println("running method crime in kasab");
	}
}
