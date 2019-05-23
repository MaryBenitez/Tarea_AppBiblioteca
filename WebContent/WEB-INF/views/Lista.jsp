<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>LIBROS</title>
</head>
<body>
	<h1>hay <c:out value="${Total_Existencia_L}"></c:out> libros en existencia, y <c:out value="${Cantidad_Autores}"></c:out> cantidad de autores diferentes</h1><br><br>
	<table>
		<tr>
			<th>TITULO</th>
			<th>AUTOR</th>
			<th>ISBN</th>
			<th>GENERO</th>
			<th>EXISTENCIAS</th>
		</tr>
		<!-- OBTIENE LA LISTA -->
		<c:forEach items="${libros}" var="libros">
		<tr>
			<td>${libros.titulo}</td>
			<td>${libros.autor}</td>
			<td>${libros.isbn}</td>
			<td>${libros.genero}</td>
			<td>${libros.cant_exist}</td>
		</tr>
		</c:forEach>
	</table>

</body>
</html>