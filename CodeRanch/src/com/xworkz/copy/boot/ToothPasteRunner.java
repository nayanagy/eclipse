package com.xworkz.copy.boot;

import com.xworkz.copy.thing.ToothPaste;

public class ToothPasteRunner {

	public static void main(String[] args) {
		String[] name= {"colgate"};
		int[] discount= {20,10};
		int[] quantity= {1,2,3};
		String[] typeOfSalts= {"sodium chloride"};
		String[] color= {"white","Red"};

		ToothPaste toothPaste=new ToothPaste(name,discount,quantity, typeOfSalts, color, true,23.4d,true,"colgate",'M',85.3d);
		toothPaste.display();
	}

	
	

}
