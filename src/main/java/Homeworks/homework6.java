package Homeworks;
import java.util.regex.*;
import java.util.Scanner;

public class homework6 {
    public static boolean isValidPassword(String password) {
        if (password.length() < 8) {
            return false;
        }
        if (!password.matches(".*[a-zA-Z].*")) {
            return false;
        }
        if (!password.matches(".*\\d.*")) {
            return false;
        }
        return password.matches(".*[\\W_].*");
    }

    public static boolean checkNumbers(int a, int b, int c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            return false;
        }
        if (a == b && b == c) {
            return true;
        }
        return false;
    }

    public static double average(int a, int b) {
        return (a + b) / 2.0;
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Въведете парола: ");
        String password = scanner.nextLine();
        if (isValidPassword(password)) {
            System.out.println("Паролата е валидна.");
        } else {
            System.out.println("Паролата не е валидна.");
        }

        int num1 = 10, num2 = 20, num3 = 30;
        if (checkNumbers(num1, num2, num3)) {
            System.out.println("Числата са положителни и равни.");
        } else {
            System.out.println("Числата не са положителни или не са равни.");
        }

        double avg = average(num1, num2);
        System.out.println("Средната стойност е: " + avg);

        int sumResult = sum((int) avg, num2);
        System.out.println("Сумата на средната стойност и второто число е: " + sumResult);
    }
}