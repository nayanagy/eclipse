package com.xworkz.stream.Dto;

import java.io.Serializable;

public class DaughterDTO extends CompanyCEODTO implements Serializable {
	private String name;
	private long mobileNo;
	private int age;
	private boolean commited;
	private boolean alive;

	public DaughterDTO() {
		super();
	}

	public DaughterDTO(String name, long mobileNo, int age, boolean commited, boolean alive) {
		super();
		this.name = name;
		this.mobileNo = mobileNo;
		this.age = age;
		this.commited = commited;
		this.alive = alive;
	}

	

	@Override
	public String toString() {
		return "DaughterDTO [name=" + name + ", mobileNo=" + mobileNo + ", age=" + age + ", commited=" + commited
				+ ", alive=" + alive + ", getName()=" + getName() + ", getMobileNo()=" + getMobileNo() + ", getAge()="
				+ getAge() + ", isCommited()=" + isCommited() + ", isAlive()=" + isAlive() + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isCommited() {
		return commited;
	}

	public void setCommited(boolean commited) {
		this.commited = commited;
	}

	public boolean isAlive() {
		return alive;
	}

	public void setAlive(boolean alive) {
		this.alive = alive;
	}

	
}
