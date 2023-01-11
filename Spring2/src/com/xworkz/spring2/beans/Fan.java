package com.xworkz.spring2.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Fan {
	@Autowired
	@Qualifier("fanName")
	private String fanName;

	@Autowired
	@Qualifier("fanColor")
	private String fanColor;

	@Autowired
	@Qualifier("fanPrice")
	private double fanPrice;

	@Autowired
	@Qualifier("fanWorking")
	private boolean fanWorking;

	@Autowired
	@Qualifier("fanButtons")
	private int fanButtons;

	@Autowired
	@Qualifier("fanCompany")
	private String fanCompany;

	@Autowired
	@Qualifier("fangstno")
	private String fanGSTNo;

	@Autowired
	@Qualifier("fanVolts")
	private double volts;

	@Autowired
	@Qualifier("wings")
	private int wings;

	public String getFanName() {
		return fanName;
	}

	public String getFanColor() {
		return fanColor;
	}

	public double getFanPrice() {
		return fanPrice;
	}

	public boolean isFanWorking() {
		return fanWorking;
	}

	public int getFanButtons() {
		return fanButtons;
	}

	public String getFanCompany() {
		return fanCompany;
	}

	public String getFanGSTNo() {
		return fanGSTNo;
	}

	public double getVolts() {
		return volts;
	}

	public int getWings() {
		return wings;
	}

}
