package br.com.lelis.teste;

import br.com.lelis.castracao.model.Castracao;
import br.com.lelis.castracao.model.CastracaoDao;

public class TesteListaPorId {

	public static void main(String[] args) {

		CastracaoDao dao = new CastracaoDao();
 		
		dao.finalizarAtendimento("10056960476");// Teste de finalização de atendimento
		Castracao castracao = dao.listar("10056960476");
		
		System.out.println(castracao);
		
	}

}
