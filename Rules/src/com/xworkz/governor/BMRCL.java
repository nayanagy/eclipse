package com.xworkz.governor;

import com.xworkz.rules.MetroRules;

public class BMRCL {

	private MetroRules metro;

	public BMRCL() {
		System.out.println("default const of BMRCL");
	}

	public BMRCL(MetroRules metro) {
		this.metro = metro;
	}

	public void departure() {
		System.out.println("running wearMask and ticket");
		if (this.metro != null) {
			boolean check = this.metro.wearMask();
			boolean check1 = this.metro.ticket();
			{
				if (check == true && check1 == true) {
					System.out.println("Passengers follow the rules");
				} else {
					System.out.println("Passengers not follow the rules");
				}
			}
		}
	}

}
