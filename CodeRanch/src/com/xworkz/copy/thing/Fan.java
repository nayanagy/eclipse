package com.xworkz.copy.thing;

import com.xworkz.copy.constants.FanBlade;

public class Fan {
	public String name;
	public FanBlade  noOfBlades;
	
	public Fan() {
		System.out.println("Default constr");
	}
	
	public Fan(String name,FanBlade noOfBlades) {
		this.name=name;
		this.noOfBlades=noOfBlades;
	}
	
	public void Show() {
		System.out.println(this.name);
		System.out.println(this.noOfBlades);
		System.out.println(this.noOfBlades.value);
		System.out.println(this.noOfBlades.ordinal());

		
	}

}
