<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.sql.*" 
import="java.io.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>BANK</title>
</head>
<body>
<%
int num = Integer.parseInt(request.getParameter("num"));
int amt = Integer.parseInt(request.getParameter("amt"));

try {
	Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/igt", "root", "1234");
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

            out.print("<div style=\"max-width: 400px; text-align:center; margin: 0 auto; padding: 40px; background-color: #ffffff; border-radius: 5px; box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);\">");
            out.print("<h4 style=\"text-align: center; color: #333333;\">Amount Withdrawn Successfully!</h4>");
            out.print("<br><a href='Home.html'>Back to HOME<br><br></a></div><br><br>");
        } else {
            // Insufficient balance
            out.print("<div style=\"max-width: 400px; text-align:center; margin: 0 auto; padding: 40px; background-color: #ffffff; border-radius: 5px; box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);\">");
            out.print("<h4 style=\"text-align: center; color: #333333;\">Insufficient Balance</h4>");
            out.print("<br><a href='Home.html'>Back to HOME<br><br></a></div><br><br>");
        }
    } else {
        // User does not exist or invalid account number
        out.print("<div style=\"max-width: 400px; text-align:center; margin: 0 auto; padding: 40px; background-color: #ffffff; border-radius: 5px; box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);\">");
        out.print("<h4 style=\"text-align: center; color: #333333;\">User does not exist or invalid account number</h4>");
        out.print("<br><a href='Home.html'>Back to HOME<br><br></a></div><br><br>");
    }
} catch (Exception e) {
    System.out.println(e);
}
%>
</body>
</html>