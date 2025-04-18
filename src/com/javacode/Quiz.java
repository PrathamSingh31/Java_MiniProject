package com.javacode;

import java.util.Scanner;

public class Quiz {

    // Function to display questions and options
    public static void showQuestion(String question, String[] options) {
        System.out.println(question);
        char optionChar = 'A';
        for (String option : options) {
            System.out.println(optionChar + ". " + option);
            optionChar++;
        }
    }

    // Function to check the answer
    public static boolean isCorrect(char userAnswer, char correctAnswer) {
        return Character.toUpperCase(userAnswer) == Character.toUpperCase(correctAnswer);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Questions
        String[] questions = {
                "What is the capital of India?",
                "Which keyword is used to define a class in Java?",
                "Which loop runs at least once no matter what?",
                "Which data type is used to store true/false values?",
                "What symbol is used to end a statement in Java?"
        };

        // Options for each question
        String[][] options = {
                {"Mumbai", "Delhi", "Chennai", "Kolkata"},
                {"void", "new", "class", "static"},
                {"for loop", "while loop", "do-while loop", "if loop"},
                {"int", "boolean", "double", "char"},
                {".", ",", ";", ":"}
        };

        // Correct answers (A, B, C, D)
        char[] correctAnswers = {'B', 'C', 'C', 'B', 'C'};

        int score = 0;

        // Loop through each question
        for (int i = 0; i < questions.length; i++) {
            System.out.println("\nQuestion " + (i + 1) + ":");
            showQuestion(questions[i], options[i]);

            System.out.print("Enter your answer (A/B/C/D): ");
            char userInput = scanner.next().charAt(0);

            if (isCorrect(userInput, correctAnswers[i])) {
                System.out.println("✅ Correct!");
                score++;
            } else {
                System.out.println("❌ Wrong! The correct answer is: " + correctAnswers[i]);
            }
        }

        // Final score
        System.out.println("\n🎉 Quiz Completed!");
        System.out.println("Your Score: " + score + "/" + questions.length);
    }
}

