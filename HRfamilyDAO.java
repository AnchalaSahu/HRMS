package com.demo.zcienta;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class HRfamilyDAO {
	
	public boolean update(HRfamily family)



	{
		
		Connection con = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/zcientia","root","rootpassword");

			
			PreparedStatement stmt = null;
	           
	           String updateStatement = "UPDATE hrfamily SET fathername=?,fatherdob=?, fathercontact=?, mothername=?, motherdob=?, mothercontact=?, spousename=?, spousedatebirth=?,spousecontact=?,spouseoccupation=?,spouseplacebirth=?,spouseemail=?, email=?,date=NOW() WHERE email=?";
			    
		        stmt = con.prepareStatement(updateStatement); 
				
		        stmt.setString(1, family.getFathername());
		        stmt.setString(2, family.getFatherdob());
		        stmt.setString(3, family.getFathercontactnumber());
		        stmt.setString(4, family.getMothername());
		        stmt.setString(5, family.getMotherdob());
		        stmt.setString(6, family.getMothercontactnumber());
		        stmt.setString(7, family.getName());
		        stmt.setString(8, family.getDob());
		        stmt.setString(9, family.getContactnumber());
		        stmt.setString(10, family.getOccupation());
		        stmt.setString(11, family.getPlacrbirth());
		        stmt.setString(12, family.getEmail());
		        stmt.setString(13, family.getEmail1());
		        stmt.setString(14, family.getEmail1());
		        
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
	public HRfamily getEmployee(String email) {
		
		System.out.println("Email: " + email);
		Connection con = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/zcientia","root","rootpassword");
			
			PreparedStatement stmt = null;
		    
		    stmt = con.prepareStatement("select * from hrfamily where email = ? ");

		    stmt.setString(1, email);
		        
		    ResultSet rs = stmt.executeQuery();
		    
		    HRfamily hf = new HRfamily();
		    
		    System.out.println("\n\n\nSELECT: " + stmt.toString()+"\n\n\n");
		    
		    
		    while(rs.next()) {
		    	
		    	hf.setFathername(rs.getString("fathername"));
		    	hf.setFatherdob(rs.getString("fatherdob"));
		    	hf.setFathercontactnumber(rs.getString("fathercontact"));
		    	hf.setMothername(rs.getString("mothername"));
		    	hf.setMotherdob(rs.getString("motherdob"));
		    	hf.setMothercontactnumber(rs.getString("mothercontact"));
		    	hf.setName(rs.getString("spousename"));
		    	hf.setDob(rs.getString("spousedatebirth"));
		    	hf.setContactnumber(rs.getString("spousecontact"));
		    	hf.setOccupation(rs.getString("spouseoccupation"));
		    	hf.setPlacrbirth(rs.getString("spouseplacebirth"));
		    	hf.setEmail(rs.getString("spouseemail"));
		    	hf.setEmail1(rs.getString("email"));
		    	
		    	
		    	
		    }
			
		    return hf;
			
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
