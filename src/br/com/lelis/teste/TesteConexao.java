package br.com.lelis.teste;

import java.sql.Connection;

import br.com.lelis.castracao.ConnectionFactory;

public class TesteConexao {

	public static void main(String[] args) {
		
		ConnectionFactory cf = new ConnectionFactory();
		Connection conn = cf.getConnection();
		
		if(conn != null) {
			System.out.println("Conexão bem sucedida!");
		} else {
			System.out.println("erro");
		}

	}

}
