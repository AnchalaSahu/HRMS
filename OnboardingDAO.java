package com.demo.zcienta;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class OnboardingDAO {
	
	public boolean insert(Onboarding onboarding)
	{
		
		Connection con = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/zcientia","root","rootpassword");
			
			String query = "insert into onboardingemployees (name,employeeid,designation,contact,email,currentdate) values ('"
					+ onboarding.getName() +"','" + onboarding.getEmployeeid() + "','" + onboarding.getDesignation() + "','"+ onboarding.getContact() 
					+ "','" +onboarding.getEmail()+"',now());";
			
			Statement stmt = con.createStatement();
			
			int row= stmt.executeUpdate(query);
			
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

}
