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
int id = Integer.parseInt(request.getParameter("id"));
String name = request.getParameter("name");
int acc = Integer.parseInt(request.getParameter("acc"));
String ifsc = request.getParameter("ifsc");
String pan = request.getParameter("pan");
int ph = Integer.parseInt(request.getParameter("ph"));
int a = Integer.parseInt(request.getParameter("adhar"));
int ibal = Integer.parseInt(request.getParameter("ibal"));

try {		
	 Class.forName("com.mysql.cj.jdbc.Driver");
     Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/igt", "root", "1234");
     PreparedStatement pstmt=con.prepareStatement("insert into Bank values(?,?,?,?,?,?,?,?)");
		
		pstmt.setInt(1, id);
		pstmt.setString(2, name);
		pstmt.setInt(3, acc);
		pstmt.setString(4, ifsc);
		pstmt.setString(5, pan);
		pstmt.setInt(6, ph);
		pstmt.setInt(7, a);
		pstmt.setInt(8, ibal);
		pstmt.execute();
		
		
}

catch (Exception e) {
System.out.println(e);
}
%>

<div style="max-width: 400px; text-align:center; margin: 0 auto; padding: 40px; background-color: #ffffff; border-radius: 5px; box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);">
<h4 style="text-align: center; color: #333333;">Your details are here-</h4>

ID : <%= id %><br>
NAME : <%= name %><br>
ACCOUNT NUMBER : <%= acc %><br>
IFSC Code : <%= ifsc %><br>
PAN Number :<%= pan %><br>
Phone : <%= ph %><br>
Adhar :<%= a %><br>
Initial Balance : <%= ibal %><br>
<h2>Account created successfully...!</h2>
<br><br><a href='Home.html'>Back to HOME</a>
</div>
</body>
</html>