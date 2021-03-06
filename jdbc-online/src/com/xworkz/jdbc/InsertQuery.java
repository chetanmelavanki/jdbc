package com.xworkz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertQuery {
	public static void main(String[] args) {
		try (Connection connection = DriverManager.getConnection(DriverProperties.url.getValue(),
				DriverProperties.userName.getValue(), DriverProperties.passWord.getValue());
				Statement statement = connection.createStatement();) {

			String insertQuery = "INSERT INTO bakery VALUES(5,'A 1 Bakery',1969,'gulbarga',20)";

			System.out.println(statement);
			int rowsEffected = statement.executeUpdate(insertQuery);
			System.out.println("successfully inserted");
			System.out.println("effected rows:" + rowsEffected);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
