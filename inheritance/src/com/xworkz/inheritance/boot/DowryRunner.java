package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.childClass.Money;
import com.xworkz.inheritance.things.Dowry;

public class DowryRunner {
	public static void main(String[] args) {

		Dowry dowry = new Money("bride", 1000000, "groom");
		dowry.display();

	}

}
