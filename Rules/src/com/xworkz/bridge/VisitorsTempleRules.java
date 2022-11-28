package com.xworkz.bridge;

import com.xworkz.rules.TempleRules;

public class VisitorsTempleRules implements TempleRules {

	@Override
	public boolean keepSandelsOutside() {
		System.out.println("running keepSandelsOutside method ");
		return false;
	}

	@Override
	public String StandInQue() {
		System.out.println("running StandInQue method ");
		return null;
	}

	@Override
	public boolean photoClicks() {
		System.out.println("running photoClicks method ");
		return false;
	}

	@Override
	public boolean wasteParsad() {
		System.out.println("running wasteParsad method ");
		return false;
	}

	@Override
	public String dressCode() {
		System.out.println("running dressCode method ");
		return "formal";
	}

}
