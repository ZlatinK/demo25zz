package Exercises;

import java.nio.charset.Charset;

public class AvailableCharsets {
    public static void main(String[] args) {
        System.out.println("List of available charsets: ");

        for (String str : Charset.availableCharsets().keySet()){
            System.out.println(str);
        }
    }
}
