package com.xworkz.Examples.dto;

public class BakeryDto extends AbstractAuditDTO {
	private String name;
	private String owner;
	private long contactNo;
	private String location;
	private String famousFor;

	public BakeryDto() {
		super();
	}

	public BakeryDto(String name, String owner, long contactNo, String location, String famousFor) {
		super();
		this.name = name;
		this.owner = owner;
		this.contactNo = contactNo;
		this.location = location;
		this.famousFor = famousFor;
	}

	@Override
	public String toString() {
		return "Bakery [name=" + name + ", owner=" + owner + ", contactNo=" + contactNo + ", location=" + location
				+ ", famousFor=" + famousFor + ", toString()=" + super.toString() + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public long getContactNo() {
		return contactNo;
	}

	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getFamousFor() {
		return famousFor;
	}

	public void setFamousFor(String famousFor) {
		this.famousFor = famousFor;
	}

}
