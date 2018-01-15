package br.com.lelis.teste;

import java.util.Calendar;

import br.com.lelis.castracao.model.Castracao;

public class TesteModel {

	public static void main(String[] args) {
		
		Castracao castracao = new Castracao();
		castracao.setCpf("10056960476");
		castracao.setNomeDono("Renato");
		castracao.setTelefone("98886169");
		castracao.setEndereco("Rua Lupércio 212");
		castracao.setNomeAnimal("Luke");
		castracao.setEspecieAnimal("Cachorro");
		castracao.setRacaAnimal("Vira-lata");
		castracao.setAtendido(false);
		castracao.setDataAtendimento(Calendar.getInstance());
		castracao.setHoraAtendimento(Calendar.getInstance());
		
		System.out.println(castracao);
	}
	
}
