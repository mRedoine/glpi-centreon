package com.softia.glpi.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;

public class AbstractDaoJdbc {
	@Autowired
	protected DataSource dataSource;

	public AbstractDaoJdbc() {
		super();
	}

	protected void close(Connection cn, Statement st, ResultSet rs) {
		try {
			if (rs != null)
				rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			if (st != null)
				st.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			if (cn != null)
				cn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	protected Connection getConnection() throws ClassNotFoundException, SQLException {
		/*
		 * Connection cn; Class.forName("com.mysql.jdbc.Driver"); String url =
		 * "jdbc:mysql://localhost:3306/eatery?useSSL=false"; cn =
		 * DriverManager.getConnection(url, "scott", "tiger");
		 */
		return dataSource.getConnection();
	}

}