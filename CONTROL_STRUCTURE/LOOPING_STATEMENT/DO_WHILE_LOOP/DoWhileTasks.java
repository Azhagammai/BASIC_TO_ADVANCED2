package DO_WHILE_LOOP;

import java.util.Scanner;

public class DoWhileTasks {
    
    public static void printStarPattern(int n) {
        int i = 1;
        do {
            int j = 1;
            do {
                System.out.print("* ");
                j++;
            } while (j <= i);
            System.out.println();
            i++;
        } while (i <= n);
    }
    
    public static int sumDigits(int num) {
        int sum = 0;
        do {
            sum += num % 10;
            num /= 10;
        } while (num > 0);
        return sum;
    }
    
    public static String reverseString(String str) {
        int i = str.length() - 1;
        String rev = "";
        do {
            rev += str.charAt(i);
            i--;
        } while (i >= 0);
        return rev;
    }
    
    public static int largestPrime(int start, int end) {
        int largest = -1;
        do {
            if (isPrime(end)) {
                largest = end;
                break;
            }
            end--;
        } while (end >= start);
        return largest;
    }
    
    private static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
    
    public static void printDivisibleBy5(int start, int end) {
        do {
            if (start % 5 == 0) {
                System.out.print(start + " ");
            }
            start++;
        } while (start <= end);
        System.out.println();
    }
    
    public static int sumOfSquares(int start, int end) {
        int sum = 0;
        do {
            sum += start * start;
            start++;
        } while (start <= end);
        return sum;
    }
    
    public static void printFibonacci(int limit) {
        int a = 0, b = 1, c;
        do {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        } while (a <= limit);
        System.out.println();
    }
    
    public static boolean isPerfectNumber(int num) {
        int sum = 0, i = 1;
        do {
            if (num % i == 0) {
                sum += i;
            }
            i++;
        } while (i <= num / 2);
        return sum == num;
    }
    
    public static void findArmstrongNumbers(int start, int end) {
        do {
            if (isArmstrong(start)) {
                System.out.print(start + " ");
            }
            start++;
        } while (start <= end);
        System.out.println();
    }
    
    private static boolean isArmstrong(int num) {
        int sum = 0, temp = num, digits = String.valueOf(num).length();
        do {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        } while (temp > 0);
        return sum == num;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Example executions
        System.out.println("Star Pattern:");
        printStarPattern(5);
        
        System.out.println("Sum of digits: " + sumDigits(1234));
        System.out.println("Reversed string: " + reverseString("hello"));
        System.out.println("Largest prime: " + largestPrime(10, 50));
        
        System.out.println("Numbers divisible by 5 in range 10-50:");
        printDivisibleBy5(10, 50);
        
        System.out.println("Sum of squares: " + sumOfSquares(1, 5));
        System.out.println("Fibonacci sequence up to 20:");
        printFibonacci(20);
        
        System.out.println("Is 28 a perfect number? " + isPerfectNumber(28));
        System.out.println("Armstrong numbers in range 1-1000:");
        findArmstrongNumbers(1, 1000);
        
        sc.close();
    }
}
