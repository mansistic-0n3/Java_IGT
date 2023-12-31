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

public class create extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public create() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		int acc = Integer.parseInt(request.getParameter("acc"));
		String ifsc = request.getParameter("ifsc");
		String pan = request.getParameter("pan");
		int ph = Integer.parseInt(request.getParameter("ph"));
		int a = Integer.parseInt(request.getParameter("adhar"));
		int ibal = Integer.parseInt(request.getParameter("ibal"));
		
		try {		
			ServletContext context=getServletContext();
            String driver=context.getInitParameter("driver");
            String url=context.getInitParameter("url");
            String username=context.getInitParameter("username");
            String password=context.getInitParameter("password");
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, username,password);
			PreparedStatement pstmt=con.prepareStatement("insert into Bank values(?,?,?,?,?,?,?,?)");
				
				pstmt.setInt(1, id);
				pstmt.setString(2, name);
				pstmt.setInt(3, acc);
				pstmt.setString(4, ifsc);
				pstmt.setString(5, pan);
				pstmt.setInt(6, ph);
				pstmt.setInt(7, a);
				pstmt.setInt(8, ibal);
				pstmt.execute();
				
		PrintWriter out = response.getWriter();
		out.print("<div style=\"max-width: 400px; text-align:center; margin: 0 auto; padding: 40px; background-color: #ffffff; border-radius: 5px; box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);\">");
		out.print("<h4 style=\"text-align: center; color: #333333;\">Your details are here-</h4>");
		
		out.print("ID : "+id+"<br>");
		out.print("NAME : "+name+"<br>");
		out.print("ACCOUNT NUMBER : "+acc+"<br>");
		out.print("IFSC Code : "+ifsc+"<br>");
		out.print("PAN Number : "+pan+"<br>");
		out.print("Phone : "+ph+"<br>");
		out.print("Adhar : "+a+"<br>");
		out.print("Initial Balance : "+ibal+"<br>");
		out.println("<h2>Account created sucessfully...!</h2>");
		out.print("<br><br><a href='Home.html'>Back to HOME</a>");
		out.print("</div>");
	}
	
catch (Exception e) {
	System.out.println(e);
}
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
