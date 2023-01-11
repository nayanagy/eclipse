package com.xworkz.spring2.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SoftWare {
	@Autowired
	@Qualifier("softwareName")
	private String name;
	@Autowired
	private double version;
	@Autowired
	@Qualifier("devloper")
	private String devloper;
	@Autowired
	@Qualifier("date")
	private String date;
	@Autowired
	private boolean free;

	public String getName() {
		return name;
	}

	public double getVersion() {
		return version;
	}

	public String getDevloper() {
		return devloper;
	}

	public String getDate() {
		return date;
	}

	public boolean isFree() {
		return free;
	}

}
