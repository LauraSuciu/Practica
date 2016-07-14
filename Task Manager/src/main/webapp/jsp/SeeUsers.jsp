

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ page import="java.io.*,java.util.*,java.sql.*"%>
<%@ page import="javax.servlet.http.*,javax.servlet.*" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<sql:setDataSource var="snapshot" driver="com.mysql.jdbc.Driver"
     url="jdbc:mysql://localhost/task_manager"
     user="root"  password="pass123"/>
 
<sql:query dataSource="${snapshot}" var="result">
SELECT * from Users;
</sql:query>
 
<table border="1" width="100%">
<tr>
   <th>id</th>
   <th>Username</th>
   <th>mail</th>
   <th>Role</th>
</tr>
<c:forEach var="row" items="${result.rows}">
<tr>
   <td><c:out value="${row.id_user}"/></td>
   <td><c:out value="${row.username}"/></td>
   <td><c:out value="${row.mail}"/></td>
   <td><c:out value="${row.id_role}"/></td>
</tr>
</c:forEach>
</table>
</body>
</html>