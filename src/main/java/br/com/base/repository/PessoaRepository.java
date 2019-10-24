package br.com.base.repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PessoaRepository extends JdbcConnection {

	static {
		System.out.println("PessoaRepository");
	}
	
	public void pesquisarPessoa() {
		
		StringBuilder sql = new StringBuilder();
		PreparedStatement ps = null;
		ResultSet rs = null;
		

		sql.append("SELECT nome, logradouro, numero, complemento, bairro, cep, ativo FROM pessoa");
		
		try {
			ps = conexao().prepareStatement(sql.toString());
			rs = ps.executeQuery();
			
			while (rs.next()) {
				System.out.println(rs.getString("nome"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}


	
	
}
