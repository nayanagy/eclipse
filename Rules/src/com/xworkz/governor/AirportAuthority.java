package com.xworkz.governor;

import com.xworkz.rules.AirportRules;

public class AirportAuthority {

	private AirportRules airport;

	public AirportAuthority() {
		System.out.println("Default const of AirportAuthority");
	}

	public AirportAuthority(AirportRules airport) {
		this.airport = airport;
	}

	public void departure() {
		System.out.println("running wearMask and luggage");
		if (this.airport != null) {
			boolean check = this.airport.wearMask();
			int check1 = this.airport.luggage();
			{
				if (check == true && check1 == 0) {
					System.out.println("Staff follow the rules");
				} else {
					System.out.println("Staff not follow the rules");
				}
			}
		}
	}

}
