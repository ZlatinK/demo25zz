package Exercises;

import java.io.Console;
import java.util.Scanner;
//Ex 42.
public class InputPassword {
    public static void main(String[] args) {
        Console cons;

        if((cons = System.console()) != null) {
            char[] pass_ward = null;

            try {
                pass_ward = cons.readPassword("Input your Password here: ");

                System.out.println("Your Password was: " + new String(pass_ward));
            } finally {
                if(pass_ward != null) {
                    java.util.Arrays.fill(pass_ward, ' ');
                }
            }
        } else {
            throw new RuntimeException("Can't get the password... No console");
        }
    }
}
