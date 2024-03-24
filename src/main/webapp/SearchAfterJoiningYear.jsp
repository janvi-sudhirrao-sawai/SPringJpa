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
<h1 class="display-6"style=color:black>Search Joining Year  - <%=session.getAttribute("mjoinyear") %></h1>
<hr>
<table class="table table-bordered table-hover table-sm "style="width:200px">
<tr>
<th>Member Name
<th>Mobile No
</tr>
<c:forEach items="${yearlist}" var="year">
<tr>
<td>${year.mname}</td>
<td>${year.mmobile}</td>
</tr>
</c:forEach>
</table>
<hr>
<a href="/">Home</a>
</div>
</body>
</html>