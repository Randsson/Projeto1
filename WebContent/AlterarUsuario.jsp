<%@page import="modelo.vo.UsuarioVO" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="pt-br">
<head>
<meta charset="utf-8">
<title>Alterar dados do Usuário</title>
</head>
<body>
	<%
	UsuarioVO usuarioVO = new UsuarioVO();
	usuarioVO = (UsuarioVO) request.getAttribute("usuarioVO");
	
	%>
	<fieldset style="width: 100px;">
	<legend>Aterar Cadastro</legend>
		<form name="form1" action="AlterarSalvarUsuario" method="post">
			<table>
				<tr>
					<td>ID:</td>
					<td><input readonly type="text" name="txtId" value="<%=usuarioVO.getId()%>" /></td>
				</tr>
				<tr>
					<td>Nome:</td>
					<td><input type="text" name="txtNome" value="<%=usuarioVO.getNome()%>" /></td>
				</tr>
				<tr>
					<td>CPF:</td>
					<td><input type="text" name="txtCpf" value="<%=usuarioVO.getCpf()%>"/></td>
				</tr>
				<tr>
					<td>Endereço:</td>
					<td><input type="text" name="txtEndereco" value="<%=usuarioVO.getEndereco()%>"/></td>
				</tr>
				<tr>
					<td>Senha:</td>
					<td><input type="password" name="txtSenha" value="<%=usuarioVO.getSenha()%>"/></td>
				</tr>
				<tr>
					<td></td>
					<td><input type="submit" name="btnAlterar" value="Atualizar Cadastro" /> <a href="/Projeto1/visao/index.jsp" style="text-decoration: none"><input type="button" name="btnCancelar" value="Cancelar" /></a></td>
				</tr>
				<tr>
					<td>Mensagem:</td>
					<td><%if(request.getAttribute("erro") != ""){
						out.print(request.getAttribute("erro"));
					} %></td>
				</tr>
			</table>
		</form>
	</fieldset>
</body>
</html>