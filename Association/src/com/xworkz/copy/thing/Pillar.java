package com.xworkz.copy.thing;

import com.xworkz.copy.constraints.Shape;

public class Pillar {

		public int id;
		public String place;
		public Shape shape;
		public double height;
		public String support;
		public Company company=new Company("JSW", "Steel");
		
		public Pillar(int id, String place, Shape shape, double height, String support) {
			this.id = id;
			this.place = place;
			this.shape = shape;
			this.height = height;
			this.support = support;
		}
			
		public void showoff()
		{
			System.out.println("piller Start aythu");	
			System.out.println(this.id);
			System.out.println(this.place);
			System.out.println(this.shape);
			System.out.println(this.height);
			System.out.println(this.support);
			this.company.showOff();
			
		}		
		
	}

