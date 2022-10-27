package com.xworkz.copy.thing;

public class God {

	public String name;
	public String gender;
	public String mainPower;
	public Weapon weapon = new Weapon("Trishula", "Extermination", 5);

	public God(String name, String gender, String mainPower) {
		this.name = name;
		this.gender = gender;
		this.mainPower = mainPower;
	}

	public void Showoff() {
		System.out.println(this.gender);
		System.out.println(this.mainPower);

		this.weapon.showoff();
	}
}
