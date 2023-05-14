package com.demo.zcienta;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class HRemploymentDAO {
	
	public boolean update(HRemployment employee)
	{
		
		Connection con = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/zcientia","root","rootpassword");
			

			
			PreparedStatement stmt = null;
	           
	           String updateStatement = "UPDATE hremployment SET designation=?,DateOfJoining=?, Experience=?, ReportingTo=?, WorkingHours=?, TeamCapacity=?, ShiftTimings=?, BreakTime=?,ShiftType=?,email=?,currentdate=NOW() WHERE email=?";
			    
		        stmt = con.prepareStatement(updateStatement); 
				
		        stmt.setString(1, employee.getDesignation());
		        stmt.setString(2, employee.getDateOfJoining());
		        stmt.setString(3, employee.getExperience());
		        stmt.setString(4, employee.getReporting());
		        stmt.setString(5, employee.getWorkingHours());
		        stmt.setString(6, employee.getTeamCapacity());
		        stmt.setString(7, employee.getShiftTimings());
		        stmt.setString(8, employee.getBreakTime());
		        stmt.setString(9, employee.getShiftType());
		        stmt.setString(10, employee.getEmail());
		        stmt.setString(11, employee.getEmail());
		        
		        
		        System.out.println("Statement: " + stmt.toString());
		        
		        int row = stmt.executeUpdate();
		        
			
			if(row>0)
			{
				return true;
				}
			else
			{
				return false;
				
			}
			}
		catch(Exception ex)
		{
			System.out.println(ex);
			
		}
		finally {
			try {
				if(con != null)
					con.close();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		return false;
		
	}

	public HRemployment getEmployee(String email) {
		
		System.out.println("Email: " + email);
		Connection con = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/zcientia","root","rootpassword");
			
			PreparedStatement stmt = null;
		    
		    stmt = con.prepareStatement("select * from hremployment where email = ? ");

		    stmt.setString(1, email);
		        
		    ResultSet rs = stmt.executeQuery();
		    
		    HRemployment e = new HRemployment();
		    
		    System.out.println("\n\n\nSELECT: " + stmt.toString()+"\n\n\n");
		    
		    
		    while(rs.next()) {
		    	
		    	e.setDesignation(rs.getString("designation"));
		    	e.setDateOfJoining(rs.getString("DateOfJoining"));
		    	e.setExperience(rs.getString("Experience"));
		    	e.setReporting(rs.getString("ReportingTo"));
		    	e.setWorkingHours(rs.getString("WorkingHours"));
		    	e.setTeamCapacity(rs.getString("TeamCapacity"));
		    	e.setShiftTimings(rs.getString("ShiftTimings"));
		    	e.setBreakTime(rs.getString("BreakTime"));
		    	e.setShiftType(rs.getString("ShiftType"));
		    	e.setEmail(rs.getString("email"));
		    	
		    	
		    }
			
		    return e;
			
			}
		catch(Exception ex)
		{
			System.out.println(ex);
			
		}
		finally {
			try {
				if(con != null)
					con.close();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}

		return null;
	}
	}
