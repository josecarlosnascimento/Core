package br.com.base.core;

import java.sql.Connection;
import java.sql.SQLException;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;

public class ConnectionProducer {
	
	static {
		System.out.println("ConnectionProducer");
	}
	
	
	@Produces
	public Connection getConnection() throws SQLException {
		
		Connection connection = DataBaseConnector.getMySQLDataSource().getConnection();
		connection.setAutoCommit(false);
		return connection;
		
	}
	
	public void closeConnection(@Disposes Connection conn) {
		System.out.println("Fechando transação");
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
