<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="bootstrap/css/bootstrap-theme.min.css">
<link rel="stylesheet" href="bootstrap/css/datepicker.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<script src="bootstrap/js/bootstrap.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Contate-nos</title>
</head>
<body>
<c:import url="Visao/header.html"></c:import>

<h1 align = "center">Entre em contato com nossos corretores</h1>
<form class="form-inline" role="form" align = "center">
<div class="control-group">
    <label class="control-label" for="text">Digite a mensagem abaixo:</label>
    <div class="controls">
     <textarea id="text" name="text"  rows="7" cols="50"></textarea><br>
    </div>
   </div>
                         <BR><input type="text" placeholder="Insira seu Email" class="form-control">
                            <button class="btn btn-primary" type="button">Enviar!</button></form>
                            <br>
                            <BR>
                            <BR>
                            <BR>
                            <BR>


<c:import url="Visao/footer.jsp"></c:import>
</body>
</html>