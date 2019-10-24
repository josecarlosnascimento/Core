package br.com.base.core;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Logger;

import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;

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
