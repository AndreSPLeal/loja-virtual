package br.com.dev.jdbc;

import java.sql.Connection;
import java.sql.SQLException;

public class TestaConexao {

	public static void main(String[] args) throws SQLException {
		
		Connection connection = new ConnectionPool().getConnection();
		System.out.println("Abrindo conexão com sucesso");
		connection.close();
		
	}

}
