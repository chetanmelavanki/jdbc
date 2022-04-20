package com.xworkz.trasfer;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Transfer {


	public static void main(String[] args) throws Exception {
		
		String apllication_name = "application.txt";

		FileInputStream fis = null;
		PreparedStatement pstmt = null;
		Connection conn = null;
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jan6", "root", "ROOT");
			conn.setAutoCommit(false);
			File file = new File("application.txt");
			fis = new FileInputStream(file);
			pstmt = conn.prepareStatement("insert into application(application_name) values ( ?)");
		
			pstmt.setString(1, apllication_name);
			pstmt.executeUpdate();
			conn.commit();
		} catch (Exception e) {
			System.err.println("Error: " + e.getMessage());
			e.printStackTrace();
		} finally {
			if(pstmt!=null)
			pstmt.close();
			if(fis!=null)
			fis.close();
			if(conn!=null)
			conn.close();
		}
	}
}
