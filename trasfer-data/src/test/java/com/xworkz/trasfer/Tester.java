package com.xworkz.trasfer;

import java.io.IOException;
import java.sql.SQLException;

import com.xworkz.trasfer.dao.ApplicationDAO;

public class Tester {
	public static void main(String[] args) throws SQLException {
		ApplicationDAO dao=new ApplicationDAO();
		try {
			dao.readData();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
