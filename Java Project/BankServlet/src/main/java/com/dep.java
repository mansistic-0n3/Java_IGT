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

public class dep extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public dep() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int num = Integer.parseInt(request.getParameter("num"));
		int amt = Integer.parseInt(request.getParameter("amt"));
		
		try {		
			ServletContext context=getServletContext();
            String driver=context.getInitParameter("driver");
            String url=context.getInitParameter("url");
            String username=context.getInitParameter("username");
            String password=context.getInitParameter("password");
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, username,password);
			PreparedStatement pstmt=con.prepareStatement("update Bank set Balance=Balance+? where accNo=? or phone=? or aadhar=?");

			pstmt.setInt(1, amt);
			pstmt.setInt(2, num);
			pstmt.setInt(3, num);
			pstmt.setInt(4, num);
			pstmt.execute();
			
			 int affectedRows = pstmt.executeUpdate();

			    if (affectedRows == 0) {
			        // No record found
			        PrintWriter out = response.getWriter();
			        out.print("<div style=\"max-width: 400px; text-align:center; margin: 0 auto; padding: 40px; background-color: #ffffff; border-radius: 5px; box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);\">");
			        out.print("<h4 style=\"text-align: center; color: #333333;\">No record found! Check Account number again.</h4>");
			        out.print("<br><a href='Home.html'>Back to HOME<br><br></a></div><br><br>");
			    } else {
			        // Record(s) updated successfully
			        PrintWriter out = response.getWriter();
			        out.print("<div style=\"max-width: 400px; text-align:center; margin: 0 auto; padding: 40px; background-color: #ffffff; border-radius: 5px; box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);\">");
			        out.print("<h4 style=\"text-align: center; color: #333333;\">Amount Deposited Successfully!</h4>");
			        out.print("<br><a href='Home.html'>Back to HOME<br><br></a></div><br><br>");
			    }
				
//		PrintWriter out = response.getWriter();
//		out.print("<div style=\"max-width: 400px; text-align:center; margin: 0 auto; padding: 40px; background-color: #ffffff; border-radius: 5px; box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);\">");
//		out.print("<h4 style=\"text-align: center; color: #333333;\">Amount Deposited Successfully!</h4>");
//		out.print("<br><a href='Home.html'>Back to HOME<br><br></a></div><br><br>");
		
	}
catch (Exception e) {
	System.out.println(e);
	}
}

	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
