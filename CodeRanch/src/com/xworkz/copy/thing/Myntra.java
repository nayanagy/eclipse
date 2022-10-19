package com.xworkz.copy.thing;

public class Myntra {
	
		public String product;
		public int productNo;
		public int batchNo;
		public String productType;
		public double price;
		public String[] customers;
		public String[] address;
		public String[] payment;
		public String[] colours;
		public String[] brand;
		public int[] quantity;

		public Myntra(String product, int productNo, int batchNo, String productType, double price, String[] customers,String[] address,
				String[] payment, String[] colours, String[] brand, int[] quantity) {
			this.product = product;
			this.productNo = productNo;
			this.batchNo = batchNo;
			this.productType = productType;
			this.price = price;
			this.customers = customers;
			this.address = address;
			this.payment = payment;
			this.colours = colours;
			this.brand = brand;
			this.quantity = quantity;

		}

		public void display() {
			System.out.println(this.product );
			System.out.println(this.productNo);
			System.out.println(this.batchNo );
			System.out.println(this.productType);
			System.out.println(this.price );
			for (int i = 0; i < customers.length; i++) {
				System.out.println(customers[i]);
			}
			for (int i = 0; i < address.length; i++) {
				
				System.out.println(address[i]);	
			}
			for (int i = 0; i < payment.length; i++) {
				System.out.println(payment[i]);
				
			}
			for (int i = 0; i < colours.length; i++) {
				System.out.println(customers[i]);
				
			}
			for (int i = 0; i < brand.length; i++) {
				System.out.println(colours[i]);
			}
			for (int i = 0; i < quantity.length; i++) {
				System.out.println(quantity[i]);
				
			}
			

		}

	}


