package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginPage extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public LoginPage() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String pass = request.getParameter("pass");
		
		if (validateLogin(name, pass)) {
            // Successful login
            response.sendRedirect("Home.html");
			
        } else {
        	PrintWriter out = response.getWriter();
        	out.print("<p style='color:red'> Please try again</p> ");
			RequestDispatcher rd= request.getRequestDispatcher("login.html");
			rd.include(request, response);
        }
	}
	
	private boolean validateLogin(String name, String pass) {
        try {
        	ServletContext context=getServletContext();
            String driver=context.getInitParameter("driver");
            String url=context.getInitParameter("url");
            String username=context.getInitParameter("username");
            String password=context.getInitParameter("password");
			Class.forName(driver);
			Connection connection = DriverManager.getConnection(url, username,password);
            String sql = "SELECT * FROM users WHERE user = ? AND password = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, name);
            statement.setString(2, pass);
            ResultSet result = statement.executeQuery();
            if (result.next()) {
                return true;
            }
            result.close();
            statement.close();
            connection.close();
        } catch (Exception e) {
        	System.out.println(e);
        }
        return false;
    }

}
