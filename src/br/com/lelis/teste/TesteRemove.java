package br.com.lelis.teste;

import br.com.lelis.castracao.model.CastracaoDao;

public class TesteRemove {

	public static void main(String[] args) {
		CastracaoDao dao = new CastracaoDao();
		dao.remove("10056960476");
		
		System.out.println("Castração removida com sucesso");

	}

}
