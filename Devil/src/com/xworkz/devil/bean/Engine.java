package com.xworkz.devil.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Engine {

	private String name;// const
	private String type;// constructor
	@Autowired
	@Qualifier("engineNumber")
	private long number;// prperty
	@Autowired
	@Qualifier("engineVersion")
	private double version;// property
	private String company;// constructor
	private int strokes;// setter

	@Autowired
	public Engine(@Qualifier("engineName") String name, @Qualifier("engineType") String type,
			@Qualifier("engineCompany") String company) {
		super();
		this.name = name;
		this.type = type;
		this.company = company;
	}

	
	@Override
	public String toString() {
		return "Engine [name=" + name + ", type=" + type + ", number=" + number + ", version=" + version + ", company="
				+ company + ", strokes=" + strokes + "]";
	}


	@Autowired
	@Qualifier("engineStrokes")
	public void setStrokes(int strokes) {
		this.strokes = strokes;
	}

	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}

	public long getNumber() {
		return number;
	}

	public double getVersion() {
		return version;
	}

	public String getCompany() {
		return company;
	}

	public int getStrokes() {
		return strokes;
	}

}
