<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Formular</title>
</head>
<body>
	<form action = "firstServlet" method = "post">
    	<label>First Name  :</label><input type = "text" name = "username" class = "box"/><br /><br />
        <label>Last Name  :</label><input type = "text" name = "password" class = "box" /><br/><br />
        <input type = "submit" value = " Submit "/><br />
	</form>
</body>
</html>