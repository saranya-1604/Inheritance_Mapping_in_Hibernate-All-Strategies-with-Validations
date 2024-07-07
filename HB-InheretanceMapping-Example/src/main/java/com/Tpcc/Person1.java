package com.Tpcc;
	import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import jakarta.persistence.Entity;
	import jakarta.persistence.GeneratedValue;
	import jakarta.persistence.GenerationType;
	import jakarta.persistence.Id;
	import jakarta.persistence.Inheritance;
	import jakarta.persistence.InheritanceType;
	import jakarta.persistence.Table;

	@Entity
	@Table(name="Person1")
	@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
	public class Person1 {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@NotNull(message= "Invalid ID.Please enter your ID")
	private int id;
	@Size(max=20,min=3,message="Invalid name.Size should be between 3 and 20")
	@NotEmpty(message="Please enter your name")
	private String name;
	@Size(max=50,min=3,message="Invalid name.Size should be between 3 and 20")
	@NotEmpty(message="Please enter your Address")
	String address;
	public Person1(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	public Person1() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public Person1(
			 String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}
	public void setAddress(String address) {
		this.address = address;
	}


	public Person1(String address) {
		super();
		this.address = address;
	}
			}



