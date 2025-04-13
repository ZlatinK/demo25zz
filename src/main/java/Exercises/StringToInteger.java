package Exercises;

import java.util.Scanner;

public class StringToInteger {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input first Number (as string) : ");
        String n = in.nextLine();

        try {
            int result = Integer.parseInt(n);
            System.out.printf("The Integer value is : %d%n", result);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        }
    }
}
