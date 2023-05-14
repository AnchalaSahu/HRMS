package com.demo.zcienta;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class AccountsDAO {
	public boolean update(Accounts acc)
	{
		
		Connection con = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/zcientia","root","rootpassword");
			

			
			PreparedStatement stmt = null;
		    
	        stmt = con.prepareStatement("UPDATE accounts SET bankname=?,accountnumber=?, bankbranch=?, pfnumber=?, eligibility=?, uan=?, kycdocument=?, kycstatus=?, email=?,date=NOW() WHERE email=?"); 
			
	        stmt.setString(1, acc.getBankname());
	        stmt.setString(2, acc.getAccountnumber());
	        stmt.setString(3, acc.getBankbranch());
	        stmt.setString(4, acc.getPfnumber());
	        stmt.setString(5, acc.getEligibility());
	        stmt.setString(6, acc.getUan());
	        stmt.setString(7, acc.getKycdocument());
	        stmt.setString(8, acc.getKycstatus());
	        stmt.setString(9, acc.getEmail());
	        stmt.setString(10, acc.getEmail());
	        
	        
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

public Accounts getEmployee(String email) {
		
		System.out.println("Email: " + email);
		Connection con = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/zcientia","root","rootpassword");
			
			PreparedStatement stmt = null;
		    
		    stmt = con.prepareStatement("select * from accounts where email = ? ");

		    stmt.setString(1, email);
		        
		    ResultSet rs = stmt.executeQuery();
		    
		    Accounts a = new Accounts();
		    
		    System.out.println("\n\n\nSELECT: " + stmt.toString()+"\n\n\n");
		    
		    
		    while(rs.next()) {
		    	a.setBankname(rs.getString("bankname"));
		    	a.setAccountnumber(rs.getString("accountnumber"));
		    	a.setBankbranch(rs.getString("bankbranch"));
		    	a.setPfnumber(rs.getString("pfnumber"));
		    	a.setEligibility(rs.getString("eligibility"));
		    	a.setUan(rs.getString("uan"));
		    	a.setKycdocument(rs.getString("kycdocument"));
		    	a.setKycstatus(rs.getString("kycstatus"));
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

