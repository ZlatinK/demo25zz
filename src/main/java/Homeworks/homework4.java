package Homeworks;
import java.util.Scanner;

public class homework4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[20];
        for (int i = 0; i < array.length; i++){
            array[i] = i * 5;
        }
        System.out.println("Масивът:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        double sum = 0;
        for (int num : array) {
            sum += num;
        }
        double average = sum / array.length;
        System.out.println("Средна стойност: " + average);

        int evenSum = 0, oddSum = 0;
        for (int num : array) {
            if (num % 2 == 0) {
                evenSum += num;
            }  else {
                oddSum += num;
            }
        }
        System.out.println("Сума на четните числа: " + evenSum);
        System.out.println("Сума на нечетните числа: " + oddSum);

        System.out.print("Въведете число N: ");
        int N = scanner.nextInt();
        printNumbers(N);

        printNumbersNotDivisibleBy3And7(N);

        System.out.println("Сума на първите " + N + " числа на Фибоначи: " + sumFibonachi(N));
    }
    public static void printNumbers(int N) {
        System.out.println("Числа от 1 до " + N + ":");
        for (int i = 1; i <= N; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void printNumbersNotDivisibleBy3And7(int N) {
        System.out.println("Числата от 1 до " + N + " които не се делят на 3 и 7:");
        for (int i = 1; i <= N; i++){
            if (i % 3 != 0 && i % 7 != 0){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    public static int sumFibonachi(int N) {
        if (N <= 0) return 0;

        int a = 0, b = 1, sum = 1;
        for (int i = 1; i < N; i++) {
            sum += a;
            int next = a + b;
            a = b;
            b = next;
        }
        return sum;
    }
}
