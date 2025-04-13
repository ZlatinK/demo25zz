package Exercises;

import java.util.Scanner;

public class SumEquals {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input first Integer: ");
        int n = in.nextInt();

        System.out.print("Input second Integer: ");
        int k = in.nextInt();

        System.out.print("Input third Integer: ");
        int j = in.nextInt();

        if(n + k == j){
            System.out.print("The result is: true ");
        } else {
            System.out.print("The result is false.");
        }
    }
}
