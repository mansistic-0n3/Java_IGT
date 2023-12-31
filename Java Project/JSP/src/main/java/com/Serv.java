package com;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Serv
 */
public class Serv extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Serv() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			ServletConfig config = getServletConfig();
			String driver = config.getInitParameter("driver");
			String url = config.getInitParameter("url");
			String username = config.getInitParameter("username");
			String pass = config.getInitParameter("pass");
			Class.forName(driver);
			System.out.println("Driver loaded...");
			Connection con = DriverManager.getConnection(url, username,pass);
			Statement stmt = con.createStatement();
			stmt.execute("Insert into users values('Hello', 'ABC123')");
			System.out.println("Data inserted successfully!!");
			stmt.close();
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
