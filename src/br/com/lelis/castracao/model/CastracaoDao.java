package br.com.lelis.castracao.model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;

import br.com.lelis.castracao.ConnectionFactory;

public class CastracaoDao {
	
	Connection conn = new ConnectionFactory().getConnection();
	
	public void adiciona(Castracao castracao) {
		String sql = "INSERT INTO "
				+ "castracao(cpf, nome_dono, telefone, endereco, nome_animal, especie_animal, raca_animal, atendido, dataAtendimento, horaAtendimento)"
				+ "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		try {
			PreparedStatement psmt = conn.prepareStatement(sql);
			
			psmt.setString(1, castracao.getCpf());
			psmt.setString(2, castracao.getNomeDono());
			psmt.setString(3, castracao.getTelefone());
			psmt.setString(4, castracao.getEndereco());
			psmt.setString(5, castracao.getNomeAnimal());
			psmt.setString(6, castracao.getEspecieAnimal());
			psmt.setString(7, castracao.getRacaAnimal());
			psmt.setBoolean(8, castracao.isAtendido());
			psmt.setDate(9, new Date(castracao.getDataAtendimento().getTimeInMillis()));
			psmt.setTimestamp(10, new Timestamp(castracao.getHoraAtendimento().getInstance().getTimeInMillis()));
			
			psmt.execute();
			
			psmt.close();
			conn.close();
		}catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}

}
