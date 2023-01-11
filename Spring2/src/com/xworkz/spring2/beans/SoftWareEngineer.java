package com.xworkz.spring2.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SoftWareEngineer {
	@Autowired
	@Qualifier("engineerName")
	private String engineerName;

	@Autowired
	@Qualifier("salary")
	private double salary;

	@Autowired
	@Qualifier("softWareCompanyName")
	private String companyName;

	@Autowired
	@Qualifier("experience")
	private double experience;

	public String getEngineerName() {
		return engineerName;
	}

	public double getSalary() {
		return salary;
	}

	public String getCompanyName() {
		return companyName;
	}

	public double getExperience() {
		return experience;
	}
}
