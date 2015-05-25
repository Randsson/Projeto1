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
<title>Adicione Imóveis</title>
</head>
<body>
 <c:import url="/Visao/header.html"></c:import>

 
 <form class="form-horizontal">
 <fieldset align = "center">
  <legend>Adicionar Imóvel</legend>
  
   <!-- Text input-->
   <div class="control-group">
    <label class="control-label" for="nome">Digite o Nome do Imóvel:</label>
    <div class="controls">
     <input id="nome" name="txtNome" type="text" placeholder="digite aqui"
      class="input-xlarge">

    </div>
   </div>
  
   <div class="control-group">
    <label class="control-label" for="tipo">Tipo do Imóvel:</label>
    <div class="controls">
     <select id="tipo" name="txtTipo" class="input-xlarge">
      <option>Apartamento</option>
      <option>Casa</option>
      <option>Lote</option>
      <option>Prédio Comercial</option>
     </select>
    </div>
   </div>

   
   <div class="control-group">
    <label class="control-label" for="radio"></label>
    <div class="controls">
    
     <label class="radio" for="radio-0"> <input type="checkbox"
      name="txtEstado" id="checkboxSucess" value="Vender">
      Vender
     </label> <label class="radio" for="radio-1"> <input type="checkbox"
      name="txtEstado" id="checkbox" value="Alugar"> Alugar
     </label>
      
    </div>
   </div>

   
   <div class="control-group" align = "center">
    <label class="control-label" for="button">Imagem: </label>
    <div class="controls">
     <input id="button" name="button" class="input-file" type="file">
    </div>
   </div>

   
   <div class="control-group">
    <label class="control-label" for="text">Observações:</label>
    <div class="controls">
     <textarea id="text" name="textObs"></textarea>
    </div>
   </div>
   
   <div class="control-group">
    <label class="control-label" for="submit"></label>
    <div class="controls">
     <button id="submit" name="submit" class="btn btn-primary">Enviar <br></button>
    </div>
   </div>

 </fieldset>
 </form>

 <c:import url="/Visao/footer.jsp"></c:import>
</body>
</html>