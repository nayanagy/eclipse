package com.xworkz.spring2.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class HardWareShop {
	@Autowired
	private int id;
	@Autowired
	@Qualifier("shopName")
	private String name;
	@Autowired
	@Qualifier("gstNo")
	private String gstNo;
	@Autowired
	@Qualifier("ownerName")
	private String ownerName;
	@Autowired
	@Qualifier("address")
	private String address;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getGstNo() {
		return gstNo;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public String getAddress() {
		return address;
	}

}
