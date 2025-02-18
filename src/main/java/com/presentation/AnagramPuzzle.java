package com.presentation;

public class AnagramPuzzle implements WordPuzzle {
    private final String word;
    private final String scrambledWord;

    public AnagramPuzzle() {
        String[] data = AnagramDAO.getRandomAnagram();
        this.word = data[0];
        this.scrambledWord = data[1];
    }

    public String generatePuzzle() {
        return "Scramble: " + scrambledWord;
    }

    public boolean validateAnswer(String answer) {
        return word.equalsIgnoreCase(answer);
    }
}
