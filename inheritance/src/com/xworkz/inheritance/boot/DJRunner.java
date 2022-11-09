package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.childClass.ClubDJ;
import com.xworkz.inheritance.things.DJ;

public class DJRunner {
	public static void main(String[] args) {
		DJ dj = new ClubDJ("banglore", 250, 1000);
		dj.display();

	}
}
