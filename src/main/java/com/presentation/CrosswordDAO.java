package com.presentation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CrosswordDAO {
    public static String[] getRandomCrossword() {
        String sql = "SELECT clue, answer FROM crossword_puzzles ORDER BY RAND() LIMIT 1";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            if (rs.next()) {
                return new String[]{rs.getString("clue"), rs.getString("answer")};
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return new String[]{"", ""};
    }
}