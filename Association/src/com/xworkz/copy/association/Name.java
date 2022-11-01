package com.xworkz.copy.association;

public class Name {

	public String currentName;
	public String oldName;
	public String futureName;

	public Name(String currentName, String oldName, String futureName) {
		this.currentName = currentName;
		this.oldName = oldName;
		this.futureName = futureName;
	}

	public void display() {
		System.out.println(currentName);
		System.out.println(oldName);
		System.out.println(futureName);

	}

}
