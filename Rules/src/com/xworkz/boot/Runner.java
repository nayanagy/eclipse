package com.xworkz.boot;

import com.xworkz.bridge.CitizenAadharCardRules;
import com.xworkz.bridge.CitizenElectionRules;
import com.xworkz.bridge.CitizenRationCardRules;
import com.xworkz.bridge.CitizenTrafficRules;
import com.xworkz.bridge.GuestPgRules;
import com.xworkz.bridge.PeopleBankRules;
import com.xworkz.bridge.StudentHostelRules;
import com.xworkz.bridge.StudentSchoolRules;
import com.xworkz.bridge.UsersMobileRules;
import com.xworkz.bridge.VisitorsHotelRules;
import com.xworkz.bridge.VisitorsTempleRules;
import com.xworkz.rules.HostelRules;
import com.xworkz.rules.RationCardRules;
import com.xworkz.rules.TempleRules;
import com.xworkz.rules.TrafficRules;

public class Runner {

	public static void main(String[] args) {
		GuestPgRules pgrule = new GuestPgRules();
		pgrule.dinnerTime();
		pgrule.hygine();
		pgrule.inTime();
		pgrule.useMinWater();
		pgrule.washingMachine();

		System.out.println("=================================================");

		HostelRules hostelRules = new StudentHostelRules();
		hostelRules.outingTime();
		hostelRules.outSidefood();
		hostelRules.permissionForLeavs();
		hostelRules.snacksTime();
		hostelRules.studyTime();

		System.out.println("=================================================");

		TempleRules templeRules = new VisitorsTempleRules();
		templeRules.dressCode();
		templeRules.keepSandelsOutside();
		templeRules.photoClicks();
		templeRules.StandInQue();
		templeRules.wasteParsad();

		System.out.println("=================================================");

		RationCardRules rationCardRules = new CitizenRationCardRules();
		rationCardRules.acresOfLand();
		rationCardRules.bplCard();
		rationCardRules.fourWheeler();
		rationCardRules.income();
		rationCardRules.govtJob();

		System.out.println("=================================================");

		CitizenAadharCardRules AadharCardRules = new CitizenAadharCardRules();
		AadharCardRules.fingerprint();
		AadharCardRules.idProof();
		AadharCardRules.mblno();
		AadharCardRules.photo();
		AadharCardRules.validAddress();

		System.out.println("=================================================");

		CitizenElectionRules electionRules = new CitizenElectionRules();
		electionRules.above18();
		electionRules.que();
		electionRules.voterid();
		electionRules.votesPerPerson();
		electionRules.wardNo();

		System.out.println("=================================================");

		TrafficRules TrafficRules = new CitizenTrafficRules();
		TrafficRules.licence();
		TrafficRules.signal();
		TrafficRules.wearHelmet();

		System.out.println("=================================================");

		UsersMobileRules MobileRules = new UsersMobileRules();
		MobileRules.configOfMobile();
		MobileRules.modelOfMobile();
		MobileRules.nameOfMobile();
		MobileRules.Password();
		MobileRules.priceOfMobile();

		System.out.println("=================================================");

		StudentSchoolRules schoolRules = new StudentSchoolRules();
		schoolRules.id();
		schoolRules.locationOfSchool();
		schoolRules.nameOfSchool();
		schoolRules.principleofSchool();
		schoolRules.mobileUsage();

		System.out.println("=================================================");

		PeopleBankRules bankRules = new PeopleBankRules();
		bankRules.aadharLink();
		bankRules.accNumber();
		bankRules.branch();
		bankRules.mblNo();
		bankRules.name();

		System.out.println("=================================================");

		VisitorsHotelRules hotelRules = new VisitorsHotelRules();
		hotelRules.dinnerTime();
		hotelRules.hygine();
		hotelRules.inTime();
		hotelRules.useMinWater();
		hotelRules.washingMachine();

		System.out.println("=================================================");

	}

}
