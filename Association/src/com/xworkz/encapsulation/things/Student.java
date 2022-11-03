package com.xworkz.encapsulation.things;

public class Student {
	private String studentName="Nayana";
	public Mobile mobile = new Mobile(4, false, true, true, 5.6f, 20.5f, 4, true);

	public void display() {
		System.out.println(studentName);
		if (this.mobile != null) {
			System.out.println(mobile.ramInGB);
			System.out.println(mobile.faceLock);
			System.out.println(mobile.fingerPrint);
			System.out.println(mobile.length);
			System.out.println(mobile.internetConnectivity);
			System.out.println(mobile.version);
			System.out.println(mobile.weight);
			System.out.println(mobile.working);

			System.out.println(mobile.getColor());
			System.out.println(mobile.getCompany());
			System.out.println(mobile.getName());
			System.out.println(mobile.getPrice());
			System.out.println(mobile.getStorage());

			mobile.setProerties("oppo11", "oppo", 64, "blue", 22000);

			System.out.println("after modify color: "+mobile.getColor());
			System.out.println("after modify company: "+mobile.getCompany());
			System.out.println("after modify name: "+mobile.getName());
			System.out.println("after modify price: "+mobile.getPrice());
			System.out.println("after modify Storage: "+mobile.getStorage());

		}
		else {
			System.out.println("Mobile is null");
		}
	}

}
