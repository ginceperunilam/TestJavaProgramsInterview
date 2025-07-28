package com.JavaProjects.TestProjectsFiles;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTestFile
{
	public Statement getJDBConnection()
	{
		Statement st = null;
		try
		{
			String url = "jdbc:sqlserver://localhost:1433;databaseName=MyTestDatabase;trustServerCertificate=true"
					+ ";integratedSecurity=true";
			Connection con = DriverManager.getConnection(url);
			st = con.createStatement();
			System.out.println("DB Connection Established");
		} 
		catch (SQLException e)
		{
			System.out.println("JDBCTestFile inside getJDBConnection failed e : "+e);
		}
		catch (Exception e)
		{
			System.out.println("JDBCTestFile inside getJDBConnection failed Exceptions e : "+e);
		}
		return  st;
	}
}
