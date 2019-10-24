package br.com.base.core;

import java.sql.Connection;
import java.sql.SQLException;

import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;

public class ConnectionFactory {
	
	static {
		System.out.println("ConnectionFactory");
	}
	
	
	@Produces
	@JdbcConnection
	public Connection getConnection() throws SQLException {
		
		Connection connection = DataBaseConnector.getMySQLDataSource().getConnection();
		return connection;
		
	}
	
	private void closeConnection(@Disposes @JdbcConnection Connection connection) throws SQLException {
		connection.close();
	}

}
