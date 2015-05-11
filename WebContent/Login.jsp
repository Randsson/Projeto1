<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="bootstrap/css/bootstrap-theme.min.css">
<link rel="stylesheet" href="bootstrap/css/datepicker.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<script src="bootstrap/js/bootstrap.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>
 <c:import url="Visao/header.html"></c:import>

 
 <form class="form-horizontal"  action ="/Projeto1/LogionUsuario.jsp">
 <fieldset align = "center">
  <legend>Login</legend>
  
   <!-- Text input-->
   <div class="control-group">
    <label class="control-label" for="nome">Usuário:</label>
    <div class="controls">
     <input id="nome" name="nome" type="text" placeholder="digite o login"
      class="input-xlarge">

    </div>
   </div>
   <!-- Text input-->
   <div class="control-group">
    <label class="control-label" for="nome">Senha:</label>
    <div class="controls">
     <input id="nome" name="nome" type="password" placeholder="digite a senha"
      class="input-xlarge">
   
    </div>
   </div>
   
   
 

   
   
   <div class="control-group">
    <label class="control-label" for="submit"> </label>
    <div class="controls">
     <button id="submit" name="logar" class="btn btn-primary">Entrar <br></button>
    <h1></h1><BR> <!-- SÓ PRA O FOOTER FICAR EM BAIXO-->
    </div>
    <label class="control-label" for="submit"> </label><BR> <!-- SÓ PRA O FOOTER FICAR EM BAIXO-->
	<h1></h1><BR> <!-- SÓ PRA O FOOTER FICAR EM BAIXO-->
   </div>

 </fieldset>
  </form>



 <c:import url="Visao/footer.jsp"></c:import>
</body>
</html>