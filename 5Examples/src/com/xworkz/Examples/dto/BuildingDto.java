package com.xworkz.Examples.dto;

public class BuildingDto extends AbstractAuditDTO {
	private int no;
	private String name;
	private int floors;
	private boolean lift;
	private boolean parking;
	private String type;

	public BuildingDto() {
		super();
	}

	public BuildingDto(int no, String name, int floors, boolean lift, boolean parking, String type) {
		super();
		this.no = no;
		this.name = name;
		this.floors = floors;
		this.lift = lift;
		this.parking = parking;
		this.type = type;
	}

	@Override
	public String toString() {
		return "Building [no=" + no + ", name=" + name + ", floors=" + floors + ", lift=" + lift + ", parking="
				+ parking + ", type=" + type + ", toString()=" + super.toString() + "]";
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getFloors() {
		return floors;
	}

	public void setFloors(int floors) {
		this.floors = floors;
	}

	public boolean isLift() {
		return lift;
	}

	public void setLift(boolean lift) {
		this.lift = lift;
	}

	public boolean isParking() {
		return parking;
	}

	public void setParking(boolean parking) {
		this.parking = parking;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
