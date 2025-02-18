package com.presentation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FillInTheBlankDAO {
    public static String[] getRandomFillInTheBlank() {
        String sql = "SELECT puzzle, answer FROM fill_in_the_blank_puzzles ORDER BY RAND() LIMIT 1";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            if (rs.next()) {
                return new String[]{rs.getString("puzzle"), rs.getString("answer")};
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return new String[]{"", ""};
    }
}
