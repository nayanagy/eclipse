package com.xworkz.collection.Dto;

import java.io.Serializable;

public class CalendarDto implements Serializable {
	private String name;
	private int pages;
	private String color;

	public CalendarDto() {
		super();
	}

	public CalendarDto(String name, int pages, String color) {
		super();
		this.name = name;
		this.pages = pages;
		this.color = color;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("running equals from CalendarDto");
		if (obj != null) {
			if (obj instanceof CalendarDto) {
				CalendarDto dto = (CalendarDto) obj;// casting
				if (dto.name.equals(this.name)) {
					System.out.println("name is matching : " + dto.name);
					return true;
				}

			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "CalendarDto [name=" + name + ", pages=" + pages + ", color=" + color + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
