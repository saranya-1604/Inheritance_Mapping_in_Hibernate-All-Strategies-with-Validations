package com.Tpsc;
import java.util.Date;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.PastOrPresent;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

	@Entity
	@Table(name="Employee2")
	@PrimaryKeyJoinColumn(name="ID")
	public class Employee2  extends Person2 {
		@NotEmpty(message="Please enter your designation")
		private String designation;
//		@NotEmpty(message="Please enter your salary")
		@Min(value=100,message="Invalid answer for salary")
		private float salary;
	public String getDesignation() {
		return designation;
	}
	public Employee2() {
		super();
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public Date getDtofjoining() {
		return dtofjoining;
	}
	public void setDtofjoining(Date dtofjoining) {
		this.dtofjoining = dtofjoining;
	}
//	public Employee2(int id, String name, String address) {
//		super(id, name, address);
//	}
	public Employee2( String name, String address, String designation, float salary, Date dtofjoining) {
		super( name, address);
		this.designation = designation;
		this.salary = salary;
		this.dtofjoining = dtofjoining;
	}
	public Employee2( String designation, float salary, Date dtofjoining) {
		super();
		this.designation = designation;
		this.salary = salary;
		this.dtofjoining = dtofjoining;
	}
//	@NotEmpty(message="please enter your Date of joining")
	@PastOrPresent(message="Invalid date")
	private Date dtofjoining;
	}


