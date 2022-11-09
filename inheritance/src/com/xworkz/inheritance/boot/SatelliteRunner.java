package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.childClass.Moon;

public class SatelliteRunner {

	public static void main(String[] args) {
		Moon moon = new Moon("Natural",17000.0,"White");
		moon.display();
	}

}
