package br.com.lelis.castracao.model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.lelis.castracao.ConnectionFactory;

public class CastracaoDao {

	private Connection conn = new ConnectionFactory().getConnection();

	public void adiciona(Castracao castracao) {
		String sql = "INSERT INTO "
				+ "castracao(cpf, nome_dono, telefone, endereco, nome_animal, especie_animal, raca_animal, atendido, dataAtendimento, horaAtendimento)"
				+ "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		try {
			PreparedStatement psmt = conn.prepareStatement(sql);

			psmt.setString(1, castracao.getCpf().substring(0, 3) + "." + castracao.getCpf().substring(3, 6) + "."
					+ castracao.getCpf().substring(6, 9) + "-" + castracao.getCpf().substring(9));
			psmt.setString(2, castracao.getNomeDono());
			psmt.setString(3,"9" +  castracao.getTelefone().substring(0, 4) + "-" + castracao.getTelefone().substring(4));
			psmt.setString(4, castracao.getEndereco());
			psmt.setString(5, castracao.getNomeAnimal());
			psmt.setString(6, castracao.getEspecieAnimal());
			psmt.setString(7, castracao.getRacaAnimal());
			psmt.setBoolean(8, false);
			psmt.setDate(9, new Date(castracao.getDataAtendimento().getTimeInMillis()));
			psmt.setTimestamp(10, new Timestamp(castracao.getHoraAtendimento().getTimeInMillis()));

			psmt.execute();

			psmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public List<Castracao> listar() {
		List<Castracao> castracoes = new ArrayList<Castracao>();
		String sql = "SELECT * FROM castracao";
		try {
			PreparedStatement psmt = conn.prepareStatement(sql);
			ResultSet rs = psmt.executeQuery();
			while (rs.next()) {
				Castracao castracao = new Castracao();
				castracao.setCpf(rs.getString("cpf"));
				castracao.setNomeDono(rs.getString("nome_dono"));
				castracao.setTelefone(rs.getString("telefone"));
				castracao.setEndereco(rs.getString("endereco"));
				castracao.setNomeAnimal(rs.getString("nome_animal"));
				castracao.setEspecieAnimal(rs.getString("especie_animal"));
				castracao.setRacaAnimal(rs.getString("raca_animal"));
				castracao.setAtendido(rs.getBoolean("atendido"));

				Calendar data = Calendar.getInstance();
				data.setTime(rs.getDate("dataAtendimento"));
				castracao.setDataAtendimento(data);
				data.setTime(rs.getTime("horaAtendimento"));
				castracao.setHoraAtendimento(data);

				castracoes.add(castracao);
			}

			psmt.close();
			rs.close();

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

		return castracoes;

	}

	public Castracao listar(String cpf) {
		String sql = "SELECT * FROM castracao WHERE cpf=?";
		Castracao castracao = null;
		try {
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, cpf);
			ResultSet rs = psmt.executeQuery();

			if (rs.next()) {
				castracao = new Castracao();
				castracao.setCpf(rs.getString("cpf"));
				castracao.setNomeDono(rs.getString("nome_dono"));
				castracao.setTelefone(rs.getString("telefone"));
				castracao.setEndereco(rs.getString("endereco"));
				castracao.setNomeAnimal(rs.getString("nome_animal"));
				castracao.setEspecieAnimal(rs.getString("especie_animal"));
				castracao.setRacaAnimal(rs.getString("raca_animal"));
				castracao.setAtendido(rs.getBoolean("atendido"));

				Calendar data = Calendar.getInstance();
				data.setTime(rs.getDate("dataAtendimento"));
				castracao.setDataAtendimento(data);
				data.setTime(rs.getTime("horaAtendimento"));
				castracao.setHoraAtendimento(data);

			}
			psmt.close();
			rs.close();

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return castracao;
	}

	public void finalizarAtendimento(String cpf) {
		String sql = "UPDATE castracao SET atendido=? WHERE cpf=?";
		try {
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setBoolean(1, true);
			psmt.setString(2, cpf);

			psmt.execute();

			psmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}

	public void altera(Castracao castracao) {
		String sql = "UPDATE castracao SET nome_dono=?, telefone=?, endereco=?, nome_animal=?,especie_animal=?,raca_animal=?"
				+ ", atendido=?, dataAtendimento=?, horaAtendimento=? WHERE cpf=?";
		try {
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, castracao.getNomeDono());
			psmt.setString(2, castracao.getTelefone());
			psmt.setString(3, castracao.getEndereco());
			psmt.setString(4, castracao.getNomeAnimal());
			psmt.setString(5, castracao.getEspecieAnimal());
			psmt.setString(6, castracao.getRacaAnimal());
			psmt.setBoolean(7, castracao.isAtendido());
			psmt.setDate(8, new Date(castracao.getDataAtendimento().getTimeInMillis()));
			psmt.setTimestamp(9, new Timestamp(castracao.getHoraAtendimento().getTimeInMillis()));
			psmt.setString(10, castracao.getCpf());

			psmt.execute();

			psmt.close();

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}

	public void remove(String cpf) {
		String sql = "DELETE FROM castracao WHERE cpf=?";
		try {
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1,cpf);

			psmt.execute();

			psmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}

}
