package br.loja.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	private volatile static Connection connection;

	// construtor privado (não permite instanciação externa)
	private Conexao() {
	}

	// método para conectar e retornar a conexão
	public static Connection conectar() {
		if (connection == null) {
			synchronized (Conexao.class) {
				if (connection == null) {
					String driver = "oracle.jdbc.driver.OracleDriver";
					String url = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL";
					String user = "rm85967";
					String password = "170399";
					try {
						Class.forName(driver);
						connection = DriverManager.getConnection(url, user, password);
					} catch (final ClassNotFoundException | SQLException e) {
						System.out.println(e);
					}
				}
			}
		}
		return connection;
	}

}
