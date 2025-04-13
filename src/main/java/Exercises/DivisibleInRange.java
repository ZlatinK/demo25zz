package Exercises;

import java.util.Scanner;

public class DivisibleInRange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input value for x: ");
        int x = in.nextInt();
        System.out.print("Input value for y: ");
        int y = in.nextInt();
        System.out.print("Input value for p: ");
        int p = in.nextInt();
        System.out.println("Count of divisible numbers: " + result(x, y, p));
    }
    public static int result(int x, int y, int p) {
        if ( x % p == 0){
            return (y / p - x / p + 1);
        }else {
            return (y / p - x / p);
        }
    }
}
