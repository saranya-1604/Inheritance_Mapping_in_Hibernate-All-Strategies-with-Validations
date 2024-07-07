package com.Tpc;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue(value="old")
public class Customer extends Person {
	@Email(message="Inavlid email address.Please enter a proper email id")
	@NotEmpty(message="please enter your email id")
    private String email;
 public Customer() {
		super();
	}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public long getMobile() {
	return mobile;
}
public void setMobile(long mobile) {
	this.mobile = mobile;
}
public String getCustomertype() {
	return customertype;
}
public void setCustomertype(String customertype) {
	this.customertype = customertype;
}
public Customer(int id, String name, String address) {
	super(id, name, address);
}
//@Size(max=9,min=1,message="Invalid mobile number.Size should be between 3 and 20")

private long mobile;
@NotEmpty(message="Please enter customer type")
private String customertype;
public Customer( String name, String address, String email, long mobile, String customertype) {
	super(name, address);
	this.email = email;
	this.mobile = mobile;
	this.customertype = customertype;
}
public Customer( String email, long mobile, String customertype) {
	super();
	this.email = email;
	this.mobile = mobile;
	this.customertype = customertype;
}
}
