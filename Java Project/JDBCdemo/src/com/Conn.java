package com;

import java.sql.*;

public class Conn {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded...");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/igt", "root","1234");
			Statement stmt = con.createStatement();
			stmt.execute("Insert into emp values(101, 'ABC')");
			System.out.println("Data inserted successfully!!");
			stmt.close();
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
