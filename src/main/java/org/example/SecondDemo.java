package org.example;

import java.util.Scanner;

public class SecondDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String originalText = "My name is <Test>";

        System.out.print("Enter the replacement for <Test>: ");
        String userInput = scanner.nextLine();

        String newText = originalText.replace("<Test>", userInput);

        System.out.println("Updated text: " + newText);

        Scanner scanner1 = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String firstString = scanner1.nextLine();

        System.out.print("Enter second string: ");
        String secondString = scanner1.nextLine();

        if (firstString.equals(secondString)) {
            System.out.println("First string equals second string.");
        } else {
            System.out.println("First string does not equal second string.");
        }

        Scanner scanner2 = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner2.nextLine();

        String[] words = input.trim().split("\\s+");

        int wordCount = input.isBlank() ? 0 : words.length;

        System.out.println("Word count is: " + wordCount);

        System.out.print("Enter third string: ");
        String thirdString = scanner1.nextLine();

        String result = String.join(" ", firstString, secondString, thirdString);

        System.out.println("All strings are: " + result);

        scanner.close();
    }
}
