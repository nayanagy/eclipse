package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.childClass.Akshara;

public class HRRunner {
	public static void main(String[] args) {
		Akshara akshara = new Akshara();
		akshara.hire();
		akshara.fire();
		akshara.hire("Nishitha");
	}

}
