package Exercises;

import java.util.Scanner;

public class TimeConversion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input seconds: ");
        int second = in.nextInt();

        int S = second % 60;
        int H = second / 3600;
        int M = (second % 3600) / 60;

        System.out.printf("%02d:%02d:%02d%n", H, M, S);
    }
}
