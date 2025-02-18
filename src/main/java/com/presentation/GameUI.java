package com.presentation;

//import java.sql.Connection;
//import java.sql.SQLException;
import java.util.Scanner;

public class GameUI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean continuePlaying = true;

        while (continuePlaying) {
            // Display the numbered menu
            System.out.println("Select a puzzle type:");
            System.out.println("1. Anagram");
            System.out.println("2. Crossword");
            System.out.println("3. Fill in the blank");
            System.out.println("4. Exit");

            // Get user input for puzzle type
            int choice = scanner.nextInt(); // Read the user's choice
            scanner.nextLine();  // Consume newline left-over

            // Declare a factory, but we do not instantiate directly
            WordPuzzleFactory factory;

            switch (choice) {
                case 1:
                    factory = new AnagramPuzzleFactory();
                    break;
                case 2:
                    factory = new CrosswordPuzzleFactory();
                    break;
                case 3:
                    factory = new FillInTheBlankPuzzleFactory();
                    break;
                case 4:
                    continuePlaying = false;
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid puzzle type.");
                    return;
            }

            // Use the factory method to create the puzzle
            WordPuzzle puzzle = factory.createPuzzle();
            System.out.println(puzzle.generatePuzzle());

            // Validate the answer
            System.out.print("Your answer: ");
            String answer = scanner.nextLine();

            if (puzzle.validateAnswer(answer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("Incorrect. Try again.");
            }
        }
    }
}

