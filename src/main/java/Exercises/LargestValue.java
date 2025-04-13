package Exercises;

import java.util.Scanner;

public class LargestValue {
    public static void main(String[] args) {
        //exc68.
        Scanner in = new Scanner(System.in);

        System.out.print("Input First Value here: ");
        int first = in.nextInt();

        System.out.print("Input Second Value here: ");
        int second = in.nextInt();

        System.out.println("Result: " + result(first, second));
        System.out.println("There are common digits between Numbers from 25 to 75: " + commonDigit(first, second));
    }
    public static int result(int first, int second) {
        if (first == second) {
            return 0;
        }
        if (first % 6 == second % 6) {
            return Math.min(first, second);
        }
        return Math.max(first, second);
    }
    public static boolean commonDigit(int p, int q) {
        if (p < 25 || q > 75){
            return false;
        }
        int x = p % 10;
        int y = q % 10;

        p /= 10;
        q /= 10;

        return(p == q || p == y || x == q || x == y);
    }
}
