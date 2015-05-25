<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="bootstrap/css/bootstrap-theme.min.css">
<link rel="stylesheet" href="bootstrap/css/datepicker.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<script src="bootstrap/js/bootstrap.min.js"></script>
<meta charset="ISO-8859-1">
<title>If All Houses</title>
</head>
<body>
	<!-- <jsp:useBean id="usuario" class="modelo.vo.UsuarioVO" scope="application"/>
	<jsp:setProperty property="tipo" name="usuario" value="${param.tipo}"/> -->
	<c:import url="Visao/headerCorretor.jsp"></c:import>

	<div class="container-fluid">

	<c:import url="carousel.html"></c:import>

	</div>
	<br>
	<c:import url="Visao/footer.jsp"></c:import>
</body>
</html>