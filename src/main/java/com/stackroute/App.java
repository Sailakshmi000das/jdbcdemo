package com.stackroute;

import com.stackroute.jdbcdemo.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
       /* System.out.println( "Hello World!" );*/
        DataManager dataManager=new DataManager();
        dataManager.getAllStudents();

        RowSetDemo rowSetDemo=new RowSetDemo();
        rowSetDemo.getAllStudents();

        DatabaseMetadataDemo databaseMetadataDemo=new DatabaseMetadataDemo();
        databaseMetadataDemo.getDatabaseMetaData();

        JdbcBatchProcessingDemo jdbcBatchMetadataDemo=new JdbcBatchProcessingDemo();
        jdbcBatchMetadataDemo.batchProcessing();

        PreparedStatementDemo preparedStatementDemo=new PreparedStatementDemo();
        preparedStatementDemo.getCourseByName("sai");

        ResultSetMetadataDemo resultSetMetadataDemo=new ResultSetMetadataDemo();
        resultSetMetadataDemo.getAllStudents();

        JdbcTransactionDemo jdbcTransactionDemo=new JdbcTransactionDemo();
        jdbcTransactionDemo.transactionData();


    }
}
