package com.stackroute.jdbcdemo;


import java.sql.*;

public class DataManager {
    public void getAllStudents() {

        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentInfo", "root", "Root@123");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from course");
            while (resultSet.next()) {
                int id = resultSet.getInt(1);
                System.out.println(id);
            }
        } catch (ClassNotFoundException | SQLException exception) {
            System.out.println("Exception thrown: " + exception.getStackTrace());

        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
