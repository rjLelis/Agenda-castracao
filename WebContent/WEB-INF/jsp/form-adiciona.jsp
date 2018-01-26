<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Agendamento de castração</title>
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
		<h1>Formulário de Castração</h1>
		<div id=form-div>
		<form action="adicionaCastracao" method="post">
			<fieldset>
				<legend>Informação do Tutor</legend>
				<label for="cCpf">CPF </label><input type="text" id="cCpf" name="cpf" size="11" maxlength="11" placeholder="Sem pontuação" required><br>
				<label for="cNomeDono">Nome </label><input type="text" id="cNomeDono" name="nomeDono" required><br>
				<label for="cTelefone">Telefone </label><input type="text" id="cTelefone" name="telefone" placeholder="Sem pontuação" size="11" maxlength="8" required><br>
				<label for="cEndereco">Endereço </label><input type="text" id="cEndereco" name="endereco" size="50" placeholder="Nome da rua e numero da casa" required> <br>
			</fieldset>
			<fieldset>
				<legend>Informação do animal</legend>
				<label for="cNomeAnimal">Nome </label><input type="text" id="cNomeAnimal" name="nomeAnimal" required><br>
				<label for="cEspecieAnimal">Espécie </label>
				<select name="especieAnimal" id="cEspecieAnimal">
					<option value="Cachorro">Cachorro</option>
					<option value="Gato">Gato</option>
				</select><br>
				<label for="cRacaAnimal">Raça </label><input type="text" id="cRacaAnimal" name="racaAnimal" required><br>
				<label for="datepicker">Data de castração </label><input type="text" id="datepicker" name="dataAtendimento" required><br>
				<label for="cHoraCastracao">Hora da castração</label>
				<select name="horaCastracao" id="cHoraCastracao">
					<option value="07:00">07:00</option>
					<option value="07:30">07:30</option>
					<option value="08:00">07:00</option>
					<option value="08:30">08:30</option>
					<option value="09:00">09:00</option>
					<option value="09:30">09:30</option>
					<option value="10:00">10:00</option>
					<option value="10:30">10:30</option>
					<option value="11:00">11:00</option>
					<option value="11:30">11:30</option>
				</select>
				<br>
			</fieldset>
			<input type="submit" value="AGENDAR" id="botao">
		</form>
		<a href="listaCastracao">cancelar</a>
		</div>
	</div>
</body>
</html>