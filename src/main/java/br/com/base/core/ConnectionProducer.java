package br.com.base.core;

import java.sql.Connection;
import java.sql.SQLException;

import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;

public class ConnectionProducer {
	
	static {
		System.out.println("ConnectionProducer");
	}
	
	
	@Produces
	public Connection getConnection() throws SQLException {
		
		Connection connection = DataBaseConnector.getMySQLDataSource().getConnection();
		return connection;
		
	}
	
	private void closeConnection(@Disposes @Transactional Connection connection) throws SQLException {
		System.out.println("Comitando transação");
		connection.commit();
	}

}
