package com.demo.zcienta;

public class Onboarding {
	private String name;
	private String employeeid;
	private String designation;
	private String contact;
	private String email;
	public Onboarding() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Onboarding(String name, String employeeid, String designation, String contact, String email) {
		super();
		this.name = name;
		this.employeeid = employeeid;
		this.designation = designation;
		this.contact = contact;
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(String employeeid) {
		this.employeeid = employeeid;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Onboarding [name=" + name + ", employeeid=" + employeeid + ", designation=" + designation + ", contact="
				+ contact + ", email=" + email + "]";
	}
	

	
	

}
