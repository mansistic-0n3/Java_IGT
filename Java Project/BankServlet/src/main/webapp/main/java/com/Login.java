package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public Login() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String pass = request.getParameter("pass");
		
		PrintWriter out = response.getWriter();
		if(name.equalsIgnoreCase("Mansi")&& pass.equalsIgnoreCase("mansi@123")) {
			out.print("Logged In");
			RequestDispatcher rd= request.getRequestDispatcher("index.html");
			rd.forward(request,response);
		}else {
			out.print("<p style='color:red'> Please try again</p> ");
			RequestDispatcher rd= request.getRequestDispatcher("login.html");
			rd.include(request, response);
		}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
