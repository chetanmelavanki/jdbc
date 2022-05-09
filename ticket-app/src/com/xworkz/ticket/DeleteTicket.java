package com.xworkz.ticket;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.ticket.properties.DriverProperties;

public class DeleteTicket {

	public static void main(String[] args) {

		try (Connection connection = DriverManager.getConnection(DriverProperties.url.getValue(),
				DriverProperties.userName.getValue(), DriverProperties.passWord.getValue());
				Statement statement = connection.createStatement();) {
			String value = DriverProperties.type.getValue();
			System.out.println(value);

			String insertQuery = "DELETE FROM ticket where id=9";

			System.out.println(statement);
			int rowsEffected = statement.executeUpdate(insertQuery);
			System.out.println("successfully deleted");
			System.out.println("effected rows:" + rowsEffected);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
