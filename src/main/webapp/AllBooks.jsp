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
<h1 class="display-4">All Book List</h1>
<hr>
<table class="table table-bordered table-hover">
<tr>
<th>Book ID
<th>Isbn
<th>Title
<th>Author
<th>Genre
<th>Publication yrs
<th>Language
<th>Description
<th>Price 
<th>pages
</tr>
<c:forEach items="${booklist}" var="booklist" >
<tr>
<td>${booklist.bookid}</td>
<td>${booklist.isbn}</td>
<td>${booklist.title}</td>
<td>${booklist.author}</td>
<td>${booklist.genre}</td>
<td>${booklist.publicationyear}</td>
<td>${booklist.language}</td>
<td>${booklist.description}</td>
<td>${booklist.price}</td>
<td>${booklist.pages}</td>
</tr>
</c:forEach>
</table>
<hr>
<a href="/">Home</a>
</div>
</body>
</html>