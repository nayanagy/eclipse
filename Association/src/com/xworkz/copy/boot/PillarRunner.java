package com.xworkz.copy.boot;

import com.xworkz.copy.constraints.Shape;
import com.xworkz.copy.thing.Pillar;

public class PillarRunner {

	public static void main(String[] args) {

		Pillar piller = new Pillar(1, "Banglore", Shape.CIRECLE, 15.3, "Iron");
		piller.showoff();
	}

}
