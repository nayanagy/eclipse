package com.xworkz.collection.boot;

import com.xworkz.collection.Dto.CalendarDto;

public class CalendarDtoRunner {

	public static void main(String[] args) {
		CalendarDto calendarDto1 = new CalendarDto("Vikram Samvat", 12, "white");
		CalendarDto calendarDto2 = new CalendarDto("Saka Samvat", 6, "blue");
		CalendarDto calendarDto3 = new CalendarDto("SBI Calendar", 12, "Blue");
		CalendarDto calendarDto4 = new CalendarDto("shabadimath", 12, "white");
		CalendarDto calendarDto5 = new CalendarDto("shabadimath", 6, "white");

		boolean equals = calendarDto4.equals(calendarDto5);
		System.out.println(equals);

	}

}
