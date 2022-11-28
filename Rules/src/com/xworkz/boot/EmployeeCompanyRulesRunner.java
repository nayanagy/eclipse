package com.xworkz.boot;

import com.xworkz.bridge.EmployeeCompanyRules;
import com.xworkz.rules.CompanyRules;

public class EmployeeCompanyRulesRunner {

	public static void main(String[] args) {
		CompanyRules rules = new EmployeeCompanyRules();
		rules.behavior();
		rules.dressCode("business Formals");
		//System.out.println(rules.dressCode("business Formals"));
		rules.loginTime(true);
		rules.logOutTime(9);
		rules.wearID();

	}

}
