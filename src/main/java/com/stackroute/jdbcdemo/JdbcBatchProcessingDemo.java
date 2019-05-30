package com.stackroute.jdbcdemo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class JdbcBatchProcessingDemo {
    public void batchProcessing() {

        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentInfo", "root", "Root@123");
            con.setAutoCommit(false);
            Statement stmt = con.createStatement();
            stmt.addBatch("insert into course values(15,'sirisha',29)");
            stmt.addBatch("insert into course values(16,'vinay',26)");
            stmt.executeBatch();//executing the batch
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
