package com.presentation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/word_games?useSSL=false&serverTimezone=UTC";
    private static final String USER = "shona";
    private static final String PASSWORD = "1234";

    public static Connection getConnection() throws SQLException {
        System.out.println("Trying to connect");
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}