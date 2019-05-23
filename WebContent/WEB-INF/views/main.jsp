<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>BIBLIOTECA</title>
</head>
<body>
	<h1>BIBLIOTECA</h1>
	<form:form action="${pageContext.request.contextPath}/BuscarLibro" method="POST">
		<label>Buscar libro por:</label>
		<select name="seleccionar">
			<option value="Seleccione">Seleccione</option>
			<option value="Autor">Autor</option>
			<option value="ISBN">ISBN</option>
			<option value="Genero">Genero</option>
		</select>
		<br><br>
		<input type="text" name="buscar">
		<input type="submit" value="Buscar">
	<br><br>
	</form:form>
	<form:form action="${pageContext.request.contextPath}/BTodos" method="POST">
		<input type="submit" value="Ver Todos">
	</form:form>
</body>
</html>