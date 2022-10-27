package com.xworkz.copy.boot;

import com.xworkz.copy.constants.FanBlade;
import com.xworkz.copy.thing.Fan;

public class FanRunner {

	public static void main(String[] args) {
		
		Fan fan=new Fan("Crompton", FanBlade.THREE);
		fan.Show();

	}

}
