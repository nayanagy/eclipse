package com.xworkz.boot;

import com.xworkz.governor.VijayaLakshmi;

public class VijayaLakshmiRunner {

	public static void main(String[] args) {
		VijayaLakshmi ref = new VijayaLakshmi("nishitha", 30000, "Software trainee", 22, "Banglore");
		ref.completedProgram();
		ref.display();
		ref.eat();
		ref.gst();
		ref.paidTax(3000);
		ref.sleep();
		ref.uploadedTask();
		ref.vat();

	}

}
