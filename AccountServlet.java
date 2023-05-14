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
 * Servlet implementation class AccountServlet
 */
@WebServlet("/AccountServlet")
public class AccountServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AccountServlet() {
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
		String bankname1=request.getParameter("bank-name");
		String accountnumber=request.getParameter("account-number");
		String bankbranch=request.getParameter("bankbrnch");	
		String pfnumber=request.getParameter("pfnumber");	
		String eligibility=request.getParameter("eligible");	
		String uan=request.getParameter("uann");	
		String kycdocument=request.getParameter("kycdoc");
		String kycstatus=request.getParameter("kycstat");
		
		
		HttpSession sess=request.getSession(false);
		String email= sess.getAttribute("email").toString();
		
		
		
		
try {
			
			PrintWriter out=null;
			out=response.getWriter();
			
			Accounts acc=new Accounts(bankname1,accountnumber,bankbranch,pfnumber,eligibility,uan,kycdocument,kycstatus,email);
			AccountsDAO accounts=new AccountsDAO();
			
			System.out.println(acc);
			
			if(accounts.update(acc))
			{
				out.println("<script>alert('Account Details Updated Successfully.')</script>");
				RequestDispatcher rd=request.getRequestDispatcher("account.jsp");
				rd.include(request, response);
				
				
				
			}
			else
			{
				out.println("<script>alert('Update Unsuccessful.')</script>");
				RequestDispatcher rd=request.getRequestDispatcher("account.jsp");
				rd.include(request, response);
				
			}
			
		}
		catch(Exception ex)
		{
			System.out.println(ex);
			
		}
		
		
		}
	}


