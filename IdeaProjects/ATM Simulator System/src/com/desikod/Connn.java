package com.desikod;

import java.sql.*;



// Register the driver
// Create Connection
// Create Statement
// Execute Query
// Close Connectivity


public class Connn {
    Connection connection;
    Statement statement;
    public Connn() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankmanagementsystem", "root", "Admin@123");
            statement =connection.createStatement();



        }catch(Exception e){
            e.printStackTrace();
//            System.out.println(e);
        }
    }
//    public static void main(String[] args) {
//        Connn connn = new Connn();
//        System.out.println("✅ Connected to the database successfully!");
//
//    }

}

