package com.xworkz.copy.thing;

public class GroceryStore {
	public String[] name;
	public String[] location;
	public int[] workers_id;
	public String[] typeOfItems;
	public String[] facility;
	public double salaryOfWorkers;
	public String owner;
	public double discountInPercent;
	public boolean onlinePayment;
	public boolean onlineShopping;
	public int noOfWorkers;
	
	public GroceryStore(String[] name,String[] location,int[] workers_id,String[] typeOfItems,String[] facility,
			double salaryOfWorkers,String owner,double discountInPercent, boolean onlinePayment,boolean onlineShopping,int noOfWorkers) {
		this.name=name;
		this.location=location;
		this.workers_id=workers_id;
		this.typeOfItems=typeOfItems;
		this.facility=facility;
		this.salaryOfWorkers=salaryOfWorkers;
		this.owner=owner;
		this.discountInPercent=discountInPercent;
		this.onlinePayment=onlinePayment;
		this.onlineShopping=onlineShopping;
		this.noOfWorkers=noOfWorkers;
	}
	public void display() {
		for(int i=0;i<name.length;i++) {
			System.out.println(name[i]);
		}
		
		for(int i=0;i<location.length;i++) {
			System.out.println(location[i]);
		}
		
		for(int i=0;i<workers_id.length;i++) {
			System.out.println(workers_id[i]);
		}
		
		for(int i=0;i<typeOfItems.length;i++) {
			System.out.println(typeOfItems[i]);
		}
		
		for(int i=0;i<facility.length;i++) {
			System.out.println(facility[i]);
		}
		
		System.out.println(this.salaryOfWorkers);
		System.out.println(this.owner);
		System.out.println(this.discountInPercent);
		System.out.println(this.onlinePayment);
		System.out.println(this.onlineShopping);
		System.out.println(this.noOfWorkers);
	}

}
