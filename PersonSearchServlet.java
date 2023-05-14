package com.demo.zcienta;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class PersonSearchServlet
 */
@WebServlet("/PersonSearchServlet")
public class PersonSearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PersonSearchServlet() {
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
		
		String search=request.getParameter("search");
		
		
		HttpSession sess=request.getSession(false);
		String email= sess.getAttribute("email").toString();
		
		try {
			
			PrintWriter out=null;
			out=response.getWriter();
		
			PersonalDAO perDAO=new PersonalDAO();
			
			List<Personal> personals = perDAO.getEmployees(search);
			System.out.println(personals.size());
			
			if(personals==null)	 {
				
				out.println("<script >alert('no name exist')</script>");
				
			}
			else {
			
			for(Personal personal: personals) {
				out.println(personal.getName());
				out.println(personal.getEmployeeid());
				out.println(personal.getPrimarycontac1());
				out.println(personal.getEmail1());			
			}
			
			
			/*
			if(perDAO.getEmployees(search)) {
				
				out.println("<script>alert('Personal Details searched Successfully.')</script>");
				RequestDispatcher rd=request.getRequestDispatcher("HRsearch.html");
				rd.include(request, response);
				
				
			
				
			}
			else
			{
				out.println("<script>alert('Update Unsuccessful.')</script>");
				RequestDispatcher rd=request.getRequestDispatcher("HRsearch.html");
				rd.include(request, response);
			}*/
			}
		}
		catch(Exception ex)
		{
			System.out.println(ex);
			
		}
		
		
		}
		

	}
