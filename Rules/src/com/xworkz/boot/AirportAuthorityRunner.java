package com.xworkz.boot;

import com.xworkz.follower.Staff;
import com.xworkz.governor.AirportAuthority;
import com.xworkz.rules.AirportRules;

public class AirportAuthorityRunner {

	public static void main(String[] args) {
		AirportRules airport = new Staff();
		AirportAuthority airportAuthority = new AirportAuthority(airport);
		airportAuthority.departure();

	}

}
