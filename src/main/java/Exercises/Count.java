package Exercises;

import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String test = "what are you eve777n doing... ! ?? @";
        count(test);

        }
        public static void count(String x) {
        char[] ch = x.toCharArray();

        int letter = 0;
        int space = 0;
        int num = 0;
        int other = 0;

        for (int i = 0; i < x.length(); i++) {
            if(Character.isLetter(ch[i])){
                letter++;
            } else if(Character.isDigit(ch[i])) {
                num++;
            } else if (Character.isSpaceChar(ch[i])){
                space++;
            } else {
                other++;
            }
        }
            System.out.println("The String is: what are you even doing... ! ?? @");

            System.out.println("letters: " + letter);
            System.out.println("space: " + space);
            System.out.println("numbers: " + num);
            System.out.println("other: " + other);
    }
}
