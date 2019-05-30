package com.stackroute.jdbcdemo;

import java.sql.*;

public class PreparedStatementDemo {
    public void getCourseByName(String name) {
        Connection connection = null;
        try {
            //register driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //obtain connection
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentInfo", "root", "Root@123");
            String sql = "select * from course where name=?";

            PreparedStatement preparedStatement =
                    connection.prepareStatement(sql);

            preparedStatement.setString(1, name);
            ResultSet result = preparedStatement.executeQuery();
            while (result.next()) {
                int id = result.getInt("id");
                String studentName = result.getString("name");
                String duration = result.getString("duration");
                System.out.println(id + "\t" + studentName + "\t" + duration);

            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}