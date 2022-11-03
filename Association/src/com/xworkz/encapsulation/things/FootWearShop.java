package com.xworkz.encapsulation.things;

public class FootWearShop {
	String shopName = "Liberty";
	FootWear footWear = new FootWear();

	public void display() {
		System.out.println(shopName);
		if(this.footWear !=null) {
			System.out.println(footWear.getBrand());
			System.out.println(footWear.getColor());
			System.out.println(footWear.getGender());
			System.out.println(footWear.getGuarantee());
			System.out.println(footWear.getPrice());
			System.out.println(footWear.getQuantity());
			System.out.println(footWear.getShopName());
			System.out.println(footWear.getSize());
			System.out.println(footWear.getType());
			System.out.println(footWear.isLeather());
			System.out.println(footWear.isOnlineAvailable());
			System.out.println(footWear.isQuality());
			System.out.println(footWear.isWaterProof());
			
			footWear.setFootWears("Flats", "Nike", "Black", 7, 750d, true, true, 2, false, false, 0, "Male", "VishalMart");
			System.out.println("After modifying properties");
			System.out.println(footWear.getBrand());
			System.out.println(footWear.getColor());
			System.out.println(footWear.getGender());
			System.out.println(footWear.getGuarantee());
			System.out.println(footWear.getPrice());
			System.out.println(footWear.getQuantity());
			System.out.println(footWear.getShopName());
			System.out.println(footWear.getSize());
			System.out.println(footWear.getType());
			System.out.println(footWear.isLeather());
			System.out.println(footWear.isOnlineAvailable());
			System.out.println(footWear.isQuality());
			System.out.println(footWear.isWaterProof());
		}else {
			System.out.println("FootWear is null");
		}

	}

}
