package br.com.ubs.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public Connection getConnection() {

		try {
			return DriverManager.getConnection("jdbc:mysql://mysql.ubs.kinghost.net",
					"ubs01", "a4w7f6q2");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}
}
