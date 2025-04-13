package Exercises;
import java.util.Scanner;
import java.io.File;

public class FileFinder {
    public static void main(String[] args) {
        System.out.println("C:\\Users\\zlatin\\Desktop\\Zlatin\\KPMG.txt : " + new File ("KPMG.txt").length() + " bytes");
        System.out.println("C:\\Users\\zlatin\\Desktop\\Zlatin\\My GPA.txt : " + new File ("My GPA.txt").length() + " bytes");
        System.out.println("C:\\Users\\zlatin\\Desktop\\Zlatin\\Профил_на_Български.pdf : " + new File ("Профил_на_Български.pdf".length() + " bytes"));
    }
}
