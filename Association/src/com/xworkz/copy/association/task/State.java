package com.xworkz.copy.association.task;

public class State {
	public String stateName;
	public int noOfDistricts;
	public String chiefMinister;
	public String stateCode;

	public State(String stateName, int noOfDistricts, String chiefMinister, String stateCode) {
		super();
		this.stateName = stateName;
		this.noOfDistricts = noOfDistricts;
		this.chiefMinister = chiefMinister;
		this.stateCode = stateCode;
	}

	public void see() {
		System.out.println(this.stateName);
		System.out.println(this.noOfDistricts);
		System.out.println(this.chiefMinister);
		System.out.println(this.stateCode);
	}

}
