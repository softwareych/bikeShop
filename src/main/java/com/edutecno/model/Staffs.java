package com.edutecno.model;

import java.util.List;

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
@Table(name="staffs")
public class Staffs {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer staffId;
	
	@NotEmpty
	private String first_name;
	
	private String last_name;
	private String email;
	private String phone;
	private int active;
	
	//Relacion Staff
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "store_id")
	private Stores relacionStaffsStores;


}
