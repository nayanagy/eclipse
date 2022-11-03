package com.xworkz.encapsulation.things;

public class Hotel {
	private String name = "New sagar";
	FoodOrderApp food = new FoodOrderApp();

	public void showOff() {
		System.out.println(name);
		if (this.food != null) {
			System.out.println(food.getName());
			food.setName("Swiggy");
			System.out.println("After modifying name: " + food.getName());

			System.out.println(food.getFoodType());
			food.setFoodType("Non-veg");
			System.out.println("After modifying type of food :" + food.getFoodType());

			System.out.println(food.getAddress());
			food.setAddress("Vijaynagr");
			System.out.println("After modifying address :" + food.getAddress());

			System.out.println(food.getDeliveryhours());
			food.setDeliveryhours(2);
			System.out.println("After modifying Delivery hours : " + food.getDeliveryhours());

			System.out.println(food.getPreaperingTime());
			food.setPreaperingTime(1.30f);
			System.out.println("After Modifying Preparing time: " + food.getPreaperingTime());

			System.out.println(food.getDeliveryNo());
			food.setDeliveryNo(321);
			System.out.println("After Modifying Delivery number :" + food.getDeliveryNo());

			System.out.println(food.getMblNo());
			food.setMblNo(984563425l);
			System.out.println("After Modifying Mobile number :" + food.getMblNo());

			System.out.println(food.getQuantity());
			food.setQuantity(1);
			System.out.println("After Modifying Quantity :" + food.getQuantity());

			System.out.println(food.isOffers());
			food.setOffers(false);
			System.out.println("After Modifying offers :" + food.isOffers());

			System.out.println(food.isCod());
			food.setCod(false);
			System.out.println("After modifying cash on delivery :" + food.isCod());

			System.out.println(food.isQuality());
			food.setQuality(false);
			System.out.println("After modifying quality of food :" + food.isQuality());

			System.out.println(food.getDiscount());
			food.setDiscount(0.0f);
			System.out.println("After modifying discount :" + food.getDiscount());

			System.out.println(food.getRatings());
			food.setRatings(4);
			System.out.println("After modifying ratings :" + food.getRatings());

		}
	}

}
