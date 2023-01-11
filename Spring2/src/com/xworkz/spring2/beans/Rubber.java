package com.xworkz.spring2.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Rubber {
	@Autowired
	@Qualifier("rubberName")
	private String rubberName;

	@Autowired
	@Qualifier("rubberType")
	private String rubberType;

	@Autowired
	@Qualifier("rubberPrice")
	private Double price;

	@Autowired
	@Qualifier("rubberColor")
	private String color;

	@Autowired
	@Qualifier("rubberShape")
	private String shape;

	@Autowired
	@Qualifier("rubberStolen")
	private Boolean stolen;

	public String getRubberName() {
		return rubberName;
	}

	public String getRubberType() {
		return rubberType;
	}

	public Double getPrice() {
		return price;
	}

	public String getColor() {
		return color;
	}

	public String getShape() {
		return shape;
	}

	public Boolean getStolen() {
		return stolen;
	}

}
