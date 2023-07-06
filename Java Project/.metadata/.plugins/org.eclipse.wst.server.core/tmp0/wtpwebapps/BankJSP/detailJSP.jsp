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
try {		
	Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/igt", "root", "1234");
    PreparedStatement stmt = con.prepareStatement("SELECT * FROM bank WHERE accNo=? OR phone=? OR aadhar=?");
    stmt.setInt(1, num);
    stmt.setInt(2, num);
    stmt.setInt(3, num);
    ResultSet rs = stmt.executeQuery();
	if (rs.next()) {
        out.print("<div style=\"max-width: 400px; text-align:center; margin: 0 auto; padding: 40px; background-color: #ffffff; border-radius: 5px; box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);\">");
		out.print("<h3 style=\"text-align: center; color: #333333;\">Your details are -</h3>");
		out.print("<p>ID : "+rs.getInt("id")+"</p>");
		out.print("<p>Name :  "+rs.getString("name")+"</p>");
		out.print("<p>Account Number : "+rs.getInt("accno")+"</p>");
		out.print("<p>IFSC Code : "+rs.getString("ifsc")+"</p>");
		out.print("<p>PAN Number : "+rs.getInt("pan")+"</p>");
		out.print("<p>Phone : "+rs.getInt("Phone")+"</p>");
		out.print("<p>Adhar: "+rs.getInt("Aadhar")+"</p>");
		out.print("<p>Balance : Rs. "+rs.getInt("Balance")+"</p>");
		out.print("<br><a href='Home.html'>Back to HOME<br><br></a></div><br><br>");
        
    } else {
        out.print("<p>No record found ! </p>");
    }
	
	
}
catch (Exception e) {
System.out.println(e);
}
%>
</body>
</html>