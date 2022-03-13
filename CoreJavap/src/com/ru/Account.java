package com.ru;

import java.sql.*;

public class Account {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {

			String url = "jdbc:mysql://localhost:3306/mydb";
			Connection connection = DriverManager.getConnection(url, "root", "Pass@1234");
			Statement statement = connection.createStatement();
//			int res = statement.executeUpdate("insert into account values(1,'kumar','raj',10000)");
			int res = statement.executeUpdate("insert into account values(3,'singh','mukesh',12000)");
			
//			ResultSet rs = statement.executeQuery("select * from account");
//			while(rs.next())
//			{
//				System.out.println(rs.getString("lastname"));
//				System.out.println(rs.getString("firstname"));
//			}
			
			System.out.println(res + "rows affected");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
