package com.goldilocks;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class ReadFromDatabase {
	
	public static void main(String[] args) {
        // Database connection.
        String url = "jdbc:mysql://localhost:3306/goldiLocks";
        String username = "root";
        String password = "3123";

        // JDBC objects
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            // MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connect to the database
            connection = DriverManager.getConnection(url, username, password);

            // Create a statement
            statement = connection.createStatement();

            // Execute a query to select data from the "test" table
            String query = "SELECT * FROM test";
            resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                String empName = resultSet.getString("EmpName");
                int empAge = resultSet.getInt("EmpAge");

                System.out.println("Employee Name: " + empName);
                System.out.println("Employee Age: " + empAge);
                System.out.println("===============================");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

}
}