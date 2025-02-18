package com.presentation;

public class AnagramPuzzleFactory extends WordPuzzleFactory {
    @Override
    public WordPuzzle createPuzzle() {
        return new AnagramPuzzle();
    }
}
