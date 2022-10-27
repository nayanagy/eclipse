package com.xworkz.copy.boot;

import com.xworkz.copy.constraints.Type;
import com.xworkz.copy.thing.Fuel;

public class FuelRunner {

	public static void main(String[] args) {
		Fuel fuel = new Fuel(true, Type.BHARAT_PETROLIUM, 101, 2);
		fuel.showOff();
	}

}
