package com.demo.zcienta;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class HRlogin
 */
@WebServlet("/HRlogin")
public class HRlogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HRlogin() {
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
		
		String uemail = request.getParameter("username");
		String upwd = request.getParameter("password");
		
		RequestDispatcher dispatcher = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/zcientia","root","rootpassword");
			PreparedStatement pst = con.prepareStatement("select * from hr where uemail = ? and upwd = ?");
			pst.setString(1, uemail);
			pst.setString(2, upwd);
			
		ResultSet rs = pst.executeQuery();
		if(rs.next()) {
			HttpSession session =request.getSession();
			session.setAttribute("name", rs.getString("uname"));
			session.setAttribute("user",uemail );
			session.setAttribute("email", uemail);
			dispatcher = request.getRequestDispatcher("HRdashboard.html");
		}else {
			request.setAttribute("status", "failed");
			dispatcher = request.getRequestDispatcher("HRlogin.jsp");
		}
		dispatcher.forward(request, response);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}