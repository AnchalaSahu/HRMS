package com.demo.zcienta;

public class HRemployment {
	private String designation;
	private String DateOfJoining;
	private String Experience ;
	private String Reporting;
	private String WorkingHours ;
	private String TeamCapacity;
	private String ShiftTimings;
	private String BreakTime;
	private String ShiftType;
	private String email;
	public HRemployment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public HRemployment(String designation, String dateOfJoining, String experience, String reporting,
			String workingHours, String teamCapacity, String shiftTimings, String breakTime, String shiftType,
			String email) {
		super();
		this.designation = designation;
		DateOfJoining = dateOfJoining;
		Experience = experience;
		Reporting = reporting;
		WorkingHours = workingHours;
		TeamCapacity = teamCapacity;
		ShiftTimings = shiftTimings;
		BreakTime = breakTime;
		ShiftType = shiftType;
		this.email = email;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getDateOfJoining() {
		return DateOfJoining;
	}
	public void setDateOfJoining(String dateOfJoining) {
		DateOfJoining = dateOfJoining;
	}
	public String getExperience() {
		return Experience;
	}
	public void setExperience(String experience) {
		Experience = experience;
	}
	public String getReporting() {
		return Reporting;
	}
	public void setReporting(String reporting) {
		Reporting = reporting;
	}
	public String getWorkingHours() {
		return WorkingHours;
	}
	public void setWorkingHours(String workingHours) {
		WorkingHours = workingHours;
	}
	public String getTeamCapacity() {
		return TeamCapacity;
	}
	public void setTeamCapacity(String teamCapacity) {
		TeamCapacity = teamCapacity;
	}
	public String getShiftTimings() {
		return ShiftTimings;
	}
	public void setShiftTimings(String shiftTimings) {
		ShiftTimings = shiftTimings;
	}
	public String getBreakTime() {
		return BreakTime;
	}
	public void setBreakTime(String breakTime) {
		BreakTime = breakTime;
	}
	public String getShiftType() {
		return ShiftType;
	}
	public void setShiftType(String shiftType) {
		ShiftType = shiftType;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "HRemployment [designation=" + designation + ", DateOfJoining=" + DateOfJoining + ", Experience="
				+ Experience + ", Reporting=" + Reporting + ", WorkingHours=" + WorkingHours + ", TeamCapacity="
				+ TeamCapacity + ", ShiftTimings=" + ShiftTimings + ", BreakTime=" + BreakTime + ", ShiftType="
				+ ShiftType + ", email=" + email + "]";
	}
	
	
	
}
	
		