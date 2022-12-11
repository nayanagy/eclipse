package com.xworkz.exception.crud.repository;

public interface SweetNameRepository {
	boolean prepare(String names);

	default int totalSweets() {
		System.out.println("running total sweets");
		return 10;

	}

}
