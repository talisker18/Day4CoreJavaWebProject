<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

	<head>
		<meta charset="ISO-8859-1">
		<title>Insert title here</title>
		<link rel="stylesheet" href="${pageContext.request.contextPath}/css/register_style.css" />
</head>

	<body>
		<span class="hr5">Register Page</span>
		<p>Please fill in all fields to register</p>
		<form action="RegisterServlet" method="post">
			<input type="radio" id="male" name="gender" value="male" checked/>
			<label for="male">Male</label>
			<input type="radio" id="female" name="gender" value="female"/>
			<label for="female">Female</label><br><br>
			
			<input type="text" name="firstname" placeholder="Enter firstname"/>
			<input type="text" name="lastname" placeholder="Enter lastname"/><br><br>
			
			<input type="text" name="email" placeholder="Enter email address"/><br><br>
			
			<p>What kind of programming languages do you know?</p>
			<div>
			  <input type="checkbox" id="java" name="programming_language" value="Java">
			  <label for="java">Java</label>
			</div>
			
			<div>
			  <input type="checkbox" id="python" name="programming_language" value="Python">
			  <label for="python">Python</label>
			</div>
			
			<div>
			  <input type="checkbox" id="c" name="programming_language" value="C">
			  <label for="c">C</label>
			</div>
			
			<div>
			  <input type="checkbox" id="c++" name="programming_language" value="C++">
			  <label for="c++">C++</label>
			</div>
			
			<div>
			  <input type="checkbox" id="javascript" name="programming_language" value="JavaScript">
			  <label for="javascript">JavaScript</label>
			</div>
			
			<div>
			  <input type="checkbox" id="php" name="programming_language" value="PHP">
			  <label for="php">PHP</label>
			</div>
			
			<br><br>
			
			<input type="text" name="username" placeholder="Enter username"/>
			<input type="password" name="password" minlength="8" placeholder="Enter password" required><br><br>
			
			<label for="date_of_birth">Date of Birth:</label>
			<input type="date" id="date_of_birth" name="date-of-birth" value="2000-01-01" min="1900-01-01" max="2099-12-31"/><br><br>
			
			<button type="submit">Register</button>
			<button type="reset">Clear</button>
			
		</form>
	</body>
</html>