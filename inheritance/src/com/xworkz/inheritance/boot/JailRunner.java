package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.childClass.CentralJail;
import com.xworkz.inheritance.childClass.DistrictJail;
import com.xworkz.inheritance.childClass.SubJail;
import com.xworkz.inheritance.things.Jail;

public class JailRunner {
	public static void main(String[] args) {
		CentralJail centralJail = new CentralJail();
		System.out.println(centralJail.jailerName);
		System.out.println(centralJail.prisoner);
		System.out.println(centralJail.Location);
		System.out.println(centralJail.noOfCells);

		Jail ref = new CentralJail();
		System.out.println(ref.Location);
		System.out.println(ref.noOfCells);
		CentralJail jail = (CentralJail) ref;// casting
		System.out.println(jail.jailerName);
		System.out.println(jail.prisoner);
		System.out.println(jail.Location);
		System.out.println(jail.noOfCells);

		DistrictJail districtJail = new DistrictJail();
		System.out.println(districtJail.jailerName);
		System.out.println(districtJail.prisoner);
		System.out.println(districtJail.Location);
		System.out.println(districtJail.noOfCells);

		Jail ref1 = new DistrictJail();
		System.out.println(ref1.Location);
		System.out.println(ref1.noOfCells);
		DistrictJail jail1 = (DistrictJail) ref1;// casting
		System.out.println(jail1.jailerName);
		System.out.println(jail1.prisoner);
		System.out.println(jail1.Location);
		System.out.println(jail1.noOfCells);

		SubJail subJail = new SubJail();
		System.out.println(subJail.jailerName);
		System.out.println(subJail.prisoner);
		System.out.println(subJail.Location);
		System.out.println(subJail.noOfCells);

		Jail ref2 = new SubJail();
		System.out.println(ref2.Location);
		System.out.println(ref2.noOfCells);
		SubJail jail2 = (SubJail) ref2;// casting
		System.out.println(jail2.jailerName);
		System.out.println(jail2.prisoner);
		System.out.println(jail2.Location);
		System.out.println(jail2.noOfCells);
	}

}
