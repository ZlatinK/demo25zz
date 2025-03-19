package Homeworks;

import java.util.Scanner;

public class homework3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        findHighestNumber(scanner);
        calculateRectangle(scanner);
        checkEvenorOdd(scanner);
        findMonthByNumber(scanner);
        printDaysInTheMonth(scanner);

        scanner.close();
    }
    public static void findHighestNumber(Scanner scanner) {
        System.out.print("Въведете първото число: ");
        double num1 = scanner.nextDouble();

        System.out.print("Въведете второто число: ");
        double num2 = scanner.nextDouble();

        System.out.print("Въведете третото число: ");
        double num3 = scanner.nextDouble();

        double maxNumber = Math.max(num1, Math.max(num2, num3));

        System.out.println("Най-голямото число е: " + maxNumber);
    }

    public static void calculateRectangle(Scanner scanner){
            System.out.print("Въведете дължината на правоъгълника: ");
            double length = scanner.nextDouble();

            System.out.print("Въведете височината на правоъгълника: ");
            double height = scanner.nextDouble();

            double perimeter = 2 * (length + height);
            double area = length * height;

            System.out.println("Периметърът на правоъгълника е: " + perimeter);
            System.out.println("Лицето на правоъгълника е: " + area);
        }

    public static void checkEvenorOdd(Scanner scanner) {
        System.out.print("Въведете число, за да проверите дали е четно или нечетно: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("Числото " + number + " е четно.");
        } else {
            System.out.println("Числото " + number + " е нечетно.");
        }
    }
    public static void findMonthByNumber(Scanner scanner) {
        System.out.print("Въведете число от 1 до 12, за да получите съответния месец: ");
        int monthNumber = scanner.nextInt();

        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        if (monthNumber >= 1 && monthNumber <= 12) {
            System.out.println("You have selected " + monthNumber + ". The month of the year is " + months[monthNumber - 1] + ".");
        } else {
            System.out.println("Невалиден номер на месец. Моля, въведете число от 1 до 12.");
        }
    }
    public static void printDaysInTheMonth(Scanner scanner){
        System.out.print("Въведете число от 1 до 12, за да получите съответния месец и колко дни има: ");
        int monthNumber = scanner.nextInt();
        System.out.print("Въведете година: ");
        int year = scanner.nextInt();

        int daysInMonth = 0;
        String monthName = "";

        switch (monthNumber) {
            case 1:
                daysInMonth = 31;
                monthName = "January";
                break;
            case 2:
                if((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0))){
                    daysInMonth = 29;
                    monthName = "February";
                    break;
                } else {
                    daysInMonth = 28;
                    monthName = "February";
                    break;
                }
            case 3:
                daysInMonth = 31;
                monthName = "March";
                break;
            case 4:
                daysInMonth = 30;
                monthName = "April";
                break;
            case 5:
                daysInMonth = 31;
                monthName = "May";
                break;
            case 6:
                daysInMonth = 30;
                monthName = "June";
                break;
            case 7:
                daysInMonth = 31;
                monthName = "July";
                break;
            case 8:
                daysInMonth = 31;
                monthName = "August";
                break;
            case 9:
                daysInMonth = 30;
                monthName = "September";
                break;
            case 10:
                daysInMonth = 31;
                monthName = "October";
                break;
            case 11:
                daysInMonth = 30;
                monthName = "November";
                break;
            case 12:
                daysInMonth = 31;
                monthName = "December";
                break;

            default:
                System.out.println("Error: invalid Entry");
                return;
        }
        System.out.printf("Selected month is %s, it has %d days.%n" , monthName, daysInMonth);
    }
    }

