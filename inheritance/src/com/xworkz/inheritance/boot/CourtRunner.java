package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.childClass.DistrictCourt;
import com.xworkz.inheritance.childClass.HighCourt;
import com.xworkz.inheritance.childClass.SupremeCourt;
import com.xworkz.inheritance.things.Court;

public class CourtRunner {
	public static void main(String[] args) {
		HighCourt highCourt = new HighCourt();
		System.out.println(highCourt.Location);
		System.out.println(highCourt.noOfJudge);
		System.out.println(highCourt.judgeName);
		System.out.println(highCourt.noOfCases);

		Court ref = new HighCourt();
		System.out.println(ref.Location);
		System.out.println(ref.noOfJudge);
		HighCourt court = (HighCourt) ref;// casting
		System.out.println(court.judgeName);
		System.out.println(court.noOfCases);
		System.out.println(court.Location);
		System.out.println(court.noOfJudge);

		SupremeCourt supremeCourt = new SupremeCourt();
		System.out.println(supremeCourt.Location);
		System.out.println(supremeCourt.noOfJudge);
		System.out.println(supremeCourt.judgeName);
		System.out.println(supremeCourt.noOfLawyers);

		Court ref1 = new SupremeCourt();
		System.out.println(ref1.Location);
		System.out.println(ref1.noOfJudge);
		SupremeCourt court1 = (SupremeCourt) ref1;// casting
		System.out.println(court1.judgeName);
		System.out.println(court1.noOfLawyers);
		System.out.println(court1.Location);
		System.out.println(court1.noOfJudge);

		DistrictCourt districtCourt = new DistrictCourt();
		System.out.println(districtCourt.Location);
		System.out.println(districtCourt.noOfJudge);
		System.out.println(districtCourt.judgeName);
		System.out.println(districtCourt.noOfLawyers);

		Court ref2 = new DistrictCourt();
		System.out.println(ref2.Location);
		System.out.println(ref2.noOfJudge);
		DistrictCourt court2 = (DistrictCourt) ref1;// casting
		System.out.println(court2.judgeName);
		System.out.println(court2.noOfLawyers);
		System.out.println(court2.Location);
		System.out.println(court2.noOfJudge);

	}

}
