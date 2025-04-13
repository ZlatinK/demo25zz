package Exercises;

public class DivisibleNumbers {
    public static void main(String[] args) {
        System.out.println("\nDivided By 3 : ");
        for(int i = 1; i < 100; i++){
            if(i % 3 == 0){
                System.out.print(i + ", ");
            }
        }

        System.out.println("\nDivided By 5 : ");
        for(int i = 1; i < 100; i++) {
            if(i % 5 == 0) {
                System.out.print(i + ", ");
            }
        }

        System.out.println("\nDivided By 3 & 5 : ");
        for(int i = 1; i < 100; i++) {
            if(i % 5 == 0 && i % 3 == 0) {
                System.out.print(i + ", ");
            }
        }

        System.out.println("\nDivided By 3 : ");
        printDivisibleBy(3);

        System.out.println("\nDivided By 5 : ");
        printDivisibleBy(5);

        System.out.println("\nDivided By 3 & 5 : ");
        printDivisibleByBoth(3, 5);
    }

    public static void printDivisibleBy(int divisor) {
        boolean first = true;
        for(int i = 1; i < 100; i++){
            if(i % divisor == 0) {
                if (!first) {
                    System.out.print(", ");
                }
                System.out.print(i);
                first = false;
            }
        }
        System.out.println();
    }

    public static void printDivisibleByBoth(int d1, int d2) {
        boolean first = true;
        for(int i = 1; i < 100; i++){
            if(i % d1 == 0 && i % d2 == 0){
                if (!first) {
                    System.out.print(", ");
                }
                System.out.print(i);
                first = false;
            }
        }
        System.out.println();
    }
}
