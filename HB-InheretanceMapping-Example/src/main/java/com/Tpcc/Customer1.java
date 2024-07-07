package com.Tpcc;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

	@Entity
	@Table(name="Customer1")
	@AttributeOverrides({
		@AttributeOverride(name="id",column=@Column(name="id")),
		@AttributeOverride(name="name",column=@Column(name="name"))
	})
	public class Customer1  extends Person1 {
		@Email(message="Inavlid email address.Please enter a proper email id")
		@NotEmpty(message="please enter your email id")
	    private String email;
	 public String getEmail() {
		return email;
	}
	public Customer1() {
		super();
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
	public Customer1(int id, String name, String address) {
		super(id, name, address);
	}
//	@Size(max=9,min=1,message="Invalid mobile number.Size should be between 3 and 20")
	
	private long mobile;
	@NotEmpty(message="Please enter customer type")
	private String customertype;
	public Customer1( String name, String address, String email, long mobile, String customertype) {
		super(name, address);
		this.email = email;
		this.mobile = mobile;
		this.customertype = customertype;
	}
	public Customer1( String email, long mobile, String customertype) {
		super();
		this.email = email;
		this.mobile = mobile;
		this.customertype = customertype;
	}
	}


