package com.example.secondsprint.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserService {
    Connection connection;

    public UserService(Connection connection) {
        this.connection = connection;
    }

    public String getUser(String username, String pw) {
        try {
            PreparedStatement statement = this.connection.prepareStatement("SELECT password, full_name FROM users WHERE users.username = '" + username + "'");
            ResultSet resultSet = statement.executeQuery();

            while(resultSet.next()) {
                String password = resultSet.getString("password");
                String full_name = resultSet.getString("full_name");
                if (pw.equals(password)) {
                    return full_name;
                }
            }

            statement.close();
        } catch (Exception var7) {
            var7.printStackTrace();
        }

        return null;
    }
}
