package com.xworkz.copy.boot;

import com.xworkz.copy.thing.Cloths;

public class ClothsRunner {

	public static void main(String[] args) {
		
		int[] discount= {20};
		int[] quantity= {3};
		String[] gender={"Female","male"};
		String[] shopName={"Trends","Max"};
		String[] location={"Shimoga","Banglure"};
		
		
		Cloths cloths=new Cloths("cotton",500d,"Avasa","white", 32, "Kurthi",discount,quantity,gender,shopName,location);
		cloths.display();

	}

}


