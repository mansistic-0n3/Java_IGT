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
String name = request.getParameter("name");
String pass = request.getParameter("pass");

try {		
	Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/igt", "root", "1234");
    PreparedStatement pstmt=con.prepareStatement("insert into Users values(?,?)");
		
		pstmt.setString(1, name);
		pstmt.setString(2, pass);
		pstmt.execute();
		
		out.print("<div style=\"max-width: 400px; text-align:center; margin: 0 auto; padding: 40px; background-color: #ffffff; border-radius: 5px; box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);\">");
		out.print("<h3 style=\"text-align: center; color: #333333;\">Registered Successfully!</h3>");
		
out.print("<a href='login.html'>Login Now</a></div>");
}

catch (Exception e) {
System.out.println(e);
}
%>
</body>
</html>