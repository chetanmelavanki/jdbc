package com.xworkz.trasfer.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ApplicationDAO {

	public static Connection getConnection() throws Exception {
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/application";
		String username = "root";
		String password = "ROOT";

		Connection conn = DriverManager.getConnection(url, username, password);
		return conn;

	}

	public void readData() throws IOException {
		String fileName = "C:\\Users\\cheta\\OneDrive\\Desktop\\X Worksz\\jdbc task\\Application.txt";

		FileInputStream fis = null;
		PreparedStatement pstmt = null;
		Connection conn = null;
		try {
			File f=new File(fileName);
			FileReader fr=new FileReader(f);
			int c;
			String str="";
			while((c=fr.read())!=-1)
			{
			str=str+(char)c;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt!=null)
				pstmt.close();
				if(fis!=null)
				fis.close();
				if(conn!=null)
				conn.close();
			} catch (SQLException |NullPointerException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

}
