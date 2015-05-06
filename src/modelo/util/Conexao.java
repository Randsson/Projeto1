package modelo.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class Conexao {
	private Connection conexao;

	public Connection getConexao() {
	
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String usuario = "root";
			String senha = "root";
			String host = "jdbc:mysql://localhost/pavi";
			conexao = DriverManager.getConnection(host, usuario, senha);
			return conexao;

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException ex) {
			JOptionPane.showMessageDialog(null, "Nao encontrou o driver: "+ex.getMessage());
		}

		return null;
	}

	public void fecharConexao() {
		if (conexao != null) {
			try {
				conexao.close();
			} catch (SQLException e) {
				JOptionPane.showMessageDialog(null, e.getMessage());
			}
		}
	}
}
