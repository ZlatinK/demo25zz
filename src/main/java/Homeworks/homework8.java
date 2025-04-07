package Homeworks;

import java.util.Random;
import java.util.Scanner;

public class homework8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Find area of triangle using Math
        System.out.print("Input Number for a : ");
        double a = input.nextDouble();
        System.out.print("Input Number for b : ");
        double b = input.nextDouble();
        System.out.print("Input Number for c : ");
        double c = input.nextDouble();

        if(!isValidTriangle(a, b, c)){
            System.out.println("Error: sides do not make a valid Triangle!!!");
        } else {
            System.out.println("Area of Triangle using Radius is : " + areaOfTriangleWithRadius(a, b, c));

            System.out.println("Area of Triangle using Math is : " + areaOfTriangleWithMath(a, b, c));
        }



        //Method using class Random
        int[] myArray = randomNumbers(20);

        for (int num : myArray){
            System.out.print(num + " ");
        }
    }

    public static double areaOfTriangleWithMath(double a, double b, double c){
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public static double areaOfTriangleWithRadius(double a, double b, double c) {
        double p = (a + b + c) / 2;
        double area = areaOfTriangleWithMath(a, b, c);
        double r = area / p;
        return p * r;
    }

    public static boolean isValidTriangle(double a, double b, double c){
        return (a + b > c) && (a + c > b) && (b + c > a);
    }

    public static int[] randomNumbers(int length){
        Random random = new Random();
        int[] array = new int[length];

        for (int i = 0; i < length; i++){
            array[i] = random.nextInt(50,150);
        }
        return array;
    }
}
