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
    PreparedStatement pstmt=con.prepareStatement("update Bank set Balance = Balance +? where accNo =? or phone =? or aadhar =?");

	pstmt.setInt(1, amt);
	pstmt.setInt(2, num);
	pstmt.setInt(3, num);
	pstmt.setInt(4, num);
	pstmt.execute();
		
out.print("<div style=\"max-width: 400px; text-align:center; margin: 0 auto; padding: 40px; background-color: #ffffff; border-radius: 5px; box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);\">");
out.print("<h4 style=\"text-align: center; color: #333333;\">Amount Deposited Successfully!</h4>");
out.print("<br><a href='Home.html'>Back to HOME<br><br></a></div><br><br>");

}
catch (Exception e) {
System.out.println(e);
}
%>
</body>
</html>