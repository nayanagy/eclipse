package com.xworkz.devil.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Snake {
	private String name;// constructor
	@Autowired
	@Qualifier("snakeLength")
	
	private double length;// property
	@Autowired
	@Qualifier("snakeColor")
	private String color;// property
	private String type;// constructor
	private boolean poisionous;// constructor

	@Autowired
	public Snake(@Qualifier("snakeName") String name, @Qualifier("snakeType") String type,
			@Qualifier("snakePoisionous") boolean poisionous) {
		super();
		this.name = name;
		this.type = type;
		this.poisionous = poisionous;
	}

	@Override
	public String toString() {
		return "Snake [name=" + name + ", length=" + length + ", color=" + color + ", type=" + type + ", poisionous="
				+ poisionous + "]";
	}

}
