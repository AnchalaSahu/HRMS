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
 * Servlet implementation class HREmploymentServlet
 */
@WebServlet("/HREmploymentServlet")
public class HREmploymentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HREmploymentServlet() {
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
		
		
		String designation=request.getParameter("desgination");
		String dateofjoining=request.getParameter("dateofjoin");
		String experience=request.getParameter("experience");	
		String reporting=request.getParameter("reporting");	
		String workinghours=request.getParameter("worktime");	
		String teamcapacity=request.getParameter("teamcapacity");	
		String shifttiming=request.getParameter("shifttiming");
		String breaktiming=request.getParameter("breaktime");
		String shifttype=request.getParameter("shifttype");
		
		
		HttpSession sess=request.getSession(false);
		String email= sess.getAttribute("email").toString();
		
		
try {
			
			PrintWriter out=null;
			out=response.getWriter();
			
			HRemployment employee=new HRemployment(designation,dateofjoining,experience,reporting,workinghours,teamcapacity,shifttiming,breaktiming,shifttype,email);
			HRemploymentDAO familydao=new HRemploymentDAO();
			
			
			
			if(familydao.update(employee))
			{
				out.println("<script>alert(' Details Updated Successfully.')</script>");
				RequestDispatcher rd=request.getRequestDispatcher("hremployment.jsp");
				rd.include(request, response);
				
				
			}
			else
			{
				out.println("<script>alert('Update Unsuccessful.')</script>");
				RequestDispatcher rd=request.getRequestDispatcher("hremployment.jsp");
				rd.include(request, response);
				
			}
			
		}
		catch(Exception ex)
		{
			System.out.println(ex);
			
		}
		
		
		}
	}
