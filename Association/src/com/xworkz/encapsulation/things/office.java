package com.xworkz.encapsulation.things;

public class office {
	public String name = "Xworkz";
	public Fan fan = new Fan();

	public void display() {
		System.out.println(this.name);
		if (this.fan != null) {
			System.out.println(fan.getCompany());
			fan.setCompany("Crompton");
			System.out.println("After modifyng Company : " + fan.getCompany());

			System.out.println(fan.getCompanyOwner());
			fan.setCompanyOwner("Mathew");
			System.out.println("After modifyng owner name : " + fan.getCompanyOwner());

			System.out.println(fan.getColor());
			fan.setColor("White");
			System.out.println("After modifyng color : " + fan.getColor());

			System.out.println(fan.getButtons());
			fan.setButtons(4);
			System.out.println("After modifyng Buttons : " + fan.getButtons());

			System.out.println(fan.getCurrentBill());
			fan.setCurrentBill(200d);
			System.out.println("After modifyng CurrentBill : " + fan.getCurrentBill());

			System.out.println(fan.getGuarantee());
			fan.setGuarantee(1);
			System.out.println("After modifyng Guarantee : " + fan.getGuarantee());

			System.out.println(fan.getNoOfWings());
			fan.setNoOfWings(3);
			System.out.println("After modifyng NoOfWings : " + fan.getNoOfWings());

			System.out.println(fan.getType());
			fan.setType("Tablefan");
			System.out.println("After modifyng Type of fan  : " + fan.getType());

			System.out.println(fan.getWarranty());
			fan.setWarranty(2);
			System.out.println("After modifyng Warranty : " + fan.getWarranty());

			System.out.println(fan.getWingColor());
			fan.setWingColor("Blue");
			System.out.println("After modifyng WingColor  : " + fan.getWingColor());

			System.out.println(fan.isCharging());
			fan.setCharging(true);
			System.out.println("After modifyng Charging  : " + fan.isCharging());

			System.out.println(fan.isRotate());
			fan.setRotate(true);
			System.out.println("After modifyng Rotate : " + fan.isRotate());

			System.out.println(fan.isWorking());
			fan.setWorking(true);
			System.out.println("After modifyng Working : " + fan.isWorking());
		} else {
			System.out.println("Fan is null");
		}
	}

}
