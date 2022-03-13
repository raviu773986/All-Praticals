package com.ravi.jdbc.batch;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchDAO {
	public static void main(String args[])

	{
		try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","Pass@1234");
				Statement stmt = con.createStatement();)
				{
					stmt.addBatch("insert into account values(123,'paney','raj',13000)");
					stmt.addBatch("insert into account values(124,'paney','rohan',16000)");
					
					int[] result = stmt.executeBatch();				
					for(int i=0; i<result.length; i++)
					{ 
						System.out.println(result[i]);
					}
				}
		
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
	
}
