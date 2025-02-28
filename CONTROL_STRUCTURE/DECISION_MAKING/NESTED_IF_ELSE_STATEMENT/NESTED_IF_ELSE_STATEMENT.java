package NESTED_IF_ELSE_STATEMENT;

import java.util.Scanner;

public class NESTED_IF_ELSE_STATEMENT {

    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static int findLargest(int num1, int num2) {
        return Math.max(num1, num2);
    }

    public static void printPrimes(int start, int end) {
        System.out.print("Prime numbers: ");
        for (int num = start; num <= end; num++) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    public static void findFactors(int num) {
        System.out.print("The factors are: ");
        for (int i = 1; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
                if (i != num / i) {
                    System.out.print((num / i) + " ");
                }
            }
        }
        System.out.println();
    }

    public static void findLCM() {
        Scanner s = new Scanner(System.in);
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        int lcm = Math.max(num1, num2);
        while (true) {
            if (lcm % num1 == 0 && lcm % num2 == 0) {
                System.out.println("The LCM is: " + lcm);
                break;
            }
            lcm++;
        }
        s.close();
    }

    public static void findGCD() {
        Scanner s = new Scanner(System.in);
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        int gcd = Math.min(num1, num2);
        while (gcd > 0) {
            if (num1 % gcd == 0 && num2 % gcd == 0) {
                System.out.println("The GCD is: " + gcd);
                break;
            }
            gcd--;
        }
        s.close();
    }

    public static void determineTriangleType() {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();

        if (a + b + c == 180) {
            if (a == 90 || b == 90 || c == 90) System.out.println("Right-Angled Triangle");
            else if (a < 90 && b < 90 && c < 90) System.out.println("Acute Triangle");
            else System.out.println("Obtuse Triangle");
        } else {
            System.out.println("Invalid Triangle");
        }
        s.close();
    }

    public static void findFibonacciInRange(int start, int end) {
        int a = 0, b = 1;
        if (a >= start && a <= end) System.out.print(a + " ");
        if (b >= start && b <= end) System.out.print(b + " ");
        int next = a + b;
        while (next <= end) {
            if (next >= start) System.out.print(next + " ");
            a = b;
            b = next;
            next = a + b;
        }
        System.out.println();
    }

    public static void printLeapYears(int start, int end) {
        for (int year = start; year <= end; year++) {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.print(year + " ");
            }
        }
        System.out.println();
    }

    public static void checkDivisibility() {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        if (num % 7 == 0) System.out.println("Divisible by 7");
        if (num % 11 == 0) System.out.println("Divisible by 11");
        else System.out.println("Not Divisible by 7 or 11");
        s.close();
    }

    public static boolean isValidDate(int day, int month, int year) {
        if (year < 1) return false;
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) daysInMonth[1] = 29;
        if (month < 1 || month > 12) return false;
        return day >= 1 && day <= daysInMonth[month - 1];
    }

    public static void printMultiplicationTable() {
        Scanner s = new Scanner(System.in);
        int range = s.nextInt();
        for (int i = 1; i <= range; i++) {
            for (int j = 1; j <= range; j++) {
                System.out.printf("%d x %d = %d\t", i, j, i * j);
            }
            System.out.println();
        }
        s.close();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a day: ");
        int day = s.nextInt();
        System.out.println("Enter a month: ");
        int month = s.nextInt();
        System.out.println("Enter a year: ");
        int year = s.nextInt();

        if (isValidDate(day, month, year)) {
            System.out.println("It is a valid date.");
        } else {
            System.out.println("It is not a valid date.");
        }
        s.close();}}