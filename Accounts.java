package com.demo.zcienta;

public class Accounts {
	private String bankname;
	private String accountnumber;
	private String bankbranch;
	private String pfnumber;
	private String eligibility;
	private String uan;
	private String kycdocument;
	private String kycstatus;
	private String email;
	public Accounts() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Accounts(String bankname, String accountnumber, String bankbranch, String pfnumber, String eligibility,
			String uan, String kycdocument, String kycstatus,String email) {
		super();
		this.bankname = bankname;
		this.accountnumber = accountnumber;
		this.bankbranch = bankbranch;
		this.pfnumber = pfnumber;
		this.eligibility = eligibility;
		this.uan = uan;
		this.kycdocument = kycdocument;
		this.kycstatus = kycstatus;
		this.email=email;
	}
	public String getBankname() {
		return bankname;
	}
	public void setBankname(String bankname) {
		this.bankname = bankname;
	}
	public String getAccountnumber() {
		return accountnumber;
	}
	public void setAccountnumber(String accountnumber) {
		this.accountnumber = accountnumber;
	}
	public String getBankbranch() {
		return bankbranch;
	}
	public void setBankbranch(String bankbranch) {
		this.bankbranch = bankbranch;
	}
	public String getPfnumber() {
		return pfnumber;
	}
	public void setPfnumber(String pfnumber) {
		this.pfnumber = pfnumber;
	}
	public String getEligibility() {
		return eligibility;
	}
	public void setEligibility(String eligibility) {
		this.eligibility = eligibility;
	}
	public String getUan() {
		return uan;
	}
	public void setUan(String uan) {
		this.uan = uan;
	}
	public String getKycdocument() {
		return kycdocument;
	}
	public void setKycdocument(String kycdocument) {
		this.kycdocument = kycdocument;
	}
	public String getKycstatus() {
		return kycstatus;
	}
	public void setKycstatus(String kycstatus) {
		this.kycstatus = kycstatus;
	}
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Accounts [bankname=" + bankname + ", accountnumber=" + accountnumber + ", bankbranch=" + bankbranch
				+ ", pfnumber=" + pfnumber + ", eligibility=" + eligibility + ", uan=" + uan + ", kycdocument="
				+ kycdocument + ", kycstatus=" + kycstatus + ", email=" + email + "]";
	}
	
	
	

}
