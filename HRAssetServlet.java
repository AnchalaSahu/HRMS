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

import com.demo.zcienta.Hrassets;
import com.demo.zcienta.HrassetsDAO;

/**
 * Servlet implementation class HRAssetServlet
 */
@WebServlet("/HRAssetServlet")
public class HRAssetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HRAssetServlet() {
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
		String desktop1=request.getParameter("desktop");
		String access1=request.getParameter("access");
		String accessory1=request.getParameter("accessory");
		
		
		
		
		HttpSession sess=request.getSession(false);
		String email= sess.getAttribute("email").toString();
		
		try {
			
			PrintWriter out=null;
			out=response.getWriter();
			
			Hrassets hrassets=new Hrassets(desktop1,access1,accessory1,email);
			HrassetsDAO hrassetsdao=new HrassetsDAO();
			
			
			
			if(hrassetsdao.update(hrassets))
			{
				out.println("<script>alert(' Details Updated Successfully.')</script>");
				RequestDispatcher rd=request.getRequestDispatcher("hrassets.jsp");
				rd.include(request, response);
			}
			else
			{
				out.println("<script>alert('Update Unsuccessful')</script>");
				RequestDispatcher rd=request.getRequestDispatcher("hrassets.jsp");
				
				rd.include(request, response);
				
			}
			
		}
		catch(Exception ex)
		{
			System.out.println(ex);
			
		}
		
		
		}

}
