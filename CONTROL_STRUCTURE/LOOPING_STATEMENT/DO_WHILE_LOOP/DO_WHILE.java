package DO_WHILE_LOOP;
import java.util.*;

public class DO_WHILE {
    

    public static void printNumbers() {
        int i = 1;
        do {
            System.out.print(i + " ");
            i++;
        } while (i <= 10);
        System.out.println();
    }
    
    public static void sumEvenNumbers(int n) {
        int sum = 0, i = 2;
        do {
            sum += i;
            i += 2;
        } while (i <= n);
        System.out.println("Sum of even numbers: " + sum);
    }
    
    public static void printOddNumbers(int start, int end) {
        int i = start;
        do {
            if (i % 2 != 0) System.out.print(i + " ");
            i++;
        } while (i <= end);
        System.out.println();
    }
    
    public static void factorial(int num) {
        int fact = 1, i = 1;
        do {
            fact *= i;
            i++;
        } while (i <= num);
        System.out.println("Factorial: " + fact);
    }
    
    public static void reverseNumber(int num) {
        int rev = 0;
        do {
            rev = rev * 10 + num % 10;
            num /= 10;
        } while (num > 0);
        System.out.println("Reversed Number: " + rev);
    }
    
    public static void countDigits(int num) {
        int count = 0;
        do {
            num /= 10;
            count++;
        } while (num > 0);
        System.out.println("Number of Digits: " + count);
    }
    
    public static void isPrime(int num) {
        int i = 2;
        boolean prime = true;
        do {
            if (num % i == 0) {
                prime = false;
                break;
            }
            i++;
        } while (i <= Math.sqrt(num));
        System.out.println(num + " is " + (prime ? "Prime" : "Not Prime"));
    }
    
    public static void gcd(int a, int b) {
        int gcd = 1, i = 1;
        do {
            if (a % i == 0 && b % i == 0) gcd = i;
            i++;
        } while (i <= Math.min(a, b));
        System.out.println("GCD: " + gcd);
    }
    
    public static void fibonacci(int n) {
        int a = 0, b = 1, count = 0;
        do {
            System.out.print(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
            count++;
        } while (count < n);
        System.out.println();
    }
    
    public static void isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        boolean palindrome = true;
        do {
            if (str.charAt(i) != str.charAt(j)) {
                palindrome = false;
                break;
            }
            i++; j--;
        } while (i < j);
        System.out.println("Palindrome: " + palindrome);
    }
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\nMenu: Choose an option");
            System.out.println("1. Print Numbers");
            System.out.println("2. Sum of Even Numbers");
            System.out.println("3. Print Odd Numbers");
            System.out.println("4. Factorial");
            System.out.println("5. Reverse Number");
            System.out.println("6. Count Digits");
            System.out.println("7. Check Prime");
            System.out.println("8. Find GCD");
            System.out.println("9. Fibonacci Series");
            System.out.println("10. Check Palindrome");
            System.out.println("0. Exit");
            
            choice = s.nextInt();
            switch (choice) {
                case 1: printNumbers(); break;
                case 2: System.out.print("Enter N: "); sumEvenNumbers(s.nextInt()); break;
                case 3: System.out.print("Enter Range (start end): "); printOddNumbers(s.nextInt(), s.nextInt()); break;
                case 4: System.out.print("Enter Number: "); factorial(s.nextInt()); break;
                case 5: System.out.print("Enter Number: "); reverseNumber(s.nextInt()); break;
                case 6: System.out.print("Enter Number: "); countDigits(s.nextInt()); break;
                case 7: System.out.print("Enter Number: "); isPrime(s.nextInt()); break;
                case 8: System.out.print("Enter Two Numbers: "); gcd(s.nextInt(), s.nextInt()); break;
                case 9: System.out.print("Enter Terms: "); fibonacci(s.nextInt()); break;
                case 10: System.out.print("Enter String: "); isPalindrome(s.next()); break;
                case 0: System.out.println("Exiting..."); break;
                default: System.out.println("Invalid Option! Try again.");
            }
        } while (choice != 0);
        s.close();
    }}
