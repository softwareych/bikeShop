package com.edutecno.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="stores")
public class Stores {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer storeId;
	
	@NotEmpty
	private String storeName;
	
	private String phone;
	
	private String email;
	
	private String street;
	
	private String city;
	
	private String state;
	
	private String zipCode;
	
	// Relacion con  1:N
	@OneToMany(mappedBy = "relacionOrdersStores", fetch = FetchType.LAZY)
	private List<Orders> listaOrdenes;	
	
	// Relacion con  1:N
	@OneToMany(mappedBy = "relacionStaffsStores", fetch = FetchType.LAZY)
	private List<Staffs> listaStaffs;	
		
	
}
