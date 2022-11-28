package com.xworkz.rules;

public interface CompanyRules {
	boolean wearID();

	float loginTime(boolean followed);

	boolean dressCode(String type);

	int logOutTime(int hours);

	String behavior();

}
