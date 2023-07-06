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

public class update extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public update() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		int salary = Integer.parseInt(request.getParameter("sal"));
		
		try {		
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/igt","root", "1234");
			PreparedStatement pstmt=con.prepareStatement("update employee set salary=? where id=?");

			pstmt.setInt(1, salary);
			pstmt.setInt(2, id);
			pstmt.execute();
				
		PrintWriter out = response.getWriter();
		out.print("<h1>");
		out.print("ID : "+id+"<br>");
		out.print("SALARY : "+salary+"<br>");
		out.println("data Updated sucessfully...!");
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
