package com.jdbcProject.service;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBC_Update {

	public static void main(String[] args) {
		try {
			String value1;
			String value2;
			String value3;
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/springjdbc","root","Shahu2116@");
			Statement smt=connection.createStatement();
			
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("enter the name");
			value2=br.readLine();
			System.out.println("enter the lastname that u want to correct ");
			value3=br.readLine();
			int count=smt.executeUpdate("update studentdb set lastname="+value3+" where name="+value2);
			
			System.out.println(count+" records inserted");  
			  
			
		    }
		catch (Exception e)
		{
			System.out.println(e);
		}
		
	}

}
