package Homeworks;

import java.util.Scanner;

public class homework1 {
    public static void main(String[] args) {

        System.out.println("Please enter your name");

        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();

        System.out.println("Please enter your age:");

        int useAge = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Please enter your hobby:");
        String userHobby = scanner.nextLine();

        System.out.println("Nice to meet you " + userName +
                ", what a wonderful age " + useAge + "!!!" + System.lineSeparator() + "Wow "
                + userHobby + " sounds really exciting!");

        scanner.close();
    }
}
