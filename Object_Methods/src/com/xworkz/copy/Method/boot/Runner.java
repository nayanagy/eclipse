package com.xworkz.copy.Method.boot;

import com.xworkz.copy.Method.things.Currency;
import com.xworkz.copy.Method.things.Paint;
import com.xworkz.copy.Method.things.Vehicle;
import com.xworkz.copy.Method.things.WaterBottle;
import com.xworkz.copy.Method.things.God;
import com.xworkz.copy.Method.things.Institution;

public class Runner {

	public static void main(String[] args) {

		Paint paint1 = new Paint("Indigo Paints", 250, 1, "White", "oil-based", "oil", true, false, 98f, 2.5f);
		System.out.println(paint1);

		Paint paint = new Paint();
		paint.setBrand("Nippon Paint");
		paint.setPrice(318);
		paint.setQuantityInLitr(1);
		paint.setColor("White");
		paint.setType("Oil-based");
		paint.setSolventWith("Oil");
		paint.setQuality(true);
		paint.setMeltingPoint(108f);
		paint.setDensity(1.3f);
		System.out.println(paint);

		boolean same = paint.equals(paint1);
		System.out.println(same);

		System.out.println("=============================================");
		Vehicle vehicle = new Vehicle();
		vehicle.setName("car");
		vehicle.setWheels(4);
		vehicle.setBrand("Eratig");
		vehicle.setColor("White");
		vehicle.setQuality(true);
		vehicle.setFuel("petrol");
		vehicle.setMilage(4);
		vehicle.setPrice(16);
		vehicle.setHeight(3.5f);
		vehicle.setWidth(4.5f);
		System.out.println(vehicle);

		Vehicle vehicle1 = new Vehicle("car", 4, "Eratig", "White", true, "petrol", 4, 16, 3.5f, 4.5f);
		System.out.println(vehicle1);

		boolean Similar = vehicle.equals(vehicle1);
		System.out.println(Similar);

		System.out.println("=============================================");
		WaterBottle bottle = new WaterBottle();
		bottle.setBrand("Milton");
		bottle.setColor("Pink");
		bottle.setQuantityInLitr(2.5f);
		bottle.setPrice(90d);
		bottle.setHeight(4.5f);
		bottle.setWeight(8.4f);
		bottle.setType("Plastic");
		bottle.setQuantity(2);
		bottle.setCapColor("Pink");
		bottle.setShape("cylinder");
		System.out.println(bottle);

		WaterBottle bottle1 = new WaterBottle("Milton1", "blue", 2.5f, 100d, 4.5f, 8.4f, "Plastic", 2, "Pink",
				"cylinder");
		System.out.println(bottle1);

		boolean same1 = bottle.equals(bottle1);
		System.out.println(same1);
		
		System.out.println("=============================================");
		Currency currency=new Currency();
		Currency.setType("international");
		Currency.setConvertingPrice(70.5);
		Currency.setMaterial("paper");
		Currency.setValidity(100);
		Currency.setAcceptableCountries("all countries");
		Currency.setMakingCost(11);
		Currency.setTotalCurrancy(5);
		Currency.setStrong(true);
		Currency.setCountryName("USA");
		Currency.setCode('A');

		System.out.println(Currency);
		Currency currency1=new Currency("international",23.2d,"paper",70,"some",23.5d,80,false,"india",'');
		System.out.println(currency1);
		boolean same2=Currency.equals(currency1);
		System.out.println(same2);
		
		System.out.println("=============================================");
		God god=new God();
		god.setEntryFees(65);
		god.setGodCode('g');
		god.setGodPoojaName("arati");
		god.setLocation("tirupati");
		god.setName("venkatesh");
		god.setOriginalName("balaji");
		god.setPowerFull(true);
		god.setPriestName("mahanandiswami");
		god.setTotalDieties(15);
		god.setTotalTemples(100);
		System.out.println(god);

		God god2=new God("manjunath", "manjunath", 10, 'M', "darmasthala", 6, "prabhu", 20, true, "malarpane");
		System.out.println(god2);
		boolean ref=god.equals(god2);
		System.out.println(ref);
		
		System.out.println("=============================================");
		Institution institution=new Institution();
		institution.setCode('I');
		institution.setFees(3654598L);
		institution.setGood(true);
		institution.setLocation("mumbai");
		institution.setName("IIT");
		institution.setPrincipalName("ramesh");
		institution.setTotalBranches(65);
		institution.setTotalRevenue(854566988L);
		institution.setTotalStaffs(250);
		institution.setType("technology based");
		System.out.println(institution);

		Institution institution2=new Institution("IIM", "management", 85460L, 125, 'i', "bharatkumar", "delhi", 4521365L, false, 10);
		System.out.println(institution2);
		boolean same3=institution.equals(institution2);
		System.out.println(same3);
		
		System.out.println("=============================================");
		Hospital hospital=new Hospital();
		hospital.setCharges(650);
		hospital.setGood(false);
		hospital.setHospitalCode('H');
		hospital.setLocation("bengaluru");
		hospital.setMdName("madhavan");
		hospital.setName("apollo");
		hospital.setTotalBranches(125);
		hospital.setTotalRevenue(6523641L);
		hospital.setTotalStaffs(600);
		hospital.setType("multi-speciality");
		System.out.println(hospital);

		Hospital hospital2=new Hospital("people-tree", "eye-hospital", 800, 80, 'm', "ramesh", "hyderabad", 85652365L, false, 28);
		System.out.println(hospital2);

		boolean ref=hospital.equals(hospital2);
		System.out.println(ref);	
		
		
	}

}
