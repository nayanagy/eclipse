package com.xworkz.hymn.dto;

public class InterviewDTO {
	private String name;
	private String company;
	private String role;
	@Override
	public String toString() {
		return "InterviewDTO [name=" + name + ", company=" + company + ", role=" + role + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	
}
