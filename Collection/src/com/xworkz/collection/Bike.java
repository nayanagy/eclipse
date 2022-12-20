package com.xworkz.collection;

import java.util.Collection;
import java.util.LinkedList;

public class Bike {

	public static void main(String[] args) {
		Collection<String> bike = new LinkedList();
		bike.add("R15");
		bike.add("KTM");
		bike.add("Yamaha");
		bike.add("Royal Enfield");
		bike.add("Hero Honda");
		bike.add("Apache");
		bike.add("Himalayan");
		bike.add("Passion Pro");
		bike.add("Pulsar");
		bike.add("TVS Motor");
		bike.add("Bajaj");
		bike.add("Specialized");
		bike.add("Ducati");
		bike.add("BMC");
		bike.add("Trek");
		bike.add("Marin Bikes");
		bike.add("Yamaha YZF ");
		bike.add("Hero Karizma ZMR");

		System.out.println(bike.size());

		bike.clear();
		System.out.println("After clear : " + bike.size());
	}

}
