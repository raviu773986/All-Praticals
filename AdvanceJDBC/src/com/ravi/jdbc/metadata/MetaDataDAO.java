package com.ravi.jdbc.metadata;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class MetaDataDAO {
	public static void main(String[] args) {
		try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "Pass@1234");
				Statement stmt = con.createStatement();)
		{
			ResultSet resultSet = stmt.executeQuery("select * from account");
			ResultSetMetaData resultSetmetaData = resultSet.getMetaData();
			int columnCount = resultSetmetaData.getColumnCount();
			for(int i = 1; i<=columnCount; i++ )
			{
				System.out.println(resultSetmetaData.getColumnClassName(i));
				System.out.println(resultSetmetaData.getColumnTypeName(i));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}


}
