package com.myproj;
import java.sql.*;

public class InsertData {
    public static void main(String args[])
    {
        String url = "jdbc:mysql://localhost:3306/myproj";
        try
        {
            Connection conn = DriverManager.getConnection(url,"root","Rootpass1234");
            Statement statement = conn.createStatement();
//            statement.executeUpdate("insert into employee(id,name,department,salary) values(700,'Atul','Cash',23000);");
            statement.executeUpdate("insert into employee(name,department,salary) values('vikash','Sales',28000);");
            System.out.println("Record inserted");
        }
        catch (SQLException e)
        {
            System.out.println("Data not inserted");
        }

    }
}

