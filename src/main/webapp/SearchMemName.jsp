<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
<body style="margin-top:35px">
<div class="container">
<h4 class="display-6" style=color:black>Search Member Name By ID -<%=session.getAttribute("mid") %></h4>
<hr>
<table class="table table-bordered table-hover">
<tr>
<th>Member Name
<th>Mobile No
<th>Joining Year
</tr>
<tr>
<td>${mnamelist.mname}</td>
<td>${mnamelist.mmobile}</td>
<td>${mnamelist.mjoin_year}</td>
</tr>
</table>
<hr>
<a href="/">Home</a>
</div>
</body>
</html>