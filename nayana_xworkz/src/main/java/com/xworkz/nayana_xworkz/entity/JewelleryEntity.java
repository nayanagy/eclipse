package com.xworkz.nayana_xworkz.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "Jewellery_table")
@NamedQuery(name = "findByName", query = "select ent from JewelleryEntity ent where ent.name=:nam")
@NamedQuery(name="findByNameAndPrice",query = "select entity from JewelleryEntity entity where entity.name=:nam and entity.price=:pri")
@NamedQuery(name = "findAll",query = "select entity from JewelleryEntity entity")
public class JewelleryEntity {
	@Id
	@Column(name = "j_id")
	private int id;
	@Column(name = "j_name")
	private String name;
	@Column(name = "j_price")
	private int price;
	@Column(name = "j_color")
	private String color;
	@Column(name = "j_type")
	private String type;
	@Column(name = "j_weight")
	private int weight;
	
}
