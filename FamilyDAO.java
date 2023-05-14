package com.demo.zcienta;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class FamilyDAO {
	
	public boolean update(Family family)
	{
		System.out.println(family);
		
		Connection con = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/zcientia","root","rootpassword");
			
//		String query = "insert into family (fathername,fatherdob,fathercontact,mothername,motherdob,mothercontact,spousename,spousedatebirth,spousecontact,spouseoccupation,spouseplacebirth,spouseemail,email,date) values ('"
//					+ family.getFathername() +"','" + family.getFatherdob() + "','" + family.getFathercontactnumber() + "','"+ family.getMothername()
//					+ "','" +family.getMotherdob() + "','" + family.getMothercontactnumber()+"','" + family.getName() + "','"+family.getDob() + "','" + family.getContactnumber() + "','" + family.getOccupation() + "','" 
//					+ family.getPlacrbirth()+ "','" + family.getEmail()+ "','" + family.getEmail1() + "',now());";
//			
//			Statement stmt = con.createStatement();
			
        PreparedStatement stmt = null;
           
           String updateStatement = "UPDATE family SET fathername=?,fatherdob=?, fathercontact=?, mothername=?, motherdob=?, mothercontact=?, spousename=?, spousedatebirth=?,spousecontact=?,spouseoccupation=?,spouseplacebirth=?,spouseemail=?, email=?,date=NOW() WHERE email=?";
		    
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

	public Family getEmployee(String email) {
		
		System.out.println("Email: " + email);
		Connection con = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/zcientia","root","rootpassword");
			
			PreparedStatement stmt = null;
		    
		    stmt = con.prepareStatement("select * from family where email = ? ");

		    stmt.setString(1, email);
		        
		    ResultSet rs = stmt.executeQuery();
		    
		    Family f = new Family();
		    
		    System.out.println("\n\n\nSELECT: " + stmt.toString()+"\n\n\n");
		    
		    
		    while(rs.next()) {
		    	
		    	f.setFathername(rs.getString("fathername"));
		    	f.setFatherdob(rs.getString("fatherdob"));
		    	f.setFathercontactnumber(rs.getString("fathercontact"));
		    	f.setMothername(rs.getString("mothername"));
		    	f.setMotherdob(rs.getString("motherdob"));
		    	f.setMothercontactnumber(rs.getString("mothercontact"));
		    	f.setName(rs.getString("spousename"));
		    	f.setDob(rs.getString("spousedatebirth"));
		    	f.setContactnumber(rs.getString("spousecontact"));
		    	f.setOccupation(rs.getString("spouseoccupation"));
		    	f.setPlacrbirth(rs.getString("spouseplacebirth"));
		    	f.setEmail(rs.getString("spouseemail"));
		    	f.setEmail1(rs.getString("email"));
		    	
		    	
		    	
		    }
			
		    return f;
			
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

