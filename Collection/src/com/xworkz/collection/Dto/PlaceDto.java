package com.xworkz.collection.Dto;

import java.io.Serializable;

public class PlaceDto implements Serializable {
	private String name;
	private long pincode;
	private String district;

	public PlaceDto() {
		super();
	}

	public PlaceDto(String name, long pincode, String district) {
		super();
		this.name = name;
		this.pincode = pincode;
		this.district = district;
	}

	@Override
	public String toString() {
		return "PlaceDto [name=" + name + ", pincode=" + pincode + ", district=" + district + "]";
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("running equals from PlaceDto");
		if (obj != null) {
			if (obj instanceof PlaceDto) {
				PlaceDto dto = (PlaceDto) obj;// casting
				if (dto.district.equals(this.district)) {
					System.out.println("district is matching : " + dto.district);
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

	public long getPincode() {
		return pincode;
	}

	public void setPincode(long pincode) {
		this.pincode = pincode;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

}
