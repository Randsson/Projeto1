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
<title>Formulario de Usuário</title>
</head>
<body>
	<c:import url="Visao/header.html"></c:import>

	<form class="form-horizontal" action="Projeto1/CadastrarUsuarioServlet" method="post">
	<fieldset align = "center">
	
	<legend>Registrar-se</legend>

	
	<div class="control-group">
		<label class="control-label" for="txtNome">Nome:</label>
		<div class="controls">
			<input id="nome" name="nome" type="text" placeholder="insira nome"
				class="input-xlarge">

		</div>
	</div>

	
	<div class="control-group">
		<label class="control-label" for="password">Senha:</label>
		<div class="controls">
			<input id="password" name="txtSenha" type="password"
				placeholder="digite sua senha" class="input-xlarge">

		</div>
	</div>

	
	<div class="control-group">
		<label class="control-label" for="cpf">CPF:</label>
		<div class="controls">
			<input id="cpf" name="txtCpf" type="text" placeholder="digite o cpf"
				class="input-xlarge">

		</div>
	</div>

	
	<div class="control-group">
		<label class="control-label" for="end">Endereço:</label>
		<div class="controls">
			<input id="end" name="txtEndereco" type="text"
				placeholder="digite o endereço" class="input-xlarge">

		</div>
	</div>

	
	/<!-- <div class="control-group">
		<label class="control-label" for="sexo">Sexo:</label>
		<div class="controls">
			<label class="radio" for="sexo-0"> <input type="radio"
				name="sexo" id="sexo-0" value="Masculino" checked="checked">
				Masculino
			</label> <label class="radio" for="sexo-1"> <input type="radio"
				name="sexo" id="sexo-1" value="Feminino"> Feminino
			</label>
		</div>
	</div> -->

	<!-- File Button -->
	<div class="control-group" align = "center">
		<label class="control-label" for="imagem">Imagem de perfil:</label>
		<div class="controls">
			<input id="imagem" name="imagem" class="input-file" type="file">
		</div>
	</div>

	
	<div class="control-group">
		<label class="control-label" for="submit"></label>
		<div class="controls">
			<button id="submit" name="submit" class="btn btn-primary">Enviar</button>
		</div>
	</div>

	</fieldset>
	</form>


	<c:import url="Visao/footer.jsp"></c:import>
</body>
</html>