package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class bal extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public bal() {
        super();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int num = Integer.parseInt(request.getParameter("num"));
		try {		
			ServletContext context=getServletContext();
            String driver=context.getInitParameter("driver");
            String url=context.getInitParameter("url");
            String username=context.getInitParameter("username");
            String password=context.getInitParameter("password");
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, username,password);
			PreparedStatement stmt = con.prepareStatement("SELECT Balance FROM bank WHERE accNo=? OR phone=? OR aadhar=?");
		    stmt.setInt(1, num);
		    stmt.setInt(2, num);
		    stmt.setInt(3, num);
		    ResultSet rs = stmt.executeQuery();
			PrintWriter out = response.getWriter();
			if (rs.next()) {
                int balance = rs.getInt("balance");
                out.print("<div style=\"max-width: 400px; text-align:center; margin: 0 auto; padding: 40px; background-color: #ffffff; border-radius: 5px; box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);\">");
        		out.print("<h4 style=\"text-align: center; color: #333333;\">Your Current Balance is</h4>");
        		
    			out.print("<h2>Rs. "+rs.getInt("Balance")+"</h2>");
    			out.print("<br><a href='Home.html'>Back to HOME<br><br></a></div><br><br>");
                
            } else {
            	out.print("<div style=\"max-width: 400px; text-align:center; margin: 0 auto; padding: 40px; background-color: #ffffff; border-radius: 5px; box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);\">");
        		out.print("<h3 style=\"text-align: center; color: #333333;\">No records found! Check Account number again.</h3>");
    			out.print("<br><a href='Home.html'>Back to HOME<br><br></a></div><br><br>");
                
            }
			
			
    }
catch (Exception e) {
	System.out.println(e);
	}
}
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
