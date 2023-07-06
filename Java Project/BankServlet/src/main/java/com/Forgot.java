package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Forgot extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Forgot() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String uname = request.getParameter("name");
	     String pass = request.getParameter("pass");

	     try {		
				ServletContext context=getServletContext();
	            String driver=context.getInitParameter("driver");
	            String url=context.getInitParameter("url");
	            String username=context.getInitParameter("username");
	            String password=context.getInitParameter("password");
				Class.forName(driver);
				Connection con = DriverManager.getConnection(url, username,password);
				PreparedStatement pstmt = con.prepareStatement("SELECT * FROM users WHERE user=?");
	            pstmt.setString(1, uname);
	            ResultSet rs = pstmt.executeQuery();

	            if (rs.next()) {
	                // User exists, update the password
	                PreparedStatement updateStmt = con.prepareStatement("UPDATE users SET password=? WHERE user=?");
	                updateStmt.setString(1, pass);
	                updateStmt.setString(2, uname);
	                updateStmt.executeUpdate();
	                updateStmt.close();

	                PrintWriter out = response.getWriter();
	                out.print("<div style=\"max-width: 400px; text-align:center; margin: 0 auto; padding: 40px; background-color: #ffffff; border-radius: 5px; box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);\">");
	                out.print("<h4 style=\"text-align: center; color: #333333;\">Password Changed Successfully!</h4>");
	                out.print("<br><a href='login.html'>LOGIN<br><br></a></div><br><br>");
	            } else {
	                // User does not exist, redirect to another page
	                response.sendRedirect("noUser.html");
	            }

	            rs.close();
	            pstmt.close();
	            con.close();
	        } catch (Exception e) {
	            System.out.println(e);
	        }
	     }

		
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
