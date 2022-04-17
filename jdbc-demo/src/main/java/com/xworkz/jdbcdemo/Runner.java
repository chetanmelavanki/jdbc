package com.xworkz.jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class Runner {

	

	public static void main(String[] args) {
		
		
		
		insertMovie();
		updateMovie();
		deleteMovie();
	}

	private static void insertMovie() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a id");
		int id=sc.nextInt();
		System.out.println("enter a movie name");
		String name=sc.next();
		System.out.println("enter a rating");
		double rate=sc.nextDouble();
		System.out.println("enter a laanguage");
		String lang=sc.next();
		System.out.println("enter a budget");
		long budget=sc.nextLong();
		
		sc.close();
		
		Connection connection=null;
		Statement statement1=null;
		try {
			//Step 1
			// Load  and Register the driver
//			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("class loaded");
			
			//step 2
			//create connection (Establish connection with MySQL Server)
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jan6", "root", "ROOT");
			
			System.out.println("connection created");
			
			//step 3
			//create platform / environment to execute the queries
			statement1=connection.createStatement();
			System.out.println("statement created");
			
			//Step 4 
			//excute the query
			statement1.execute("INSERT INTO movie(id,name,rating,language,budget) VALUES ("+id+",'"+name+"',"+rate+",'"+lang+"',"+budget+")");
			System.out.println("successfully inserted");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			//step 6 
			//close the costly resources
			try {
				if(statement1 !=null )
					statement1.close();
				if(connection != null)
					connection.close();
					
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
	
	private static void updateMovie() {
		Scanner sc1=new Scanner(System.in);
		
		System.out.println("enter movie name to update ");
		String name=sc1.next();
		
		System.out.println("enter a rating to update ");
		double rating=sc1.nextDouble();
		
		System.out.println("enter a language to update");
		String language=sc1.next();
		
		System.out.println("enter a budget to uodate");
		long budget=sc1.nextLong();
		
		System.out.println("enter a id to update all the the deatils");
		int id=sc1.nextInt();
		
		Connection connection=null;
		Statement statement=null;
		try {
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jan6", "root", "ROOT");
			System.out.println("Connection created");
			
			statement=connection.createStatement();
			System.out.println("statement is created");
			
			statement.execute("UPDATE movie SET name=('"+name+"'),rating=("+rating+"),language=('"+language+"'),budget=("+budget+") where id=("+id+")");
			System.out.println("successfully updated");
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			//step 6 
			//close the costly resources
			try {
				if(statement !=null )
					statement.close();
				if(connection != null)
					connection.close();
					
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
	}
	
	private static void deleteMovie() {
		Scanner sc=new Scanner(System.in);
	
		System.out.println("enter id to delete all the details");
		int id=sc.nextInt();
		
		Connection connection=null;
		Statement statement=null;
		try {
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jan6", "root", "ROOT");
			System.out.println("Connection created");
			
			statement=connection.createStatement();
			System.out.println("statement is created");
			
			statement.execute("DELETE FROM movie where id=("+id+")");
			System.out.println("successfully deleted");
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			//step 6 
			//close the costly resources
			try {
				if(statement !=null )
					statement.close();
				if(connection != null)
					connection.close();
					
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
	}
	
	

}