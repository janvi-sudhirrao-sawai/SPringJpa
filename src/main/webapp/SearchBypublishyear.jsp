<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
<body style="margin-top:35px">
<div class="container">
<h4 class="display-6" style=color:black>Search By Publishing Year -<%=session.getAttribute("publicationyear") %></h4>
<hr>
<table class="table table-bordered table-hover">
<tr>
<th>Title
<th>Author
<th>Language
<th>Description
<th>Price
</tr>
<c:forEach items="${publist}" var="pub" >
<tr>
<td>${pub.title}</td>
<td>${pub.author}</td>
<td>${pub.language}</td>
<td>${pub.description}</td>
<td>${pub.price}</td>
</tr>
</c:forEach>
</table>
<hr>
<a href="/">Home</a>
</div>
</body>
</html>