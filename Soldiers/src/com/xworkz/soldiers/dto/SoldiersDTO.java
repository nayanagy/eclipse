package com.xworkz.soldiers.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class SoldiersDTO extends AbstractAuditDTO {
	@NotNull
	@NotBlank
	@Size(min = 3, max = 20, message = "Name must be >3 and <20")
	private String name;

	@Min(value = 0, message = "Id must be greater than 0")
	@Max(value = 1000, message = "Id must be lesser than 1000")
	private int id;

	@NotNull
	@NotBlank
	@Size(min = 5, max = 30, message = "rank must be >5 and <30")
	private String rank;

	@NotNull
	@NotBlank
	@Size(min = 5, max = 30, message = "batallion must be >5 and <30")
	private String batallion;

	@NotNull
	@NotBlank
	@Size(min = 5, max = 30, message = "country must be >5 and <30")
	private String country;

}
