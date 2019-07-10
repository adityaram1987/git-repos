package com;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class VerifyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private int correctDetails=0;
	private int wrongPassword=1;
	private int noDetails=2;
	
    public VerifyServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name= request.getParameter("t1");
		String pwd= request.getParameter("t2");
		
		//PrintWriter out= response.getWriter();
		VerifyBean vb = new VerifyBean();
		int status = vb.verify(name, pwd);
		if(status==correctDetails) {
			RequestDispatcher rd = request.getRequestDispatcher("verified.jsp");
			rd.forward(request, response);
		}
		else if(status==wrongPassword){
			RequestDispatcher rd = request.getRequestDispatcher("relogin.jsp");
			rd.forward(request, response);
		}
		else {
			RequestDispatcher rd = request.getRequestDispatcher("register.jsp");
			rd.forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
