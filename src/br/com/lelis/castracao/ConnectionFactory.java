package br.com.lelis.castracao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	private String DATA_BASE = "castracao";
	private String URL = "jdbc:mysql://localhost/" + DATA_BASE;
	private String USER = "root";
	private String PASSWORD = "123456";

	public Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
		} catch (ClassNotFoundException | SQLException e) {
			throw new RuntimeException(e);
		}

		return conn;
	}

}
