package com.presentation;

public class CrosswordPuzzleFactory extends WordPuzzleFactory {
    @Override
    public WordPuzzle createPuzzle() {
        return new CrosswordPuzzle();
    }
}

