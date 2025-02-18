package com.presentation;

public class CrosswordPuzzle implements WordPuzzle {
    private final String clue;
    private final String answer;

    public CrosswordPuzzle() {
        String[] data = CrosswordDAO.getRandomCrossword();
        this.clue = data[0];
        this.answer = data[1];
    }

    public String generatePuzzle() {
        return "Clue: " + clue;
    }

    public boolean validateAnswer(String answer) {
        return this.answer.equalsIgnoreCase(answer);
    }
}

