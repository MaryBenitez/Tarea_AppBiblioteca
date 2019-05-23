<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %> 
<%String criterio = request.getParameter("seleccionar"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>RESULTADO DE LBUSQUEDA</title>
</head>
<body>
	<h1>Se encontraron <c:out value="${Cantidad_Entidades}"></c:out> resultados para <c:out value="${buscar}"></c:out> en <%=criterio%></h1><br><br>
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