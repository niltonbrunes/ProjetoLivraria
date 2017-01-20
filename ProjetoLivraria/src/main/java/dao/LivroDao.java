package dao;

import java.sql.*;

public class LivroDao {

	Logger LOG = Logger.getGlobal();
	private static final String OBTER_POR_ID_SQL = "SELECT AUTOR, TITULO, COD_LIVRO, IMAGEM, PRECO, DESCRICAO FROM ESTOQUE WHERE COD_LIVRO = ?";
	private static final String CONSULTAR_SQL = "SELECT COD_LIVRO, TITULO, AUTOR, PRECO, IMAGEM, DESCRICAO FROM ESTOQUE WHERE TITULO LIKE ?";

	public Livro consultar(int codigo){
		
	public List<Livro> consultar(String titulo) {
		//Faça o restante do CRUD
	}
	}
}
