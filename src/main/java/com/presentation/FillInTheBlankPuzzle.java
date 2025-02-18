package com.presentation;

public class FillInTheBlankPuzzle implements WordPuzzle {
    private final String puzzle;
    private final String answer;

    public FillInTheBlankPuzzle() {
        String[] data = FillInTheBlankDAO.getRandomFillInTheBlank();
        this.puzzle = data[0];
        this.answer = data[1];
    }

    public String generatePuzzle() {
        return puzzle;
    }

    public boolean validateAnswer(String answer) {
        return this.answer.equalsIgnoreCase(answer);
    }
}
