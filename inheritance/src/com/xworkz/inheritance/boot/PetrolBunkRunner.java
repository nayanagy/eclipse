package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.childClass.Venkateshwara;

public class PetrolBunkRunner {
	public static void main(String[] args) {
		Venkateshwara venkat = new Venkateshwara();
		venkat.diesel();
		venkat.petrol();
		venkat.petrol("Indian");
	}

}
