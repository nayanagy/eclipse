package com.xworkz.governor;

import com.xworkz.rules.XworkzRule;

public class JavaTrainee extends Person implements XworkzRule {

	public JavaTrainee(String name, double salary, String jobRole, int age, String location) {
		super(name, salary, jobRole, age, location);

	}

	@Override
	public boolean uploadedTask() {
		System.out.println("running uploadedTask method ");
		return false;
	}

	@Override
	public boolean completedProgram() {
		System.out.println("running completedProgram method ");
		return false;
	}

}
