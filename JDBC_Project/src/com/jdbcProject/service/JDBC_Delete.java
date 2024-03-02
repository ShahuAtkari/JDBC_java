package com.jdbcProject.service;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

public class JDBC_Delete {

	public static void main(String[] args) {
	
		try
		{
		   Class.forName("com.mysql.cj.jdbc.Driver");
		   Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/springjdbc","root","Shahu2116@");
		   Statement statement=connection.createStatement();
		   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		   System.out.println("delete the date using student ID ");
		   int roll=Integer.parseInt(br.readLine());
		   
		   int add=statement.executeUpdate("delete from studentdb where rollnumber="+roll);
			System.out.println("data removed "+add);
		   
		}
		catch (Exception e)
		{
			System.out.println(e);
		}

	}

}
