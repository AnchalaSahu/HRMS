package com.demo.zcienta;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;



public class HrassetsDAO {
	
	public boolean update(Hrassets hrassets)
	{
		
			System.out.println(hrassets);
			Connection con = null;
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/zcientia","root","rootpassword");
				

				PreparedStatement stmt = null;
				
				String updateStatement = "UPDATE hrassets SET desktop=?,idcard=?, other=?,datetime=NOW(),email=? WHERE email=?";
			    
				stmt = con.prepareStatement(updateStatement); 
				
		        stmt.setString(1, hrassets.getDesktop());
		        stmt.setString(2, hrassets.getAccess());
		        stmt.setString(3, hrassets.getAccessory());
		        stmt.setString(4, hrassets.getEmail());
		        stmt.setString(5, hrassets.getEmail());
			       
		        
		        
		        
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
public Hrassets getEmployee(String email) {
		
		System.out.println("Email: " + email);
		Connection con = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/zcientia","root","rootpassword");
			
			PreparedStatement stmt = null;
		    
		    stmt = con.prepareStatement("select * from hrassets where email = ? ");

		    stmt.setString(1, email);
		        
		    ResultSet rs = stmt.executeQuery();
		    
		    Hrassets a= new Hrassets();
		    
		    System.out.println("\n\n\nSELECT: " + stmt.toString()+"\n\n\n");
		    
		    
		    while(rs.next()) {
		    	a.setDesktop(rs.getString("desktop"));
		    	a.setAccess(rs.getString("idcard"));
		    	a.setAccessory(rs.getString("other"));
		    	a.setEmail(rs.getString("email"));
		    	
		    }
			
		    return a;
			
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
