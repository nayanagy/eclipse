package com.xworkz.database.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "table_1")
public class casinoDto {

	@Column(name = "c_id")
	@Id
	private int id;
	@Column(name = "c_name")
	private String name;
	@Column(name = "c_cruise")
	private String cruise;
	@Column(name = "c_entryFee")
	private double entryFee;
	@Column(name = "c_freeFood")
	private boolean freeFood;
}
