<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div class="top-bar"
	style="background: url(img/bg.jpg) #222; padding: 30px 0; color: #999;">
	<div class="row">
		<div class="col-md-2"></div>
		<div class="col-md-8">
			<a href="index.jsp"><img src="img/logo.png" height="100"
				width="150"> </a>
		</div>
		<div class="col-md-2">
		<jsp:useBean id="usuario" class="modelo.vo.UsuarioVO"/>	
		</div>
	</div>
	<div class="row-fluid">
		<div class="navbar-collapse  collapse">
			<ul class="nav navbar-nav navbar-right">
				<li><a href="index.jsp" style="color: black">          Home</a></li>
				<li><a href="VerImovel.jsp" style="color: black">      Ver imoveis</a></li>
				<li><a href="CadastroImovel.jsp" style="color: black"> Adicionar Imoveis</a></li>
				<li><a href="Mensagem.jsp" style="color: black">       caixa de entrada</a></li>
				


			</ul>
		</div>
	</div>
</div>