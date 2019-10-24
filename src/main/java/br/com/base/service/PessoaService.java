package br.com.base.service;

import javax.inject.Inject;

import br.com.base.core.JdbcConnection;
import br.com.base.model.Pessoa;
import br.com.base.repository.PessoaRepository;

public class PessoaService {
	
	@Inject
	private PessoaRepository pessoaRepository;
	

	static {
		System.out.println("PessoaService");
	}

	@JdbcConnection
	public void insert(Pessoa pessoa) {
		pessoaRepository.insert(pessoa);
	}

}
