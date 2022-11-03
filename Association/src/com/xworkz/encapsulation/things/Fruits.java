package com.xworkz.encapsulation.things;

public class Fruits {
	String ownerName = "Viresh";
	Pomegranate dalimbe = new Pomegranate();
	Strawberry strawberry = new Strawberry();
	Mango mango = new Mango();
	Coconut coconut = new Coconut();

	public void display() {
		System.out.println(ownerName);
		if (this.dalimbe != null) {
			System.out.println(dalimbe.getShopName());
			System.out.println(dalimbe.getPrice());
			System.out.println(dalimbe.getQuantity());
			System.out.println(dalimbe.getBrand());
			System.out.println(dalimbe.getOrderedBy());
			System.out.println(dalimbe.getOrderedOn());
			System.out.println(dalimbe.getOrderNo());
			System.out.println(dalimbe.getPrice());
			System.out.println(dalimbe.getQuantity());
			System.out.println(dalimbe.getByWith());

			dalimbe.setProperties("Shiava", 250d, 2, "merit", "Freshcity", "Almonds", false, "27g", false, 23,
					"Kavitha", "aug20", 20);

			System.out.println("after modifying properties");
			System.out.println(dalimbe.getShopName());
			System.out.println(dalimbe.getPrice());
			System.out.println(dalimbe.getQuantity());
			System.out.println(dalimbe.getBrand());
			System.out.println(dalimbe.getOrderedBy());
			System.out.println(dalimbe.getOrderedOn());
			System.out.println(dalimbe.getOrderNo());
			System.out.println(dalimbe.getPrice());
			System.out.println(dalimbe.getQuantity());
			System.out.println(dalimbe.getByWith());

		} else {
			System.out.println("notes is null");
		}

		if (this.strawberry != null) {
			System.out.println(strawberry.getShopName());
			System.out.println(strawberry.getPrice());
			System.out.println(strawberry.getQuantity());
			System.out.println(strawberry.getBrand());
			System.out.println(strawberry.getOrderedBy());
			System.out.println(strawberry.getOrderedOn());
			System.out.println(strawberry.getOrderNo());
			System.out.println(strawberry.getPrice());
			System.out.println(strawberry.getQuantity());
			System.out.println(strawberry.getByWith());

			strawberry.setProperties("Shiava", 250d, 2, "merit", "Freshcity", "Almonds", false, "27g", false, 23,
					"Kavitha", "aug20", 20);

			
		}
		else {
			System.out.println("strawberry is null");
		}
		
		if (this.mango != null) {
			System.out.println(mango.getShopName());
			System.out.println(mango.getPrice());
			System.out.println(mango.getQuantity());
			System.out.println(mango.getBrand());
			System.out.println(mango.getOrderedBy());
			System.out.println(mango.getOrderedOn());
			System.out.println(mango.getOrderNo());
			System.out.println(mango.getPrice());
			System.out.println(mango.getQuantity());
			System.out.println(mango.getByWith());

			mango.setProperties("Shiava", 250d, 2, "merit", "Freshcity", "Almonds", false, "27g", false, 23,
					"Kavitha", "aug20", 20);

			
		}
		else {
			System.out.println("mango is null");
		}
		
		if (this.coconut != null) {
			System.out.println(coconut.getShopName());
			System.out.println(coconut.getPrice());
			System.out.println(coconut.getQuantity());
			System.out.println(coconut.getBrand());
			System.out.println(coconut.getOrderedBy());
			System.out.println(coconut.getOrderedOn());
			System.out.println(coconut.getOrderNo());
			System.out.println(coconut.getPrice());
			System.out.println(coconut.getQuantity());
			System.out.println(coconut.getByWith());

			coconut.setProperties("Shiava", 250d, 2, "merit", "Freshcity", "Almonds", false, "27g", false, 23,
					"Kavitha", "aug20", 20);

			
		}
		else {
			System.out.println("coconut is null");
		}

	}
}
