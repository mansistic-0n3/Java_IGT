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

public class register extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public register() {
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		int age = Integer.parseInt(request.getParameter("age"));
		int salary = Integer.parseInt(request.getParameter("sal"));
		String desig = request.getParameter("desig");
		
		try {		
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/igt","root", "1234");
			PreparedStatement pstmt=con.prepareStatement("insert into employee values(?,?,?,?,?)");
				
				pstmt.setInt(1, id);
				pstmt.setString(2, name);
				pstmt.setInt(3, age);
				pstmt.setInt(4, salary);
				pstmt.setString(5, desig);
				pstmt.execute();
				
		PrintWriter out = response.getWriter();
		out.print("<h1>");
		out.print("ID : "+id+"<br>");
		out.print("NAME : "+name+"<br>");
		out.print("AGE : "+age+"<br>");
		out.print("SALARY : "+salary+"<br>");
		out.print("DESIGNATION : "+desig+"<br>");
		out.println("data inserted sucessfully...!");
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
