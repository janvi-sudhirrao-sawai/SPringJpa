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
<h1 class="display-4">All Members List</h1>
<hr>
<table class="table table-bordered table-hover table-sm">
<tr>
<th>Member ID
<th>Member Name
<th>Gender
<th>Age
<th>Mobile no
<th>Joining Year
</tr>
<c:forEach items="${memlist}" var="memlist">
<tr>
<td>${memlist.mid}</td>
<td>${memlist.mname}</td>
<td>${memlist.mgender}</td>
<td>${memlist.mage}</td>
<td>${memlist.mmobile}</td>
<td>${memlist.mjoin_year}</td>
</tr>
</c:forEach>
</table>
<a href="/">Home</a>
</div>
</body>
</html>