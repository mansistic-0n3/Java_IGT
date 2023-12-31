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

public class Detail extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Detail() {
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
			PreparedStatement stmt = con.prepareStatement("SELECT * FROM bank WHERE accNo=? OR phone=? OR aadhar=?");
		    stmt.setInt(1, num);
		    stmt.setInt(2, num);
		    stmt.setInt(3, num);
		    ResultSet rs = stmt.executeQuery();
			PrintWriter out = response.getWriter();
			if (rs.next()) {
                out.print("<div style=\"max-width: 400px; text-align:center; margin: 0 auto; padding: 40px; background-color: #ffffff; border-radius: 5px; box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);\">");
        		out.print("<h3 style=\"text-align: center; color: #333333;\">Your details are -</h3>");
        		out.print("<p>ID : "+rs.getInt("id")+"</p>");
        		out.print("<p>Name :  "+rs.getString("name")+"</p>");
        		out.print("<p>Account Number : "+rs.getInt("accno")+"</p>");
        		out.print("<p>IFSC Code : "+rs.getString("ifsc")+"</p>");
    			out.print("<p>PAN Number : "+rs.getInt("pan")+"</p>");
    			out.print("<p>Phone : "+rs.getInt("Phone")+"</p>");
    			out.print("<p>Adhar: "+rs.getInt("Aadhar")+"</p>");
    			out.print("<p>Balance : Rs. "+rs.getInt("Balance")+"</p>");
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
