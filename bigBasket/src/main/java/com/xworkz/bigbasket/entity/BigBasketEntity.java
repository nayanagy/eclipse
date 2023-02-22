package com.xworkz.bigbasket.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "BigBasket_table")
public class BigBasketEntity {

	@Id
	@Column(name = "b_id")
	private int id;
	@Column(name = "b_name")
	private String name;
	@Column(name = "b_email")
	private String email;
	@Column(name = "b_password")
	private String password;
	@Column(name = "b_area")
	private String area;
	@Column(name = "b_item")
	private String item;
	@Column(name = "b_quantity")
	private int quantity;
	@Column(name = "b_noOfItems")
	private int noOfItems;
	@Column(name = "b_price")
	private Double price;
	@Column(name = "b_mbl")
	private long mbl;
	@Column(name = "b_ratings")
	private int ratings;
	@Column(name = "b_COD")
	private boolean COD;
}
