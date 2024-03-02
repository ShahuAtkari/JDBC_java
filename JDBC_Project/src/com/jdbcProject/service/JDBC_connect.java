package com.jdbcProject.service;
import java.sql.*;

public class JDBC_connect {

	public static void main(String[] args) {
		try {
			//The forName() method of Class class is used to register the driver class.
			//This method is used to dynamically load the driver class.
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//The getConnection() method of DriverManager class 
			// which is used to establish connection with the database.
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/springjdbc","root","Shahu2116@");
			//The createStatement() method of Connection interface is used to create statement.
			//The object of statement is responsible to execute queries with the database.
			Statement psmt=con.createStatement();
			//The executeQuery() method of Statement interface is used to execute queries to the database. 
			//This method returns the object of ResultSet that can be used to get all the records of a table.
			ResultSet rs=psmt.executeQuery("select * from studentdb where rollnumber=1");
			
			while(rs.next())
			{
				int rn=rs.getInt("rollnumber");
				String nme=rs.getString("name");
				String lastn=rs.getString("lastname");
				System.out.println(rn +" "+nme+" "+lastn );
			}
			// By closing connection object statement and ResultSet will be closed automatically.
			// The close() method of Connection interface is used to close the connection.
			con.close();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
	}
}
