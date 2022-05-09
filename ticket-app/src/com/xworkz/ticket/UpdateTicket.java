package com.xworkz.ticket;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.ticket.properties.DriverProperties;

public class UpdateTicket {

	public static void main(String[] args) {

		try (Connection connection = DriverManager.getConnection(DriverProperties.url.getValue(),
				DriverProperties.userName.getValue(), DriverProperties.passWord.getValue());
				Statement statement = connection.createStatement();) {
			String value=DriverProperties.type.getValue();
			System.out.println(value);

			String insertQuery = "UPDATE ticket SET person='naveen' where id=1";

			System.out.println(statement);
			int rowsEffected = statement.executeUpdate(insertQuery);
			System.out.println("successfully updated");
			System.out.println("effected rows:" + rowsEffected);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
