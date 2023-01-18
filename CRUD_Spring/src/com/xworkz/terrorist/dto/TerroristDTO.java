package com.xworkz.terrorist.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class TerroristDTO extends AbstractAuditDTO {
	@NonNull
	@NotNull(message = "Terrorist name cannot be null")
	@NotBlank
	@Size(min = 3, max = 20, message = "name is invalid")
	private String name;
	@NonNull
	@Min(value = 1, message = "Age should be greater than 1")
	@Max(value = 150, message = "Age should be less than 150")
	private int age;
	@NonNull
	private String country;
	private boolean alive;
	private boolean prison;
	@NonNull
	private String specialization;
	@NonNull
	private String organization;

}
