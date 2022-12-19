package com.xworkz.Examples.dto;

public class PlaceDto extends AbstractAuditDTO {
	private long pin;
	private String oldName;
	private String newName;
	private String famousFor;
	private boolean railwayStation;

	public PlaceDto() {
		super();
	}

	public PlaceDto(long pin, String oldName, String newName, String famousFor, boolean railwayStation) {
		super();
		this.pin = pin;
		this.oldName = oldName;
		this.newName = newName;
		this.famousFor = famousFor;
		railwayStation = railwayStation;
	}

	@Override
	public String toString() {
		return "PlaceDto [pin=" + pin + ", oldName=" + oldName + ", newName=" + newName + ", famousFor=" + famousFor
				+ ", RailwayStation=" + railwayStation + ", toString()=" + super.toString() + "]";
	}

	public long getPin() {
		return pin;
	}

	public void setPin(long pin) {
		this.pin = pin;
	}

	public String getOldName() {
		return oldName;
	}

	public void setOldName(String oldName) {
		this.oldName = oldName;
	}

	public String getNewName() {
		return newName;
	}

	public void setNewName(String newName) {
		this.newName = newName;
	}

	public String getFamousFor() {
		return famousFor;
	}

	public void setFamousFor(String famousFor) {
		this.famousFor = famousFor;
	}

	public boolean isRailwayStation() {
		return railwayStation;
	}

	public void setRailwayStation(boolean railwayStation) {
		railwayStation = railwayStation;
	}

}
