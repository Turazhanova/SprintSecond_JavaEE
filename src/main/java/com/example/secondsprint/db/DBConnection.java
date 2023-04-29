package com.example.secondsprint.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    private static Connection connection;

    public DBConnection() {
    }

    public static Connection getConnection() {
        return connection;
    }

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "password");
        } catch (Exception var1) {
            var1.printStackTrace();
        }

    }
}
