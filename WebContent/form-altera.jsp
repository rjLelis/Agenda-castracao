<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Alterar castração</title>
	<link rel="stylesheet" href="resources/css/jquery-ui.css" />
	<link rel="stylesheet" href="resources/css/style.css">
	<script src="resources/js/jquery-1.8.2.js"></script>
	<script src="resources/js/jquery-ui.js"></script>
  	<script>
  	$(document).ready(function(e) {
  	    $("#datepicker").datepicker({
  	        dayNamesMin: ['D','S','T','Q','Q','S','S','D'],
  	        dayNamesShort: ['Dom','Seg','Ter','Qua','Qui','Sex','Sáb','Dom'],
  	        dayNames: ['Domingo','Segunda','Terça','Quarta','Quinta','Sexta','Sábado'],
  	        monthNamesShort: ['Jan','Fev','Mar','Abr','Mai','Jun','Jul','Ago','Set','Out','Nov','Dez'],
  	        monthNames: ['Janeiro','Fevereiro','Março','Abril','Maio','Junho','Julho','Agosto','Setembro','Outubro','Novembro','Dezembro'],
  	        dateFormat: 'dd/mm/yy',
  	        nextText: 'Próximo',
  	        prevText: 'Anterior'
  	    });
  	});
  	</script>
</head>
<body>
	<div id="form-castracao">
		<h1>Alterar Castração</h1>
		<div id=form-div>
		<form action="alteraCastracao" method="post">
			<fieldset>
				<legend>Informação do Tutor</legend>
				<label for="cNomeDono">Nome </label><input type="text" id="cNomeDono" name="nomeDono" required value="${castracao.nomeDono}"><br>
				<label for="cTelefone">Telefone </label><input type="text" id="cTelefone" name="telefone" placeholder="Sem pontuação" size="11" maxlength="8" required value="${castracao.telefone}"><br>
				<label for="cEndereco">Endereço </label><input type="text" id="cEndereco" name="endereco" size="50" placeholder="Nome da rua e numero da casa" required value="${castracao.endereco}"> <br>
			</fieldset>
			<fieldset>
				<legend>Informação do animal</legend>
				<label for="cNomeAnimal">Nome </label><input type="text" id="cNomeAnimal" name="nomeAnimal" value="${castracao.nomeAnimal}" required><br>
				<label for="cEspecieAnimal">Espécie </label>
				<select name="especieAnimal" id="cEspecieAnimal">
					<option value="${castracao.especieAnimal}">${castracao.especieAnimal}</option>
					<option value="Cachorro">Cachorro</option>
					<option value="Gato">Gato</option>
				</select><br>
				<label for="cRacaAnimal">Raça </label><input type="text" id="cRacaAnimal" name="racaAnimal" required value="${castracao.racaAnimal}"><br>
				<label for="datepicker">Data de castração </label><input type="text" id="datepicker" name="dataAtendimento"  value="<fmt:formatDate value="${castracao.dataAtendimento.time}" pattern="dd/MM/yyyy"/>"required><br>
				<label for="cHoraCastracao">Hora da castração</label>
				<select name="horaCastracao" id="cHoraCastracao">
					<option value="<fmt:formatDate value="${castracao.horaAtendimento.time}" pattern="HH:mm"/>"><fmt:formatDate value="${castracao.horaAtendimento.time}" pattern="HH:mm"/></option>
					<option value="07:00">07:00</option>
					<option value="07:30">07:30</option>
					<option value="08:00">08:00</option>
					<option value="08:30">08:30</option>
					<option value="09:00">09:00</option>
					<option value="09:30">09:30</option>
					<option value="10:00">10:00</option>
					<option value="10:30">10:30</option>
					<option value="11:00">11:00</option>
					<option value="11:30">11:30</option>
				</select> <br>
				<label for="cAtendido">Atendido </label><input type="checkbox" id="cAtendimento" name="atendido" value="true" ${castracao.atendido ? 'checked' : '' }>
				<br>
			</fieldset>
			<input type="submit" value="ALTERAR" id="botao">
			<input type="hidden" name="cpf" value="${castracao.cpf}"><br>
		</form>
		<a href="listaCastracao">cancelar</a>
		</div>
	</div>
</body>
</html>