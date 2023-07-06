package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Read extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Read() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		try {		
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/igt","root", "1234");
			Statement stmt=con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from employee");
			
		PrintWriter out = response.getWriter();
		out.print("<h1>");
		while(rs.next()) {
			out.print(rs.getInt(1)+":"+rs.getString(2)+":"+rs.getInt(3)+":"+rs.getInt(4)+":"+rs.getString(5));
            out.print("<br>");
        }
        out.print("</h4>");
        out.print("<a href='index.html'>HOME PAGE</a>");
    }
catch (Exception e) {
	System.out.println(e);
	}
}
	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
