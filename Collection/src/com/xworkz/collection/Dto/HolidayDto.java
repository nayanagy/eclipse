package com.xworkz.collection.Dto;

import java.io.Serializable;

public class HolidayDto implements Serializable {
	private int noOfHoliday;
	private String reason;
	private String month;

	public HolidayDto() {
		super();
	}

	public HolidayDto(int noOfHoliday, String reason, String month) {
		super();
		this.noOfHoliday = noOfHoliday;
		this.reason = reason;
		this.month = month;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("running equals from HolidayDto");
		if (obj != null) {
			if (obj instanceof HolidayDto) {
				HolidayDto dto = (HolidayDto) obj;// casting
				if (dto.month.equals(this.month)) {
					System.out.println("district is matching : " + dto.month);
					return true;
				}

			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "HolidayDto [noOfHoliday=" + noOfHoliday + ", reason=" + reason + ", month=" + month + "]";
	}

	public int getNoOfHoliday() {
		return noOfHoliday;
	}

	public void setNoOfHoliday(int noOfHoliday) {
		this.noOfHoliday = noOfHoliday;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

}
