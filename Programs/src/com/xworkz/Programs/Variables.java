package com.xworkz.Programs;

public class Variables {
	//public static void main(String[] args) {

		public String instance;
		public static int st;

		public Variables() {
			this.instance = instance;

		}

		public void local(int num) {
			int var = 10;
			System.out.println(var);

			// public void b() {} 			---->nested method not possible

		}

		public void display() {
			System.out.println(instance);
			System.out.println(st);

		}

		public class DataType {    			

			public int a = 20;

			public DataType() {
				this.a = a;
				System.out.println(a);
			}

			public void dispalyData() {
				System.out.println(a);
			}

		}

		public static void main(String[] args) {

			Variables var = new Variables();
			var.display();
			var.local(10);
			DataType dt = new DataType();

		}

	}



