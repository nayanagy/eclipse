package com.xworkz.boot;

import com.xworkz.follower.Passengers;
import com.xworkz.governor.BMRCL;
import com.xworkz.rules.MetroRules;

public class BMRCLRunner {

	public static void main(String[] args) {
		MetroRules metro = new Passengers();
		BMRCL bmrcl = new BMRCL(metro);
		bmrcl.departure();

	}

}
