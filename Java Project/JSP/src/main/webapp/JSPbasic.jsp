<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import ="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome to JSP Page!</h1>
<%!
	int a =100;
	int b =200;
	String f;
	String l;
	String name;
	int id;
	int age;
	int sal;
	String desig;
%>
<%
int c =a+b;
f=request.getParameter("fname");
l=request.getParameter("lname");
id=sal=Integer.parseInt(request.getParameter("id"));
sal=Integer.parseInt(request.getParameter("sal"));
age=Integer.parseInt(request.getParameter("age"));
desig=request.getParameter("d");
name = f+" "+l;

try {		
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/igt","root", "1234");
	PreparedStatement pstmt=con.prepareStatement("insert into employee values(?,?,?,?,?)");
		
		pstmt.setInt(1, id);
		pstmt.setString(2, f);
		pstmt.setInt(3, age);
		pstmt.setInt(4, sal);
		pstmt.setString(5, desig);
		pstmt.execute();
out.println("data inserted sucessfully...!");
}

catch (Exception e) {
System.out.println(e);
}

%>
<h1 style="color:red">Sum of A + B :<%= c %></h1>	
	<h1 style="color:red">Full Name :<%= name %></h1>
	<h1>Id :<%= id %></h1>
</body>
</html>