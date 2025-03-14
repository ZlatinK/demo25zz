package org.example;

import java.util.Scanner;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class FirstClassDemo {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        System.out.println("Please enter your name");

        Scanner scanner = new Scanner(System.in);

        String userName = scanner.nextLine();

        System.out.println("Please enter your age:");

        int useAge = scanner.nextInt();

        System.out.println("Please enter your hobby:");

        Scanner scanner1 = new Scanner(System.in);

        String userHobby = scanner1.nextLine();

        String newLine = System.lineSeparator();

        System.out.println("Nice to meet you " + userName +
                ", what a wonderful age " + useAge + "!!!" + newLine +
                userHobby + ". That is a great entertainment!");
    }
}