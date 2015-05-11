<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Formulario de Usuário</title>
</head>
<body>
<c:import url="header.html"></c:import>

<form action="Apresenta.jsp" method="POST">
Digite o nome: 
<input type="text" name="nome" placeholder="Digite seu nome"><br>
Digite o CPF:
<input type="text" name="cpf" placeholder="Digite seu cpf"><br>
Digite o Endereço: 
<input type="text" name="endereco" placeholder="Digite seu endereço"><br>
Sexo:
<input type="radio" name="sexo" VALUE="Feminino"> Feminino
<input TYPE="radio" name="sexo" VALUE="Masculino"> Masculino<br>
<input type="submit" value="Enviar">


</form>

<c:import url="footer.jsp"></c:import>
</body>
</html>