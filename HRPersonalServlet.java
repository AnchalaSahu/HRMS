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

@WebServlet("/HRPersonalServlet")
public class HRPersonalServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public HRPersonalServlet() {
        super();
      
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name1=request.getParameter("name");
	
		String designation1=request.getParameter("designation");
		String employeeid1=request.getParameter("employeeid");	
		String email1=request.getParameter("email1");	
		String location1=request.getParameter("location");	
		String primarycontact1=request.getParameter("contact1");	
		String extension1=request.getParameter("extension1");
		String phone2=request.getParameter("phone2");
		String email2=request.getParameter("email2");	
		String primarycontact2=request.getParameter("contact2");
		String extension2=request.getParameter("extension2");
		String bloodgroup1=request.getParameter("bloodgroup");
		String datebirth1=request.getParameter("dob");
		String placebirth1=request.getParameter("placebirth");
		String maritialstatus1=request.getParameter("maritialstatus");
		String residentialstatus1=request.getParameter("residential");
		String mothertongue1=request.getParameter("mothertongue");
		String aadhar1=request.getParameter("aadhar");
		String drivinglicense1=request.getParameter("drivinglicense");
		String physicallychallenged1=request.getParameter("physically");
		
		HttpSession sess=request.getSession(false);
		String email= sess.getAttribute("email").toString();
		
		
		
try {
			
			PrintWriter out=null;
			out=response.getWriter();
			
			HRpersonal per=new HRpersonal(name1,designation1,employeeid1,email1,location1,primarycontact1,extension1,phone2,email2,
					primarycontact2,extension2,bloodgroup1,datebirth1,placebirth1,maritialstatus1,residentialstatus1,mothertongue1,
					aadhar1,drivinglicense1,physicallychallenged1,email);
			
			HRpersonalDAO  hrpersonaldao=new HRpersonalDAO ();
			
			
			
			if(hrpersonaldao.update(per))
			{
				
				out.println("<script>alert('Personal Details Updated Successfully.')</script>");
				RequestDispatcher rd=request.getRequestDispatcher("hrpersonal.jsp");
				rd.include(request, response);
				
				
			
				
			}
			else
			{
				out.println("<script>alert('Update Unsuccessful.')</script>");
				RequestDispatcher rd=request.getRequestDispatcher("hrpersonal.jsp");
				rd.include(request, response);
			}
			
		}
		catch(Exception ex)
		{
			System.out.println(ex);
			
		}
		
		
		}
		

	}

