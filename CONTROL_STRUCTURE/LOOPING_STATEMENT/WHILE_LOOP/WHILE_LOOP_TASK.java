package WHILE_LOOP;

import java.util.Scanner;

public class WHILE_LOOP_TASK{

    public static void isLargestPrime(int start, int end) {
        int largestPrime = -1;
        while (end >= start) {
            if (isPrime(end)) {
                largestPrime = end;
                break;
            }
            end--;
        }
        System.out.println("Largest prime in the range: " + largestPrime);
    }

    public static void isPrimeNumbersUpToN(int n) {
        int i = 2;
        while (i <= n) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
            i++;
        }
        System.out.println();
    }

    public static boolean isPrime(int num) {
        if (num < 2) return false;
        int i = 2;
        while (i * i <= num) {
            if (num % i == 0) return false;
            i++;
        }
        return true;
    }

    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void atmMenu() {
        Scanner s = new Scanner(System.in);
        int balance = 1000, choice = 0;
        while (choice != 4) {
            System.out.println("1. Check Balance\n2. Deposit\n3. Withdraw\n4. Exit");
            choice = s.nextInt();
            if (choice == 1) {
                System.out.println("Balance: " + balance);
            } else if (choice == 2) {
                System.out.println("Enter amount to deposit:");
                balance += s.nextInt();
            } else if (choice == 3) {
                System.out.println("Enter amount to withdraw:");
                int withdraw = s.nextInt();
                if (withdraw <= balance) balance -= withdraw;
                else System.out.println("Insufficient balance");
            } else if (choice == 4) {
                System.out.println("Exiting ATM...");
            } else {
                System.out.println("Invalid choice");
            }
        }
        s.close();
    }

    public static void reverseString() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = s.nextLine();
        int i = str.length() - 1;
        while (i >= 0) {
            System.out.print(str.charAt(i));
            i--;
        }
        System.out.println();
        s.close();
    }

    public static void sumOddInRange(int start, int end) {
        int sum = 0;
        while (start <= end) {
            if (start % 2 != 0) sum += start;
            start++;
        }
        System.out.println("Sum of odd numbers: " + sum);
    }

    public static void checkPrime() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = s.nextInt();
        if (isPrime(num)) System.out.println(num + " is a prime number");
        else System.out.println(num + " is not a prime number");
        s.close();
    }

    public static void factorial() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = s.nextInt(), fact = 1, i = 1;
        while (i <= num) {
            fact *= i;
            i++;
        }
        System.out.println("Factorial: " + fact);
        s.close();
    }

    public static void printEvenInRange(int start, int end) {
        while (start <= end) {
            if (start % 2 == 0) System.out.println(start);
            start++;
        }
    }

    public static void sumEvenOddDigits() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = s.nextInt(), evenSum = 0, oddSum = 0;
        while (num > 0) {
            int digit = num % 10;
            if (digit % 2 == 0) evenSum += digit;
            else oddSum += digit;
            num /= 10;
        }
        System.out.println("Sum of even digits: " + evenSum);
        System.out.println("Sum of odd digits: " + oddSum);
        s.close();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the range start and end: ");
        int start = s.nextInt();
        int end = s.nextInt();
        isLargestPrime(start, end);
        isPrimeNumbersUpToN(end);
        System.out.println("GCD of " + start + " and " + end + " is " + findGCD(start, end));
        atmMenu();
        reverseString();
        sumOddInRange(start, end);
        checkPrime();
        factorial();
        printEvenInRange(start, end);
        sumEvenOddDigits();
        s.close();
    }
}
