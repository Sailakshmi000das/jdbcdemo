package com.stackroute.jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcTransactionDemo {
    public void transactionData() {

        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentInfo", "root", "Root@123");
            con.setAutoCommit(false);

            Statement stmt = con.createStatement();
            stmt.executeUpdate("insert into course values(11,'rohit',23)");
            stmt.executeUpdate("insert into course values(12,'prasanna',24)");

            con.commit();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
    }
}