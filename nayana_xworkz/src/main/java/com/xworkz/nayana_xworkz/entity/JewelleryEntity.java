package com.xworkz.nayana_xworkz.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "Jewellery_table")
public class JewelleryEntity {
	@Id
	@Column(name = "j_id")
	private int id;
	@Column(name = "j_name")
	private String name;
	@Column(name = "j_price")
	private Double price;
	@Column(name = "j_color")
	private String color;
	@Column(name = "j_type")
	private String type;
	@Column(name = "j_weight")
	private Integer weight;
}
