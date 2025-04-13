package Exercises;

import java.util.Scanner;

public class ConvertLowerCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input Text here: ");

        String line = in.nextLine();

        line = line.toLowerCase();

        System.out.println(line);
    }
}
