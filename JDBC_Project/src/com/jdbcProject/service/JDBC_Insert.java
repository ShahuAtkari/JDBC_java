package com.jdbcProject.service;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.sql.*;
public class JDBC_Insert {

	public static void main(String[] args) {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/springjdbc","root","Shahu2116@");
		//The PreparedStatement interface is a subinterface of Statement.
		//It is used to execute parameterized query.
		PreparedStatement psmt=con.prepareStatement("insert into studentdb values(?,?,?)");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		while(true)
		{
			int roll=Integer.parseInt(br.readLine());
			String n=br.readLine();
			String l=br.readLine();
			
			psmt.setInt(1, roll);
			psmt.setString(2, n);
			psmt.setString(3, l);
			int i=psmt.executeUpdate();  
			System.out.println(i+" records inserted");  
			  
			con.close();  
			
		}
		//con.close();
//		while(rs.next())
//		{
//			int rn=rs.getInt("rollnumber");
//			String nme=rs.getString("name");
//			String lastn=rs.getString("lastname");
//			System.out.println(rn +" "+nme+" "+lastn );
//		}
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
