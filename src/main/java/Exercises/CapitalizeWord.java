package Exercises;

import java.util.Scanner;

public class CapitalizeWord {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input text here: ");

        String line = in.nextLine();
        String upperCaseLine = "";
        Scanner lineScan = new Scanner(line);
        while(lineScan.hasNext()){
            String word = lineScan.next();

            upperCaseLine += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";
        }
        System.out.println(upperCaseLine.trim());
    }
}
