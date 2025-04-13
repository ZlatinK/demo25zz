package Exercises;

import java.util.Scanner;

public class CheckEvenOrOdd {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.print("Input a number: ");
        int n = number.nextInt();
        if(n % 2 == 0){
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}
