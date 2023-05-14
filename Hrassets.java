package com.demo.zcienta;

public class Hrassets {
	
	private String desktop;
	private String access;
	private String accessory;
	private String email;
	public Hrassets() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Hrassets(String desktop, String access, String accessory, String email) {
		super();
		this.desktop = desktop;
		this.access = access;
		this.accessory = accessory;
		this.email = email;
	}
	public String getDesktop() {
		return desktop;
	}
	public void setDesktop(String desktop) {
		this.desktop = desktop;
	}
	public String getAccess() {
		return access;
	}
	public void setAccess(String access) {
		this.access = access;
	}
	public String getAccessory() {
		return accessory;
	}
	public void setAccessory(String accessory) {
		this.accessory = accessory;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Hrassets [desktop=" + desktop + ", access=" + access + ", accessory=" + accessory + ", email=" + email
				+ "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
