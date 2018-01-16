package br.com.lelis.teste;

import java.util.List;

import br.com.lelis.castracao.model.Castracao;
import br.com.lelis.castracao.model.CastracaoDao;

public class TesteListar {

	public static void main(String[] args) {

		CastracaoDao dao = new CastracaoDao();
		
		List<Castracao> castracoes = dao.listar();
		
		for (Castracao castracao : castracoes) {
			System.out.println("CPF: " + castracao.getCpf() + "\nNome do dono: " + castracao.getNomeDono());
		}
		
	}

}
