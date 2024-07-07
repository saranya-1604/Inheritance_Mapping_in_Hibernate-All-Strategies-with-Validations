package com.Tpc;

import java.util.Date;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.PastOrPresent;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue(value="new")
public class Employee extends Person {
public Employee() {
		super();
	}
@NotEmpty(message="Please enter your designation")
private String designation;
//@NotEmpty(message="Please enter your salary")
@Min(value=100,message="Invalid answer for salary")
private float salary;
public String getDesignation() {
	return designation;
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
public Employee(int id, String name, String address) {
	super(id, name, address);
}
public Employee( String name, String address, String designation, float salary, Date dtofjoining) {
	super( name, address);
	this.designation = designation;
	this.salary = salary;
	this.dtofjoining = dtofjoining;
}
public Employee( String designation, float salary, Date dtofjoining) {
	super();
	this.designation = designation;
	this.salary = salary;
	this.dtofjoining = dtofjoining;
}
//@NotEmpty(message="please enter your Date of joining")
@PastOrPresent(message="Invalid date")
private Date dtofjoining;
 
}
