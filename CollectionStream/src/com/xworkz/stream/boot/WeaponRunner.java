package com.xworkz.stream.boot;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import com.xworkz.stream.constant.WeaponType;
import com.xworkz.stream.Dto.WeaponDTO;

public class WeaponRunner {

	public static void main(String[] args) {
		Collection<WeaponDTO> dto = new ArrayList<WeaponDTO>();
		dto.add(new WeaponDTO("AntiAircraft gun", "SAHANA", LocalDate.of(2022, 12, 15), 12764D, WeaponType.ARTILLERY));
		dto.add(new WeaponDTO("Paris Gun", "LAVANYA", LocalDate.of(2021, 11, 04), 45897D, WeaponType.ARTILLERY));
		dto.add(new WeaponDTO("Ricin", "chemi", LocalDate.of(2000, 1, 18), 78958D, WeaponType.BIOLOGICAL_WEAPONRY));
		dto.add(new WeaponDTO("Small pox", "medi", LocalDate.of(1980, 4, 19), 187958D, WeaponType.BIOLOGICAL_WEAPONRY));
		dto.add(new WeaponDTO("Bola", "ranged", LocalDate.of(1990, 12, 28), 985D, WeaponType.COMBAT_WEAPONS));
		dto.add(new WeaponDTO("Club", "handie", LocalDate.of(2022, 11, 21), 12764D, WeaponType.COMBAT_WEAPONS));
		dto.add(new WeaponDTO("Daggar", "SMRUTHI", LocalDate.of(1968, 1, 14), 12764D, WeaponType.COMBAT_WEAPONS));
		dto.add(new WeaponDTO("Sword", "Raj", LocalDate.of(1258, 4, 15), 12764D, WeaponType.COMBAT_WEAPONS));
		dto.add(new WeaponDTO("Mortar", "Raam", LocalDate.of(2018, 11, 9), 12764D, WeaponType.ARTILLERY));
		dto.add(new WeaponDTO("Yellow rain", "shaaam", LocalDate.of(2022, 12, 8), 12764D,
				WeaponType.BIOLOGICAL_WEAPONRY));
		dto.add(new WeaponDTO("Antiballistic mill", "Kavya", LocalDate.of(2000, 01, 2), 123D, WeaponType.MISSILES));
		dto.add(new WeaponDTO("ICBM", "SHASHI", LocalDate.of(2001, 01, 3), 987D, WeaponType.MISSILES));
		dto.add(new WeaponDTO("LANCE MISSILE", "PALLAVI", LocalDate.of(2002, 01, 4), 876D, WeaponType.MISSILES));
		dto.add(new WeaponDTO("V-2 MISSILE", "DEEKSHA", LocalDate.of(2003, 01, 5), 6786D, WeaponType.MISSILES));
		dto.add(new WeaponDTO("NIKE MISSILE", "MANASA", LocalDate.of(2004, 01, 6), 7987D, WeaponType.MISSILES));
		dto.add(new WeaponDTO("DEPTH CHARGE", "NISHITHA", LocalDate.of(2005, 01, 7), 576D, WeaponType.BOMBS));
		dto.add(new WeaponDTO("GRENADE", "THANU", LocalDate.of(2006, 01, 8), 1239D, WeaponType.BOMBS));
		dto.add(new WeaponDTO("MINE", "NAYANA", LocalDate.of(2007, 01, 9), 1230D, WeaponType.BOMBS));
		dto.add(new WeaponDTO("PETN", "KRUTIKA", LocalDate.of(2008, 01, 10), 1231D, WeaponType.BOMBS));
		dto.add(new WeaponDTO("Rdx", "RAMYA", LocalDate.of(2009, 01, 11), 12312D, WeaponType.BOMBS));
		
		System.out.println("===================================");

		System.out.println("Price > 6000 and their names");
		dto.stream().filter((ele) -> ele.getPrice() > 6000).collect(Collectors.toList())
				.forEach(e -> System.out.println(e.getName()));

		System.out.println("===================================");
		System.out.println("Print all made by and made on");
		dto.stream()
				.forEach(e -> System.out.println("Weapon made by " + e.getMadeBy() + " and made on " + e.getMadeOn()));

		System.out.println("===================================");
		System.out.println("Print all weapon by desc order");
		dto.stream().sorted((e1, e2) -> e2.getName().compareTo(e1.getName()))
				.forEach(e -> System.out.println(e.getName()));

		System.out.println("===================================");

		System.out.println("Print all weapon made_By by asce order");
		dto.stream().sorted((e1, e2) -> e1.getMadeBy().compareTo(e2.getMadeBy()))
				.forEach(e -> System.out.println(e.getMadeBy()));

		System.out.println("===================================");

		System.out.println("Print all weapon made_On by asce order");
		dto.stream().sorted((e1, e2) -> e1.getMadeOn().compareTo(e2.getMadeOn()))
				.forEach(e -> System.out.println(e.getMadeOn()));

		System.out.println("===================================");

		System.out.println("Print all weapon price by asce order");
		dto.stream().sorted((e1, e2) -> e1.getPrice().compareTo(e2.getPrice()))
				.forEach(e -> System.out.println(e.getPrice()));

		System.out.println("===================================");

		System.out.println("Print all weapon price by desc order");
		dto.stream().sorted((e1, e2) -> e2.getPrice().compareTo(e1.getPrice()))
				.forEach(e -> System.out.println(e.getPrice()));

		System.out.println("===================================");

		System.out.println("Print all weapon name and madeOn by asc order");
		dto.stream().sorted((e1, e2) -> e1.getName().compareTo(e2.getName()))
				.sorted((e1, e2) -> e1.getMadeOn().compareTo(e2.getMadeOn())).forEach(
						e -> System.out.println("Sorted name: " + e.getName() + " and sorted madeOn:" + e.getMadeOn()));

		System.out.println("===================================");

		System.out.println("Print all weapon type, madeBy, name in dese order");
		dto.stream().sorted((e1, e2) -> e1.getWeaponType().compareTo(e1.getWeaponType()))
				.sorted((e1, e2) -> e2.getMadeBy().compareTo(e1.getMadeBy()))
				.sorted((e1, e2) -> e2.getName().compareTo(e1.getName()))
				.forEach(e -> System.out.println("Sorted Type: " + e.getWeaponType() + " and sorted madeBy:"
						+ e.getMadeBy() + "and Name is: " + e.getName()));

	}

}