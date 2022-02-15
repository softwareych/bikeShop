package com.edutecno.model;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="orders")
public class Orders {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer orderId;
	
	private int orderStatus;
	
	@Column(name = "order_date")
	private Date orderDate;
	
	private Date requiredDate;
	
	private Date shippedDate;
	
	private int staffId;

	
	//Relacion 
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "store_id")
	private Stores relacionOrdersStores;
	
	//Relacion 
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "customer_id")
	private Customers relacionOrdersCustomers;

	
	// Relacion con  1:N
	@OneToMany(mappedBy = "relacionOrdersItems", fetch = FetchType.LAZY)
	private List<OrderItems> listaItems;	

}
