package br.com.base.repository;

import java.sql.Connection;

import javax.inject.Inject;

public class JdbcConnection {
	
	static {
		System.out.println("JdbcConnection");
	}
	
	@Inject
	private Connection conn;
	
	public Connection conexao() {
		return conn;
	}

}
