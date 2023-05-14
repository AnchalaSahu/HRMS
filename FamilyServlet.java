package com.demo.zcienta;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class FamilyServlet
 */
@WebServlet("/FamilyServlet")
public class FamilyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FamilyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fathername=request.getParameter("fathersname");
		String fatherdob=request.getParameter("fathersdob");
		String fathercontact=request.getParameter("f-conatacts");	
		String mothername=request.getParameter("mother-name");	
		String motherdob=request.getParameter("mothersdob");	
		String mothercontact=request.getParameter("mother-con");	
		String spousename=request.getParameter("spouse-name");
		String spousedatebirth=request.getParameter("dob-1");
		String spousecontact=request.getParameter("contact");
		String occupation=request.getParameter("occup");
		String placebirth=request.getParameter("birth");
		String spouseemail=request.getParameter("email-");
		
		HttpSession sess=request.getSession(false);
		String email= sess.getAttribute("email").toString();
		
		
		
		
		
		
try {
			
			PrintWriter out=null;
			out=response.getWriter();
			
			Family family=new Family(fathername,fatherdob,fathercontact,mothername,motherdob,mothercontact,spousename,spousedatebirth,spousecontact,occupation,placebirth,spouseemail,email);
			FamilyDAO familydao=new FamilyDAO();
			
			//System.out.println(family);
			
			if(familydao.update(family))
			{
				out.println("<script>alert('Family Details Updated Successfully.')</script>");
				RequestDispatcher rd=request.getRequestDispatcher("family.jsp");
				rd.include(request, response);
				
				
			}
			else
			{
				out.println("<script>alert('Update Unsuccessful.')</script>");
				RequestDispatcher rd=request.getRequestDispatcher("family.jsp");
				rd.include(request, response);
				
			}
			
		}
		catch(Exception ex)
		{
			System.out.println(ex);
			
		}
		
		
		}
	}


