package com.xworkz.exception.crud.runner;

import com.xworkz.exception.crud.repository.PanCardRepository;
import com.xworkz.exception.crud.repository.PanCardRepositoryImpli;

public class PanRunner {

	public static void main(String[] args) {
		PanCardRepository cardRepository = new PanCardRepositoryImpli();
		cardRepository.linking("PA1807H");
		cardRepository.linking("PA2507H");
		cardRepository.linking("PA0567H");
		cardRepository.linking("PA1817H");
		cardRepository.linking("PA1387H");
		cardRepository.linking("PA6527H");
		cardRepository.linking("PA4257H");
		cardRepository.linking("PA1357H");
		cardRepository.linking("PA2657H");
		cardRepository.linking("PA6457H");

		System.out.println(cardRepository.total());

	}

}
