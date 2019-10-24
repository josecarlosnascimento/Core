package br.com.base.repository;

import br.com.base.model.Pessoa;

public class PessoaRepository extends JdbcConnection {

	static {
		System.out.println("PessoaRepository");
	}
	
	public void insert(Pessoa pessoa) {
		
		abrirConexao();
		
	}


	
	
}
