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
 * Servlet implementation class OnboardingServlet
 */
@WebServlet("/OnboardingServlet")
public class OnboardingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OnboardingServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String name=request.getParameter("user@1");
		String employeeid=request.getParameter("emp@1");
		String designation=request.getParameter("sde-1");	
		String contact=request.getParameter("primarycontact");	
		String email1=request.getParameter("email-1");	
		
		
		HttpSession sess=request.getSession(false);
		String email= sess.getAttribute("email").toString();
		
		
try {
			
			PrintWriter out=null;
			out=response.getWriter();
			
			Onboarding onboard=new Onboarding(name,employeeid,designation,contact,email1);
			OnboardingDAO onboarddao=new OnboardingDAO();
			
			System.out.println(onboard);
			
			if(onboarddao.insert(onboard))
			{
				out.println("<script>alert('Employee Enlisted Successfully')</script>");
				RequestDispatcher rd=request.getRequestDispatcher("Onboarding.html");
				rd.include(request, response);
				
				
			
				
			}
			else
			{
	           
				out.println("<script>alert('OOPS! Employee Already Enlisted')</script>");
				RequestDispatcher rd=request.getRequestDispatcher("Onboarding.html");
				rd.include(request, response);
				
			}
			
		}
		catch(Exception ex)
		{
			System.out.println(ex);
			
		}


	}

}
