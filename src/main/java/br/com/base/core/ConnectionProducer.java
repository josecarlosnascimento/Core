package br.com.base.core;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Logger;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;

@ApplicationScoped
public class ConnectionProducer {
	
	@Inject
	private Logger logger;
	
	static {
		System.out.println("ConnectionProducer");
	}
	
	
	@Produces
	public Connection getConnection() throws SQLException {
		
		Connection connection = DataBaseConnector.getMySQLDataSource().getConnection();
		return connection;
		
	}
	
	public void closeConnection(@Disposes Connection connection) {
		System.out.println("Comitando transação");
		try {
			connection.commit();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
