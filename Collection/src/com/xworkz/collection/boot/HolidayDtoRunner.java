package com.xworkz.collection.boot;

import com.xworkz.collection.Dto.HolidayDto;

public class HolidayDtoRunner {

	public static void main(String[] args) {
		HolidayDto holidayDto1 = new HolidayDto(3, "Deepavali", "October");
		HolidayDto holidayDto2 = new HolidayDto(1, "crismistmas", "December");
		HolidayDto holidayDto3 = new HolidayDto(9, "Dasara", "October");
		HolidayDto holidayDto4 = new HolidayDto(1, "Republic day", "January");
		HolidayDto holidayDto5 = new HolidayDto(2, "Shivaratrii", "February");

		boolean equals = holidayDto1.equals(holidayDto3);
		System.out.println(equals);

	}

}
