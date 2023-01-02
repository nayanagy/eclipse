package com.xworkz.stream.Dto;

import java.io.Serializable;

import com.xworkz.stream.constant.Type;

public class DataBaseVendorDTO implements Serializable {
	private String name;
	private String developedBy;
	private Type type;
	private float size;
	private double licensecost;

	public DataBaseVendorDTO(String name, String developedBy, Type type, float size, double licensecost) {
		super();
		this.name = name;
		this.developedBy = developedBy;
		this.type = type;
		this.size = size;
		this.licensecost = licensecost;
	}

	public DataBaseVendorDTO() {
		super();
	}

	@Override
	public String toString() {
		return "DataBaseVendorDTO [name=" + name + ", developedBy=" + developedBy + ", type=" + type + ", size=" + size
				+ ", licensecost=" + licensecost + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDevelopedBy() {
		return developedBy;
	}

	public void setDevelopedBy(String developedBy) {
		this.developedBy = developedBy;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public float getSize() {
		return size;
	}

	public void setSize(float size) {
		this.size = size;
	}

	public double getLicensecost() {
		return licensecost;
	}

	public void setLicensecost(double licensecost) {
		this.licensecost = licensecost;
	}

}
