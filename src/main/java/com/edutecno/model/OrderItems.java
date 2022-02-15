package com.edutecno.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="order_items")
public class OrderItems {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer itemId;
	
	@NotEmpty
	private int productId;
	
	private int quantity;
	private double listPrice;
	private double discount;
	
	//Relacion 
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "order_id")
	private Stores relacionOrdersItems;
}
