package com.xworkz.stream.Dto;

import java.io.Serializable;

import java.time.LocalDate;

import com.xworkz.stream.constant.WeaponType;

public class WeaponDTO implements Serializable {
	private String name;
	private String madeBy;
	private LocalDate madeOn;
	private Double price;
	private WeaponType weaponType;

	public WeaponDTO() {
		super();
	}

	public WeaponDTO(String name, String madeBy, LocalDate madeOn, Double price, WeaponType weaponType) {
		super();
		this.name = name;
		this.madeBy = madeBy;
		this.madeOn = madeOn;
		this.price = price;
		this.weaponType = weaponType;
	}

	@Override
	public String toString() {
		return "WeaponDTO [name=" + name + ", madeBy=" + madeBy + ", madeOn=" + madeOn + ", price=" + price
				+ ", weaponType=" + weaponType + "]";
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 4;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			if (obj instanceof WeaponDTO) {
				WeaponDTO ref = (WeaponDTO) obj;
				if (this.name.equalsIgnoreCase(ref.name) && this.weaponType.equals(ref.weaponType)) {
					System.out.println("Weapons are same" + ref);

				}
			}
		}
		return false;
	}

	// public int compareTo
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMadeBy() {
		return madeBy;
	}

	public void setMadeBy(String madeBy) {
		this.madeBy = madeBy;
	}

	public LocalDate getMadeOn() {
		return madeOn;
	}

	public void setMadeOn(LocalDate madeOn) {
		this.madeOn = madeOn;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public WeaponType getWeaponType() {
		return weaponType;
	}

	public void setWeaponType(WeaponType weaponType) {
		this.weaponType = weaponType;
	}

}