package com.xworkz.collection.boot;

import com.xworkz.collection.Dto.GameDto;

public class GameDtoRunner {

	public static void main(String[] args) {
		GameDto gameDto1 = new GameDto("Kabadi", "Indoor", 7);
		GameDto gameDto2 = new GameDto("Chowkabara", "Indoor", 4);
		GameDto gameDto3 = new GameDto("Kabadi", "Outdoor", 7);

		boolean equals = gameDto1.equals(gameDto3);
		System.out.println(equals);

	}

}
