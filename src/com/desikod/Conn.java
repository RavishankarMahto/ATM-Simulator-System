package com.desikod;

import java.sql.*;



// Register the driver
// Create Connection
// Create Statement
// Execute Query
// Close Connectivity


public class Conn {
    Connection c;
    Statement s;
    public Conn() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankmanagementsystem", "root", "Admin@123");
            s =c.createStatement();



        }catch(Exception e){
//            e.printStackTrace();
            System.out.println(e);
        }
    }
//    public static void main(String[] args) {
//        Conn conn = new Conn();
//        System.out.println("✅ Connected to the database successfully!");
//
//    }

}

