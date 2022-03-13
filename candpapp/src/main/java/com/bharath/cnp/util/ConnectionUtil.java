package com.bharath.cnp.util;

import java.sql.Connection;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class ConnectionUtil {
	public static Connection getConnection()
	{
			Connection connection = null;
			try {
				InitialContext context = new InitialContext();
				DataSource datasource =(DataSource) context.lookup("java:comp/env/myds");
				
			} catch (NamingException e) {
				e.printStackTrace();
			}
			
			
			return connection;
	}

}
