package com.xworkz.boot;

import com.xworkz.bridge.StudentCollegeRules;
import com.xworkz.rules.CollegeRules;

public class StudentRunner {

	public static void main(String[] args) {
		StudentCollegeRules rule=new StudentCollegeRules();
		rule.attendence();
		rule.time(true);
		rule.uniform("blue");
		rule.useMobile();
		rule.wearID();

	}

}
