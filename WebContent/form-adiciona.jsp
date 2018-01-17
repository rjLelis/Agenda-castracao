<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Agendamento de castração</title>
	<link rel="stylesheet" href="../resources/estilo.css">
</head>
<body>
	<div id="form-castracao">
		<h1>Formulário de Castração</h1>
		<form action="adicionaCastracao" method="post">
			<fieldset>
				<legend>Informação do Dono</legend>
				<label for="cCpf">CPF </label><input type="text" id="cCpf" name="cpf" size="11" maxlength="11" placeholder="sem pontuação"><br>
				<label for="cNomeDono">Nome </label><input type="text" id="cNomeDono" name="nomeDono"><br>
				<label for="cTelefone">Telefone </label><input type="text" id="cTelefone" name="telefone" placeholder="sem pontuação" size="8" maxlength="8"><br>
				<label for="cEndereco">Endereço </label><input type="text" id="cEndereco" name="endereco" size="50" placeholder="nome da rua e numero da casa"> <br>
			</fieldset>
			<fieldset>
				<legend>Informação do animal</legend>
				<label for="cNomeAnimal">Nome </label><input type="text" id="cNomeAnimal" name="nomeAnimal"><br>
				<label for="cEspecieAnimal">Espécie </label>
				<select name="especieAnimal" id="cEspecieAnimal">
					<option value="Cachorro">Cachorro</option>
					<option value="Gato">Gato</option>
				</select><br>
				<label for="cRacaAnimal">Raça </label><input type="text" id="cRacaAnimal" name="racaAnimal"><br>
				<label for="cDataAtendimento">Data e castração </label><input type="text" id="cDataAtendimento" name="dataAtendimento"><br>
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
			</fieldset><br>
			<input type="submit" value="AGENDAR" id="botao">
		</form>
	</div>
</body>
</html>