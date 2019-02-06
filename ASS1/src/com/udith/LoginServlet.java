package com.udith;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {


	private static final long serialVersionUID = 1L;
	String fname= null , lname = null, country = "no country", multi;
	int age = 0;
	
	


	public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
			
	}
	
	
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		fname = req.getParameter("fname");
		lname = req.getParameter("lname");
		country = req.getParameter("citizenship");
		multi = req.getParameter("multi");
		age = Integer.parseInt(req.getParameter("age"));
		
		req.setAttribute("fname", fname);
		req.setAttribute("lname", lname);
		req.setAttribute("country", country);
		req.setAttribute("multi", multi);
		req.setAttribute("age", age);
		
		RequestDispatcher validator = req.getRequestDispatcher("/val");
		validator.forward(req, res);
		
	}

}
