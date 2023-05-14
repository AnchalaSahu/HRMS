package com.demo.zcienta;

public class HRfamily {
	
	private String fathername;
	private String fatherdob;
	private String fathercontactnumber;
	private String mothername;
	private String motherdob;
	private String mothercontactnumber;
	private String name;
	private String dob;
	private String contactnumber;
	private String occupation;
	private String placebirth;
	private String email;
	private String email1;
	public HRfamily() {
		super();
		// TODO Auto-generated constructor stub
	}
	public HRfamily(String fathername, String fatherdob, String fathercontactnumber, String mothername, String motherdob,
			String mothercontactnumber, String name, String dob, String contactnumber, String occupation,
			String placebirth, String email,String email1) {
		super();
		this.fathername = fathername;
		this.fatherdob = fatherdob;
		this.fathercontactnumber = fathercontactnumber;
		this.mothername = mothername;
		this.motherdob = motherdob;
		this.mothercontactnumber = mothercontactnumber;
		this.name = name;
		this.dob = dob;
		this.contactnumber = contactnumber;
		this.occupation = occupation;
		this.placebirth = placebirth;
		this.email = email;
		this.email1=email1;
	}
	public String getFathername() {
		return fathername;
	}
	public void setFathername(String fathername) {
		this.fathername = fathername;
	}
	public String getFatherdob() {
		return fatherdob;
	}
	public void setFatherdob(String fatherdob) {
		this.fatherdob = fatherdob;
	}
	public String getFathercontactnumber() {
		return fathercontactnumber;
	}
	public void setFathercontactnumber(String fathercontactnumber) {
		this.fathercontactnumber = fathercontactnumber;
	}
	public String getMothername() {
		return mothername;
	}
	public void setMothername(String mothername) {
		this.mothername = mothername;
	}
	public String getMotherdob() {
		return motherdob;
	}
	public void setMotherdob(String motherdob) {
		this.motherdob = motherdob;
	}
	public String getMothercontactnumber() {
		return mothercontactnumber;
	}
	public void setMothercontactnumber(String mothercontactnumber) {
		this.mothercontactnumber = mothercontactnumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getContactnumber() {
		return contactnumber;
	}
	public void setContactnumber(String contactnumber) {
		this.contactnumber = contactnumber;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	public String getPlacrbirth() {
		return placebirth;
	}
	public void setPlacrbirth(String placrbirth) {
		this.placebirth = placrbirth;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public String getEmail1() {
		return email1;
	}
	public void setEmail1(String email1) {
		this.email1 = email1;
	}
	@Override
	public String toString() {
		return "Family [fathername=" + fathername + ", fatherdob=" + fatherdob + ", fathercontactnumber="
				+ fathercontactnumber + ", mothername=" + mothername + ", motherdob=" + motherdob
				+ ", mothercontactnumber=" + mothercontactnumber + ", name=" + name + ", dob=" + dob
				+ ", contactnumber=" + contactnumber + ", occupation=" + occupation + ", placebirth=" + placebirth
				+ ", email=" + email + ", email1=" + email1 + "]";
	}
	
	
	
	
	
	
	

}
