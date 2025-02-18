package com.presentation;

public class FillInTheBlankPuzzleFactory extends WordPuzzleFactory {
    @Override
    public WordPuzzle createPuzzle() {
        return new FillInTheBlankPuzzle();
    }
}

