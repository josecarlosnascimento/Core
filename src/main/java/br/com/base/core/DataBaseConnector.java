package br.com.base.core;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import javax.sql.DataSource;

import com.mysql.cj.jdbc.MysqlDataSource;

public class DataBaseConnector {
	
	public static DataSource getMySQLDataSource() {
		Properties props = new Properties();
		FileInputStream fis = null;
		MysqlDataSource mysqlDS = null;
		try {
//			fis = new FileInputStream("db.properties");
//			props.load(fis);
			mysqlDS = new MysqlDataSource();
			mysqlDS.setURL("jdbc:mysql://localhost/money?useTimezone=true&serverTimezone=UTC");
			mysqlDS.setUser("root");
			mysqlDS.setPassword("101520");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return mysqlDS;
	}

}
