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

public class draw extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public draw() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int num = Integer.parseInt(request.getParameter("num"));
        int amt = Integer.parseInt(request.getParameter("amt"));

        try {
            ServletContext context = getServletContext();
            String driver = context.getInitParameter("driver");
            String url = context.getInitParameter("url");
            String username = context.getInitParameter("username");
            String password = context.getInitParameter("password");
            Class.forName(driver);
            Connection con = DriverManager.getConnection(url, username, password);
            PreparedStatement pstmt = con.prepareStatement("SELECT Balance FROM Bank WHERE accNo=? OR phone=? OR aadhar=?");
            pstmt.setInt(1, num);
            pstmt.setInt(2, num);
            pstmt.setInt(3, num);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                int balance = rs.getInt("Balance");
                if (balance >= amt) {
                    // Sufficient balance, update the balance
                    PreparedStatement updateStmt = con.prepareStatement("UPDATE Bank SET Balance=Balance-? WHERE accNo=? OR phone=? OR aadhar=?");
                    updateStmt.setInt(1, amt);
                    updateStmt.setInt(2, num);
                    updateStmt.setInt(3, num);
                    updateStmt.setInt(4, num);
                    updateStmt.executeUpdate();
                    updateStmt.close();

                    PrintWriter out = response.getWriter();
                    out.print("<div style=\"max-width: 400px; text-align:center; margin: 0 auto; padding: 40px; background-color: #ffffff; border-radius: 5px; box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);\">");
                    out.print("<h4 style=\"text-align: center; color: #333333;\">Amount Withdrawn Successfully!</h4>");
                    out.print("<br><a href='Home.html'>Back to HOME<br><br></a></div><br><br>");
                } else {
                    // Insufficient balance
                    PrintWriter out = response.getWriter();
                    out.print("<div style=\"max-width: 400px; text-align:center; margin: 0 auto; padding: 40px; background-color: #ffffff; border-radius: 5px; box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);\">");
                    out.print("<h4 style=\"text-align: center; color: #333333;\">Insufficient Balance</h4>");
                    out.print("<br><a href='Home.html'>Back to HOME<br><br></a></div><br><br>");
                }
            } else {
                // User does not exist or invalid account number
                PrintWriter out = response.getWriter();
                out.print("<div style=\"max-width: 400px; text-align:center; margin: 0 auto; padding: 40px; background-color: #ffffff; border-radius: 5px; box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);\">");
                out.print("<h4 style=\"text-align: center; color: #333333;\">User does not exist or invalid account number</h4>");
                out.print("<br><a href='Home.html'>Back to HOME<br><br></a></div><br><br>");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
