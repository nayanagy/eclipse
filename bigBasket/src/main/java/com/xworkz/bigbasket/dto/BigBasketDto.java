package com.xworkz.bigbasket.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class BigBasketDto {
	@NotBlank(message = "Name cannot be null")
	@Size(min = 3, max = 20, message = "Name should be more than 3 or less than 20 characters")
	private String name;

	@NotBlank(message = "email cannot be null")
	private String email;
	private String password;
	@NotBlank(message = "area should be selected")
	private String area;
	@NotBlank(message = "item should be selected")
	private String item;

	@NotBlank(message = "quantity cannot be null")
	private int quantity;
	@NotBlank(message = "quantity cannot be null")
	private int noOfItems;
	@NotBlank(message = "price cannot be null")
	private Double price;
	@NotBlank(message = "mbl number cannot be null")
	private long mbl;
	@NotBlank(message = "ratings cannot be null")
	private int ratings;
	private boolean COD;

}
