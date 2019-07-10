package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class WelcomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public WelcomeServlet() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out= response.getWriter();
		out.println("<h1>Unauthorised access to this page </h1>");
		out.println("<h3>Try<a href='login.html'>Login</a></h3>");
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name= request.getParameter("t1");
		String pwd= request.getParameter("t2");
		
		PrintWriter out= response.getWriter();
		
		if(name.equals(pwd)){
			RequestDispatcher rd = request.getRequestDispatcher("final"); //for forwarding into another server page. send url
			rd.forward(request, response);
		}
		else {
			out.println("<h1>Sorry Invalid credentials....</h1>");
			 RequestDispatcher rd = request.getRequestDispatcher("login.html");
			 rd.include(request, response);
		}
	}

}
