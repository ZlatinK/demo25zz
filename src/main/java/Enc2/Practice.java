package Enc2;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner In = new Scanner(System.in);

        int a = 25;
        int b = 39;

        if(a != b){
            System.out.print("a is not the same as b");
        } else if(a < b){
            System.out.print("a is smaller than b");
        } else{
            System.out.print("a is greater than b");
        }
    }
}

