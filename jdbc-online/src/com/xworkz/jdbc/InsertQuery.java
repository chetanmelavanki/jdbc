package com.xworkz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertQuery {
	public static void main(String[] args) {
		try {
			//1st step load and register the driver class
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("class driver loaded succesfully");
			
			//2nd step create connection
			String url="jdbc:mysql://localhost:3306/xworkz_jan15";
			String userName="root";
			String passWord="ROOT";
			Connection connection= DriverManager.getConnection(url, userName, passWord);
			System.out.println("connection created");
			
			//step3 create statement or write query
			String insertQuery = "INSERT INTO bakery VALUES(5,'A 1 Bakery',1969,'gulbarga',20)";
			Statement statement = connection.createStatement();
			System.out.println(statement);
			int rowsEffected=statement.executeUpdate(insertQuery);
			System.out.println("successfully inserted");
			System.out.println("effected rows:"+rowsEffected);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
