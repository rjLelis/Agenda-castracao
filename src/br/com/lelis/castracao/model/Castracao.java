package br.com.lelis.castracao.model;

import java.util.Calendar;

public class Castracao {

	private String cpf;
	private String nomeDono;
	private String telefone;
	private String endereco;
	private String nomeAnimal;
	private String especieAnimal;
	private String racaAnimal;
	private boolean atendido;
	private Calendar dataAtendimento;
	private Calendar horaAtendimento;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNomeDono() {
		return nomeDono;
	}

	public void setNomeDono(String nomeDono) {
		this.nomeDono = nomeDono.trim();
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getNomeAnimal() {
		return nomeAnimal.trim();
	}

	public void setNomeAnimal(String nomeAnimal) {
		this.nomeAnimal = nomeAnimal;
	}

	public String getEspecieAnimal() {
		return especieAnimal;
	}

	public void setEspecieAnimal(String especieAnimal) {
		this.especieAnimal = especieAnimal;
	}

	public String getRacaAnimal() {
		return racaAnimal;
	}

	public void setRacaAnimal(String racaAnimal) {
		this.racaAnimal = racaAnimal;
	}

	public boolean isAtendido() {
		return atendido;
	}

	public void setAtendido(boolean atendido) {
		this.atendido = atendido;
	}

	public Calendar getDataAtendimento() {
		return dataAtendimento;
	}

	public void setDataAtendimento(Calendar dataAtendimento) {
		this.dataAtendimento = dataAtendimento;
	}

	public Calendar getHoraAtendimento() {
		return horaAtendimento;
	}

	public void setHoraAtendimento(Calendar horaAtendimento) {
		this.horaAtendimento = horaAtendimento;
	}
	
	@Override
	public String toString() {
		return "Castracao [cpf=" + cpf + ", nomeDono=" + nomeDono + ", telefone=" + telefone + ", Endereco=" + endereco
				+ ", nomeAnimal=" + nomeAnimal + ", especieAnimal=" + especieAnimal + ", racaAnimal=" + racaAnimal
				+ ", atendido=" + atendido + ", dataAtendimento=" + dataAtendimento + ", horaAtendimento="
				+ horaAtendimento + "]";
	}

}
