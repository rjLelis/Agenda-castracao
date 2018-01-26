<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Castrações</title>
<link rel="stylesheet" href="resources/css/style.css">
</head>
<body>
<div id="form-castracao">
	<h1>Castrações agendadas</h1>
	<table border="1">
		<tr>
			<th>CPF</th>
			<th>Nome do tutor</th>
			<th>Nome do animal</th>
			<th>Espécie do animal</th>
			<th>Raça do animal</th>
			<th>Data do atendimento</th>
			<th>Hora do atendimento</th>
			<th>Atendido?</th>
		</tr>
		<c:forEach items="${castracoes}" var="castracao">
		<tr>
			<td>${castracao.cpf}</td>
			<td>${castracao.nomeDono}</td>
			<td>${castracao.nomeAnimal}</td>
			<td>${castracao.especieAnimal}</td>
			<td>${castracao.racaAnimal}</td>
			<td><fmt:formatDate value="${castracao.dataAtendimento.time}" pattern="dd/MM/yyyy"/></td>
			<td><fmt:formatDate value="${castracao.horaAtendimento.time}" pattern="HH:mm"/></td>
			<td>
				<c:if test="${castracao.atendido eq false}">
					<a href="finalizaAtendimento?cpf=${castracao.cpf}">Finalizar</a>		
				</c:if>
				<c:if test="${castracao.atendido eq true}">
					Atendido
				</c:if>
			</td>
			<td><a href="removeCastracao?cpf=${castracao.cpf}">Remover</a></td>
			<td><a href="redirecionaController?cpf=${castracao.cpf}">Alterar</a></td>
		</tr>
		</c:forEach>
	</table><br>
	<form action="redirecionaController">
		<input type="submit" value="Agendar uma castração">
		<input type="hidden" name="cpf" value=""/>
	</form>
</div>
</body>
</html>