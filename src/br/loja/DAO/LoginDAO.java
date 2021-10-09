package br.loja.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.loja.conexao.Conexao;
import br.loja.entidade.Login;

public class LoginDAO {

	private Connection connection; // armazena a conexão estabelecida com o banco de dados
	private String sql; // armazena a instrução SQL que será executada
	private PreparedStatement ps;// executar a instrução SQL no banco
	private ResultSet rs; // armazena os dados retornados pelo banco no SELECT

	public LoginDAO() {
		connection = Conexao.conectar();
	}

	public boolean login(Login login) {
		boolean status = false;
		sql = "select * from usuario where usuario = ? and senha = ?";
		try {
			ps = connection.prepareStatement(sql);
			ps.setString(1, login.getUsuario());
			ps.setString(2, login.getSenha());
			rs = ps.executeQuery();
			if (rs.next())
				status = true;
		} catch (SQLException e) {
			System.out.println("Erro ao consultar o usuario/senha\n" + e);
		}
		return status;

	}

}
