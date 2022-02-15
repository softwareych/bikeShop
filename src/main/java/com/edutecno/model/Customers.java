package com.edutecno.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="customers")
public class Customers {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer customerId;
		
	@NotEmpty //maneja el notnull y vacia de una vez
	private String firstName;
	
	@NotEmpty
	private String lastName;
	
	private String phone;
	
	@NotEmpty
	@Email
	private String email;
	
	private String street;
	
	private String city;
	
	private String state;
	
	private String zipCode;

	// Relacion con Show 1:N
	@OneToMany(mappedBy = "relacionOrdersCustomers", fetch = FetchType.LAZY)//porque lazy o eager?
	private List<Orders> listaCustOrdenes;	
	
}
