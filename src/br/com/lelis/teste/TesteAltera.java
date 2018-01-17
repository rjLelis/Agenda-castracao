package br.com.lelis.teste;

import java.util.Calendar;

import br.com.lelis.castracao.model.Castracao;
import br.com.lelis.castracao.model.CastracaoDao;

public class TesteAltera {

	public static void main(String[] args) {
		Castracao castracao = new Castracao();
		castracao.setCpf("10056960476");
		castracao.setNomeDono("Renato Lelis");
		castracao.setTelefone("98886169");
		castracao.setEndereco("Rua Lupércio 212");
		castracao.setNomeAnimal("Luke");
		castracao.setEspecieAnimal("Cachorro");
		castracao.setRacaAnimal("Vira-lata");
		castracao.setAtendido(false);
		castracao.setDataAtendimento(Calendar.getInstance());
		castracao.setHoraAtendimento(Calendar.getInstance());
		
		CastracaoDao dao = new CastracaoDao();
		dao.altera(castracao);

	}

}
