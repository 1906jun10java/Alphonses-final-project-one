package com.revature.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.revature.beans.Users;
import com.revature.daoimpl.UsersDAOImpl;

/**
 * Servlet implementation class MakeReimbursement
 */
public class MakeReimbursement extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MakeReimbursement() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.sendRedirect("ViewAllRequests.html");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UsersDAOImpl impl = new UsersDAOImpl();
		
		Users usr = new Users();
		//form data
		String decision = request.getParameter("decision"); 
		String reqidString = request.getParameter("username"); 
		int reqid = Integer.parseInt(reqidString);
		String picture =(String)request.getParameter("picture");
		
		
		
//		String sql = "UPDATE USERS SET "+edit+" = '"+username+"' WHERE EMPID = "+sesUser;
	
		impl.SubmitDecision(reqid, decision);
			
		response.sendRedirect("ViewAllRequests.html");		
		
		
	}
}
