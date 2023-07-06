<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>BANK</title>
</head>
<body style="background-color: #f2f2f2; text-align:center;">
    <div style="max-width: 400px; margin: 0 auto; padding: 40px; background-color: #ffffff; border-radius: 5px; box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);">
        <h2 style="text-align: center; color: #333333;">LOGIN</h2>
        <%
            String name = request.getParameter("name");
            String pass = request.getParameter("pass");
            
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/igt", "root", "1234");
                String sql = "SELECT * FROM users WHERE user = ? AND password = ?";
                PreparedStatement statement = connection.prepareStatement(sql);
                statement.setString(1, name);
                statement.setString(2, pass);
                ResultSet result = statement.executeQuery();
                if (result.next()) {
                    // Successful login
                    response.sendRedirect("Home.html");
                } else {
                    out.print("<p style='color:red'> Please try again</p> ");
                    request.getRequestDispatcher("login.html").include(request, response);
                }
                result.close();
                statement.close();
                connection.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        %>
    </div>
</body>
</html>