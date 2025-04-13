package Exercises;

import java.util.Scanner;

public class Integer1 {
    public static void main(String[] args) {
        int n;
        Scanner input =  new Scanner(System.in);

        System.out.print("Input number: ");
        n = input.nextInt();

        String s = "" + n;

        int nn = Integer.parseInt(s + s);
        int nnn = Integer.parseInt(s + s + s);

        int result = n + nn + nnn;

        System.out.printf("%d + %d + %d = %d\n", n, nn, nnn, result);
    }
}
