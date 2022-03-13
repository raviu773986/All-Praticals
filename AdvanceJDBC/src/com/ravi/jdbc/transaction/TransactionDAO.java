package com.ravi.jdbc.transaction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TransactionDAO {
	
	public static void main(String[] args) {
		Connection con = null;
		try
		{
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "Pass@1234");
			Statement stmt = con.createStatement();
			con.setAutoCommit(false);
			
			stmt.executeUpdate("update account set bal=bal-500 where accountno=123");
			stmt.executeUpdate("update account set bal=bal+500 where accountno=124");
			
			con.commit();
			
		} catch (SQLException e) {
			e.printStackTrace();
			
			try {
				con.close();
				con.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}

	}


}
