package com.demo.zcienta;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PersonalDAO {
	public  List<Personal> getEmployees(String search) {
		
		System.out.println("Search String: " + search);
		
		if(search != null) {
		Connection con = null;
		  List<Personal> personals = new ArrayList<>();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/zcientia","root","rootpassword");
			
			//PreparedStatement stmt = null;
			
			Statement stmt = null;
			
			String sql=	"select * from employees where uname like('" + search + "%');";
			//String sql=	"select * from employees where uname like(?%);";
			
			System.out.println("Search Query: " + sql);
		    
		    //stmt = con.prepareStatement(sql);

			stmt = con.createStatement();
			
		    //stmt.setString(1, search);
		        
		    ResultSet rs = stmt.executeQuery(sql);
		    
		    
		    
		    System.out.println("\n\n\nSELECT: " + stmt.toString()+"\n\n\n");
		    
		  
		    
		    while(rs.next()) {
		    	
		    	Personal p = new Personal();
		    	
		    	System.out.println(rs.getString("uname"));
		    	
		    	p.setName(rs.getString("uname"));
		    	//p.setDesignation(rs.getString("designation"));
		    	p.setEmployeeid(rs.getString("employee_id"));
		    	p.setEmail1(rs.getString("uemail"));
		    	//p.setPrimarycontac1(rs.getString("primarycontact"));
		    	//p.setLocation(rs.getString("location"));
		    	p.setPrimarycontac1(rs.getString("umobile"));
		    	
		    	personals.add(p);
		    	
		    	/*
		    	p.setExtension1(rs.getString("extension1"));
		    	p.setPhone2(rs.getString("phone2"));
		    	p.setEmail2(rs.getString("email2"));
		    	p.setPrimarycontact2(rs.getString("primarycontact2"));
		    	p.setExtension2(rs.getString("extension2"));
		    	p.setBloodgroup(rs.getString("bloodgroup"));
		    	p.setDatebirth(rs.getString("DOB"));
		    	p.setPlacebirth(rs.getString("placebirth"));
		    	p.setMaritialstatus(rs.getString("maritialstatus"));
		    	p.setResidentialstatus(rs.getString("residentialstatus"));
		    	p.setMothertongue(rs.getString("mothertongue"));
		    	p.setAadharnumber(rs.getString("aadharnumber"));
		    	p.setDrivinglicense(rs.getString("drivinglicense"));
		    	p.setPhysicallychallenged(rs.getString("physicallychallenged"));
		    	p.setEmail(rs.getString("email"));
		    	*/
		    	
		    			    }
		}
		catch(Exception ex) {
			System.out.println("Exception: " + ex);
			
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
		
		return personals;
		}
		else 
			return null;
		
	}
	
	public boolean update(Personal per)
	{
		
		Connection con = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/zcientia","root","rootpassword");
			

			PreparedStatement stmt = null;
		    
		        stmt = con.prepareStatement("UPDATE personal SET name=?, designation=?, employeeid=?, email1=?, primarycontact=?, extension1=?, location=?, phone2=?, email2=?, primarycontact2=?, extension2=?, bloodgroup=?, DOB=?, placebirth=?, maritialstatus=?, residentialstatus=?, mothertongue=?, aadharnumber=?, drivinglicense=?, physicallychallenged=?, email=?, date=NOW() WHERE email=?");

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
	
	public Personal getEmployee(String email) {
		
		System.out.println("Email: " + email);
		Connection con = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/zcientia","root","rootpassword");
			
			PreparedStatement stmt = null;
		    
		    stmt = con.prepareStatement("select * from personal where email = ? ");

		    stmt.setString(1, email);
		        
		    ResultSet rs = stmt.executeQuery();
		    
		    Personal p = new Personal();
		    
		    System.out.println("\n\n\nSELECT: " + stmt.toString()+"\n\n\n");
		    
		    
		    while(rs.next()) {
		    	p.setName(rs.getString("name"));
		    	p.setDesignation(rs.getString("designation"));
		    	p.setEmployeeid(rs.getString("employeeid"));
		    	p.setEmail1(rs.getString("email1"));
		    	p.setPrimarycontac1(rs.getString("primarycontact"));
		    	p.setExtension1(rs.getString("extension1"));
		    	p.setLocation(rs.getString("location"));
		    	p.setPhone2(rs.getString("phone2"));
		    	p.setEmail2(rs.getString("email2"));
		    	p.setPrimarycontact2(rs.getString("primarycontact2"));
		    	p.setExtension2(rs.getString("extension2"));
		    	p.setBloodgroup(rs.getString("bloodgroup"));
		    	p.setDatebirth(rs.getString("DOB"));
		    	p.setPlacebirth(rs.getString("placebirth"));
		    	p.setMaritialstatus(rs.getString("maritialstatus"));
		    	p.setResidentialstatus(rs.getString("residentialstatus"));
		    	p.setMothertongue(rs.getString("mothertongue"));
		    	p.setAadharnumber(rs.getString("aadharnumber"));
		    	p.setDrivinglicense(rs.getString("drivinglicense"));
		    	p.setPhysicallychallenged(rs.getString("physicallychallenged"));
		    	p.setEmail(rs.getString("email"));
		    	
		    	
		    }
			
		    return p;
			
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
