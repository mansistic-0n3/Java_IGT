<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.sql.*" 
import="java.io.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Forgot Password</title>
</head>
<body>
<%
String uname = request.getParameter("name");
String pass = request.getParameter("pass");

try {		
	Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/igt", "root", "1234");
    PreparedStatement pstmt = con.prepareStatement("SELECT * FROM users WHERE user=?");
       pstmt.setString(1, uname);
       ResultSet rs = pstmt.executeQuery();

       if (rs.next()) {
           // User exists, update the password
           PreparedStatement updateStmt = con.prepareStatement("UPDATE users SET password=? WHERE user=?");
           updateStmt.setString(1, pass);
           updateStmt.setString(2, uname);
           updateStmt.executeUpdate();
           updateStmt.close();

           out.print("<div style=\"max-width: 400px; text-align:center; margin: 0 auto; padding: 40px; background-color: #ffffff; border-radius: 5px; box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);\">");
           out.print("<h4 style=\"text-align: center; color: #333333;\">Password Changed Successfully!</h4>");
           out.print("<br><a href='login.html'>LOGIN<br><br></a></div><br><br>");
       } else {
           // User does not exist, redirect to another page
           response.sendRedirect("noUser.html");
       }

       rs.close();
       pstmt.close();
       con.close();
   } catch (Exception e) {
       System.out.println(e);
   }
%>
</body>
</html>