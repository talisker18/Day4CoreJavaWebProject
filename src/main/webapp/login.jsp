<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Insert title here</title>
</head>
	<body>
		<h3>Login Page</h3>
		<form action="LoginServlet" method="post">
			<input type="text" name="username" placeholder="Enter username"/>
			<input type="text" name="password" placeholder="Enter password"/>
			<button type="submit">Login</button>
			<button type="reset">Clear</button>
		</form>
	</body>
</html>