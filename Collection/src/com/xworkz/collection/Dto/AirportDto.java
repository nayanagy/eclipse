package com.xworkz.collection.Dto;

import java.io.Serializable;

public class AirportDto implements Serializable {
	private String name;
	private String location;
	private int noOfWorkers;

	public AirportDto() {
		super();
	}

	public AirportDto(String name, String location, int noOfWorkers) {
		super();
		this.name = name;
		this.location = location;
		this.noOfWorkers = noOfWorkers;
	}

	@Override
	public String toString() {
		return "AirportDto [name=" + name + ", location=" + location + ", noOfWorkers=" + noOfWorkers + "]";
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("running equals from AirportDto");
		if (obj != null) {
			if (obj instanceof AirportDto) {
				AirportDto dto = (AirportDto) obj;
				// if (dto.name.equals(this.name) || dto.location.equals(this.location)||
				// dto.noOfWorkers == this.noOfWorkers)
				if (dto.name.equals(this.name)) {
					System.out.println("name is matching : " + dto.name);
					return true;
				}
			}
		}
		return false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getNoOfWorkers() {
		return noOfWorkers;
	}

	public void setNoOfWorkers(int noOfWorkers) {
		this.noOfWorkers = noOfWorkers;
	}

}
