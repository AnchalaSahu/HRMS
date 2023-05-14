package com.demo.zcienta;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class HRpersonalDAO {
	public boolean update(HRpersonal per)
	{
		
		
		Connection con = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/zcientia","root","rootpassword");		
			PreparedStatement stmt = null;
		    
		        stmt = con.prepareStatement("UPDATE hrpersonal SET name=?, designation=?, employeeid=?, email1=?, primarycontact=?, extension1=?, location=?, phone2=?, email2=?, primarycontact2=?, extension2=?, bloodgroup=?, DOB=?, placebirth=?, maritialstatus=?, residentialstatus=?, mothertongue=?, aadharnumber=?, drivinglicense=?, physicallychallenged=?, email=?, date=NOW() WHERE email=?");

		        stmt.setString(1, per.getName());
		        
		        stmt.setString(2, per.getDesignation());
		        stmt.setString(3, per.getEmployeeid());
		        stmt.setString(4, per.getEmail1());
		        stmt.setString(5, per.getPrimarycontac1());
		        stmt.setString(6, per.getExtension1());
		        stmt.setString(7, per.getLocation());
		        stmt.setString(8, per.getPhone2());
		        stmt.setString(9, per.getEmail2());
		        stmt.setString(10, per.getPrimarycontact2());
		        stmt.setString(11, per.getExtension2());
		        stmt.setString(12, per.getBloodgroup());
		        stmt.setString(13, per.getDatebirth());
		        stmt.setString(14, per.getPlacebirth());
		        stmt.setString(15, per.getMaritialstatus());
		        stmt.setString(16, per.getResidentialstatus());
		        stmt.setString(17, per.getMothertongue());
		        stmt.setString(18, per.getAadharnumber());
		        stmt.setString(19, per.getDrivinglicense());
		        stmt.setString(20, per.getPhysicallychallenged());
		        stmt.setString(21, per.getEmail());
		        stmt.setString(22, per.getEmail());
		        
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
	

public HRpersonal getEmployee(String email) {
	
	System.out.println("Email: " + email);
	Connection con = null;
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/zcientia","root","rootpassword");
		
		PreparedStatement stmt = null;
	    
	    stmt = con.prepareStatement("select * from hrpersonal where email = ? ");

	    stmt.setString(1, email);
	        
	    ResultSet rs = stmt.executeQuery();
	    
	    HRpersonal hr = new HRpersonal();
	    
	    System.out.println("\n\n\nSELECT: " + stmt.toString()+"\n\n\n");
	    
	    
	    while(rs.next()) {
	    	hr.setName(rs.getString("name"));
	    	hr.setDesignation(rs.getString("designation"));
	    	hr.setEmployeeid(rs.getString("employeeid"));
	    	hr.setEmail1(rs.getString("email1"));
	    	hr.setPrimarycontac1(rs.getString("primarycontact"));
	    	hr.setExtension1(rs.getString("extension1"));
	    	hr.setLocation(rs.getString("location"));
	    	hr.setPhone2(rs.getString("phone2"));
	    	hr.setEmail2(rs.getString("email2"));
	    	hr.setPrimarycontact2(rs.getString("primarycontact2"));
	    	hr.setExtension2(rs.getString("extension2"));
	    	hr.setBloodgroup(rs.getString("bloodgroup"));
	    	hr.setDatebirth(rs.getString("DOB"));
	    	hr.setPlacebirth(rs.getString("placebirth"));
	    	hr.setMaritialstatus(rs.getString("maritialstatus"));
	    	hr.setResidentialstatus(rs.getString("residentialstatus"));
	    	hr.setMothertongue(rs.getString("mothertongue"));
	    	hr.setAadharnumber(rs.getString("aadharnumber"));
	    	hr.setDrivinglicense(rs.getString("drivinglicense"));
	    	hr.setPhysicallychallenged(rs.getString("physicallychallenged"));
	    	hr.setEmail(rs.getString("email"));
	    	
	    	
	    }
		
	    return hr;
		
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

