package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class FinalServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public FinalServlet() {
        super();
    
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name= request.getParameter("t1");
		PrintWriter out= response.getWriter();
		out.println("<h1>Welcome "+ name + " </h1>");
		out.println("<h2>Finally logged in..</h2>");
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
