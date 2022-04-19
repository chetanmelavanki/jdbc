package com.xworkz.games.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import static com.xworkz.games.dbconstants.DbConstants.*;
import com.xworkz.games.dto.GamesDTO;

public class GamesDAO {
	public static boolean saveGame(GamesDTO dto) {
		
		if (dto == null) {
			return false;
		} else {
			Connection connection = null;
			PreparedStatement preparedStatement = null;

			try {
				connection = DriverManager.getConnection(JDBCURL, USERNAME, PASSWORD);
				
				preparedStatement = connection.prepareStatement( "INSERT INTO games VALUES(?,?,?,?)");

				preparedStatement.setInt(1, dto.getGameId());
				preparedStatement.setString(2, dto.getGameName());
				preparedStatement.setInt(3, dto.getNoOfPlayes());
				preparedStatement.setString(4, dto.getGameType());

				preparedStatement.execute();
				return true;

			} catch (SQLException e) {
				e.printStackTrace();
			} finally {

				try {
					if (preparedStatement != null)
						preparedStatement.close();
					if (connection != null)
						connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

		}
		return false;
	}
}
