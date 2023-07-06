package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class delete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public delete() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		
		
		try {		
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/igt","root", "1234");
			PreparedStatement pstmt=con.prepareStatement("delete from employee where id=?");

			
			pstmt.setInt(1, id);
			pstmt.execute();
				
		PrintWriter out = response.getWriter();
		out.print("<h1>");
		out.print("ID : "+id+"<br>");
		
		out.println("data deleted sucessfully...!");
		out.print("</h1>");
		out.print("<a href='index.html'>HOME PAGE</a>");
	}
catch (Exception e) {
	System.out.println(e);
	}
}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
