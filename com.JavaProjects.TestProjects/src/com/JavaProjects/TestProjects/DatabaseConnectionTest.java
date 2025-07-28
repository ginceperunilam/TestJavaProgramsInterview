package com.JavaProjects.TestProjects;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

import com.JavaProjects.TestProjectsFiles.JDBCTestFile;

public class DatabaseConnectionTest
{
	public void getDataFromTable(String tableName)
	{
		JDBCTestFile conn = new JDBCTestFile();
		Statement statement = conn.getJDBConnection();
		
		try
		{
			String query = "SELECT * FROM ".concat(tableName);
			ResultSet resultSet = statement.executeQuery(query);
			
			/**dynamically retrieve the column name from resultSet**/
			ResultSetMetaData metaData = resultSet.getMetaData();
            int columnCount = metaData.getColumnCount();

            /**Process the result set**/
			while (resultSet.next())
			{
				for (int i = 1; i <= columnCount; i++) 
				{
					/**print column name and value**/
                    System.out.print(metaData.getColumnName(i) + ":"+resultSet.getString(i) + "\n");
                }
			}
		} 
		catch (Exception e)
		{
			System.out.println("DatabaseConnectionTest inside getDataFromTabless failed e : "+e);
		}
	}
}
