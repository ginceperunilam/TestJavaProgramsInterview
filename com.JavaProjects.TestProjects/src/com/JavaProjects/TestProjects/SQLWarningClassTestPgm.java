package com.JavaProjects.TestProjects;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLWarning;
import java.sql.Statement;

public class SQLWarningClassTestPgm
{
	public void printSQLWarning()
	{
		try
		{
			System.out.println("1 : ");
			 Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			 System.out.println("2 : ");
			String url = "jdbc:sqlserver://localhost:1433;databaseName=MyTestDatabase;trustServerCertificate=true"
					+ ";integratedSecurity=true";
			System.out.println("3 : ");
			Connection con = DriverManager.getConnection(url);
			System.out.println("4 : ");
			Statement st = con.createStatement();
			
			SQLWarning warnings = st.getWarnings();
			if(warnings != null)
			{
				while(warnings != null)
				{
					System.out.println("warning : "+warnings.getMessage());
					warnings = warnings.getNextWarning();
				}
			}
		} 
		catch (Exception e)
		{
			System.out.println("inside Catch e : "+e);
		}
	}
}
