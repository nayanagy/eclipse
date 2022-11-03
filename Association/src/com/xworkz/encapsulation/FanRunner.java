package com.xworkz.encapsulation;

import com.xworkz.encapsulation.things.office;

public class FanRunner {

	public static void main(String[] args) {
		office office = new office();

		System.out.println(office.name);
		System.out.println(office.fan);// fqn

		office.display();

	}

}
