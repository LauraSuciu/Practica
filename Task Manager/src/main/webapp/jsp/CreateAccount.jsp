<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Create a new account</title>
</head>
<body>
	<form action="CreateAccount" method="POST">
			<fieldset>
				<legend>New Account:</legend>
				mail:<br> 
				<input type="text" name="mail"><br> 
				Username:<br> 
				<input type="text" name="username"><br>
				Password:<br> 
				<input type="text" name="password"><br> 
				Repeat Password:<br> 
				<input type="text" name="repeatpassword"><br>
				<br> <input type="submit" value="Create">
			</fieldset>
	</form>
</body>
</html>