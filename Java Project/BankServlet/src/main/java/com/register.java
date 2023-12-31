package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class register extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public register() {
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("name");
		String pass = request.getParameter("pass");
		
		try {		
			ServletContext context=getServletContext();
            String driver=context.getInitParameter("driver");
            String url=context.getInitParameter("url");
            String username=context.getInitParameter("username");
            String password=context.getInitParameter("password");
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, username,password);
			PreparedStatement pstmt=con.prepareStatement("insert into Users values(?,?)");
				
				pstmt.setString(1, name);
				pstmt.setString(2, pass);
				pstmt.execute();
				
		PrintWriter out = response.getWriter();
		out.print("<div style=\"max-width: 400px; text-align:center; margin: 0 auto; padding: 40px; background-color: #ffffff; border-radius: 5px; box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);\">");
		out.print("<h3 style=\"text-align: center; color: #333333;\">Registered Successfully!</h3>");
		
		out.print("<a href='login.html'>Login Now</a></div>");
	}
	
catch (Exception e) {
	System.out.println(e);
}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
