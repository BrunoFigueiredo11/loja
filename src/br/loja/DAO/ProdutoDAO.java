package br.loja.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.loja.conexao.Conexao;
import br.loja.entidade.Produto;

public class ProdutoDAO {
	private Connection connection; // armazena a conexão estabelecida com o banco de dados
	private String sql; // armazena a instrução SQL que será executada
	private PreparedStatement ps;// executar a instrução SQL no banco
	private ResultSet rs; // armazena os dados retornados pelo banco no SELECT

	public ProdutoDAO() {
		connection = Conexao.conectar();
	}

	public boolean cadastrar(Produto produto) {
		sql = "insert into produto values(sequence_id.nextval,?, ?, ?,?)";
		boolean status = false;
		try {
			ps = connection.prepareStatement(sql);
			ps.setString(1, produto.getNome());
			ps.setString(2, produto.getDescricao());
			ps.setDouble(3, produto.getPreco());
			ps.setInt(4, produto.getQuantidade());
			ps.execute();
			status = true;
		} catch (SQLException e) {
			status = false;
		}
		return status;
	}

	public List<Produto> listar() {
		List<Produto> lista = new ArrayList<Produto>();
		sql = "select * from produto";
		try {
			ps = connection.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				lista.add(new Produto(rs.getString("nome"), rs.getString("descricao"), rs.getDouble("preco"),
						rs.getInt("quantidade")));
			}
		} catch (SQLException e) {
			System.out.println("Erro ao listar os produtos" + e);
		}
		return lista;
	}
}
