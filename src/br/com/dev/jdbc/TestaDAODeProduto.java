package br.com.dev.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.dev.jdbc.dao.ProdutosDAO;
import br.com.dev.jdbc.modelo.Produto;

public class TestaDAODeProduto {

	public static void main(String[] args) throws SQLException {

		Produto mesa = new Produto("Mesa Azul", "Mesa com 4 cadeiras");

		try (Connection con = new ConnectionPool().getConnection()) {
			ProdutosDAO dao = new ProdutosDAO(con);
			dao.salva(mesa);
			
			List<Produto> produtos = dao.lista();
			for (Produto produto : produtos) {
				System.out.println("Existe o produto: " + produto);				
			}
		}
		

	}
	

	

}
