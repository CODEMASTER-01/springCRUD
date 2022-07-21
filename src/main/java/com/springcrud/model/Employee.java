package com.springcrud.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee_Records")
public class Employee {
	@Id											//makes id the primary key.
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Employee_Id")	
	private int eId;
	@Column(name="First_Name")
	private String fName;
	@Column(name="Last_Name")
	private String lName;
	@Column(name="Company")
	private String compName;
	@Column(name="Address")
	private String address;
	@Column(name="Email")
	private String email;
	@Column(name="Phone")
	private Long phone;
	@Column(name="Additional_Info")
	private String additionalDetails;
	
	
	
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getCompName() {
		return compName;
	}
	public void setCompName(String compName) {
		this.compName = compName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getPhone() {
		return phone;
	}
	public void setPhone(Long phone) {
		this.phone = phone;
	}
	public String getAdditionalDetails() {
		return additionalDetails;
	}
	public void setAdditionalDetails(String additionalDetails) {
		this.additionalDetails = additionalDetails;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", fName=" + fName + ", lName=" + lName + ", compName=" + compName
				+ ", address=" + address + ", email=" + email + ", phone=" + phone + ", additionalDetails="
				+ additionalDetails + "]";
	}
	
	
	
	
	
	
	

}
