package com.myproj;

import java.sql.*;

public class Testjdbc {
    public static void main(String args[])
    {
        String url = "jdbc:mysql://localhost:3306/myproj";
        try {
            Connection conn = DriverManager.getConnection(url,"root","Rootpass1234");
            Statement sql= conn.createStatement();
            ResultSet resultSet = sql.executeQuery("select * from employee");

            int total=0;
            while(resultSet.next())
            {
//                System.out.println(resultSet.getString("name"));
                System.out.println(resultSet.getInt("id"));
//                System.out.println(resultSet.getInt("salary"));
                total = total+resultSet.getInt("salary");
            }
            System.out.println("Total salary = "+total);

        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
