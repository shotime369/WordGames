package com.presentation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AnagramDAO {
    public static String[] getRandomAnagram() {
        try (Connection conn = DatabaseConnection.getConnection()){
            if (conn != null){
                //System.out.println("Connection successful!");
                String sql = "SELECT word, scrambled_word FROM words ORDER BY RAND() LIMIT 1";
                try( PreparedStatement stmt = conn.prepareStatement(sql);
                     ResultSet rs = stmt.executeQuery()) {
                    if (rs.next()) {
                        return new String[]{rs.getString("word"), rs.getString("scrambled_word")};
                    }
                }

            } else {
                System.out.println("Failed to connect.");
            }
        } catch (SQLException e) {

            e.printStackTrace();
        }
        return new String[]{"", ""};
    }
}
