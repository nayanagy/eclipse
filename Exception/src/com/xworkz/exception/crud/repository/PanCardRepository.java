package com.xworkz.exception.crud.repository;

public interface PanCardRepository {
	boolean linking(String card);

	default int total() {
		System.out.println("running total");
		return 10;

	}

}
