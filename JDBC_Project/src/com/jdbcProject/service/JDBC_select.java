package com.jdbcProject.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC_select {

	public static void main(String[] args) {
		try {
			  Class.forName("com.mysql.cj.jdbc.Driver");
			  Connection connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/springjdbc","root","Shahu2116@");
			  Statement smt=connect.createStatement();
			  ResultSet rs=smt.executeQuery("select * from studentdb");
			  
			  while(rs.next())
			  {
				 int roll=rs.getInt(1);
				 String firstName=rs.getString(2);
				 String LastName=rs.getString(3);
				 System.out.println(roll+" "+firstName+" "+" "+LastName);
			  }
		    } 
		
		catch (Exception e)
		{
			System.out.println(e);
		}
		
	}

}
