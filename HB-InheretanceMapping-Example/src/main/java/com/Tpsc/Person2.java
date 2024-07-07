package com.Tpsc;
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
	@Table(name="Person2")
	@Inheritance(strategy=InheritanceType.JOINED)
	
	public class Person2  {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@NotNull(message= "Invalid ID.Please enter your ID")
	private int id;
	@Size(max=20,min=3,message="Invalid name.Size should be between 3 and 20")
	@NotEmpty(message="Please enter your name")
	private String name;
	@Size(max=50,min=3,message="Invalid name.Size should be between 3 and 20")
	@NotEmpty(message="Please enter your Address")
	String address;
	public Person2(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	public Person2() {
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
	public Person2(
			@Size(max = 20, min = 3, message = "Invalid name.Size should be between 3 and 20") @NotEmpty(message = "Please enter your name") String name,
			@Size(max = 50, min = 3, message = "Invalid name.Size should be between 3 and 20") @NotEmpty(message = "Please enter your Address") String address) {
		super();
		this.name = name;
		this.address = address;
	}
	public void setAddress(String address) {
		this.address = address;
	}


	
			}



