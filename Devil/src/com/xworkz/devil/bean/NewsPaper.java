package com.xworkz.devil.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class NewsPaper {
	@Autowired
	@Qualifier("newsPaperID")
	private int id;// property
	private String name;// constructor
	private String ownerName;// constructor
	@Autowired
	@Qualifier("newsPaperLanguage")
	private String language;// property
	private double price;// setter

	@Autowired
	public NewsPaper(@Qualifier("newsPaperName") String name, @Qualifier("newsPaperOwnerName") String ownerName) {
		super();
		this.name = name;
		this.ownerName = ownerName;
	}

	@Autowired
	@Qualifier("newsPaperPrice")
	public void setPrice(double price) {
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public String getLanguage() {
		return language;
	}

	public double getPrice() {
		return price;
	}

}
