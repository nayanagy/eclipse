package com.xworkz.stream.Dto;

import java.io.Serializable;

public class PalaceDTO implements Serializable {
	private String name;
	private String location;
	private String builtby;
	private boolean destroyed;
	private double visitingFees;

	public PalaceDTO() {
		super();
	}

	public PalaceDTO(String name, String location, String builtby, boolean destroyed, double visitingFees) {
		super();
		this.name = name;
		this.location = location;
		this.builtby = builtby;
		this.destroyed = destroyed;
		this.visitingFees = visitingFees;
	}

	@Override
	public String toString() {
		return "PalaceDTO [name=" + name + ", location=" + location + ", builtby=" + builtby + ", destroyed="
				+ destroyed + ", visitingFees=" + visitingFees + "]";
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

	public String getBuiltby() {
		return builtby;
	}

	public void setBuiltby(String builtby) {
		this.builtby = builtby;
	}

	public boolean isDestroyed() {
		return destroyed;
	}

	public void setDestroyed(boolean destroyed) {
		this.destroyed = destroyed;
	}

	public double getVisitingFees() {
		return visitingFees;
	}

	public void setVisitingFees(double visitingFees) {
		this.visitingFees = visitingFees;
	}

}
