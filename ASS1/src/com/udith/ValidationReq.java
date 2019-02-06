package com.udith;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ValidationReq")
public class ValidationReq extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		
		String fname,lname,country,multi;
		int age;
		
		fname = (String) req.getAttribute("fname");
		lname = (String) req.getAttribute("lname");
		country = (String) req.getAttribute("country");
		multi = (String) req.getAttribute("multi");
		age = (int) req.getAttribute("age");
		
		String outputPass = fname+" "+lname+" is a valid user for vote in Sri Lanka";
		String outputFail = fname+" "+lname+" is NOT a valid user for vote in Sri Lanka!!!!";
		
		// Validation checks
		
		if(age >= 19 && country.equalsIgnoreCase("Sri Lanka") && multi == null) {
			PrintWriter out = res.getWriter();
			out.println(outputPass);
		}
		else {
			PrintWriter out = res.getWriter();
			out.println(outputFail);
		}
		
		
		
		
		
	}
	
}
